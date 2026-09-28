# DB별 차이와 설계

## 같은 목적, 다른 명령

| 목적 | MySQL / PostgreSQL | MongoDB | Redis |
|---|---|---|---|
| 저장 | INSERT INTO | insertOne | SET, HSET 등 자료형별 명령 |
| 조회·출력 | SELECT 결과 집합 | find, printjson | GET 등 명령 응답 |
| 조건 | WHERE, CASE | 조회 연산자, $cond | NX·XX, Lua, 클라이언트 분기 |
| 반복 | 재귀 CTE; 일반 처리는 집합 연산 | 커서 forEach, 파이프라인 | SCAN 커서 반복; 클라이언트 제어 |
| 집계 | GROUP BY, SUM | aggregate, $group | 카운터·자료구조 또는 애플리케이션 집계 |
| 연결 | JOIN | $lookup 또는 내장 문서 | 키 참조를 애플리케이션에서 조합 |
| 변경 | UPDATE / DELETE | updateOne / deleteOne | 자료형별 갱신 / DEL |

DB에 언어의 `input()`을 대응시키지는 않습니다. 입력은 사용자 인터페이스가 받고 드라이버가 DB에 전달합니다. MongoDB는 BSON 타입을, Redis는 문자열과 자료구조를 사용하는 별도 모델입니다.

## 자료형과 제약

금액은 MySQL·PostgreSQL에서 DECIMAL/NUMERIC처럼 정확한 십진 자료형을 검토하세요. 부동소수점은 근삿값입니다. 시간은 저장 기준 시간대와 표시 시간대를 정하고, PostgreSQL의 `timestamp with time zone`은 원래 입력의 시간대 이름을 그대로 보존하는 타입이 아니라 시점을 저장하는 타입임을 이해해야 합니다.

관계형 모델에서는 PRIMARY KEY·UNIQUE·NOT NULL·CHECK·FOREIGN KEY로 불변 조건을 DB에서도 검증합니다. 자동 증가 키는 MySQL의 `AUTO_INCREMENT`, PostgreSQL의 `GENERATED ... AS IDENTITY`처럼 다릅니다. SQLite 기초 예제를 다른 DB에 그대로 복사하면 타입·자동 증가·함수 차이 때문에 실패할 수 있습니다.

MongoDB는 함께 조회·갱신할 데이터는 내장 문서, 독립적으로 커지는 데이터는 참조 모델을 검토합니다. `$jsonSchema` 검증과 고유 인덱스로 문서 규칙을 강화할 수 있습니다. Redis는 접근 패턴에 맞춰 자료구조를 고릅니다. 전체 객체 조회만 필요하면 문자열 JSON, 일부 필드 갱신이 많으면 Hash를 검토하세요.

## 입력값 바인딩

SQL 값을 f-string·문자열 연결로 붙이지 않습니다. 드라이버의 placeholder와 별도의 값 인자를 사용하세요. SQLite는 `:min_score`, MySQL Connector/Python과 psycopg는 `%s` 같은 드라이버 문법을 사용합니다. `%s`를 Python 문자열 포매팅으로 처리하라는 뜻이 아닙니다.

```python
# 열린 연결의 cursor가 있다고 가정한 호출 형태입니다.
cursor.execute("SELECT name FROM students WHERE score >= %s", (70,))
```

테이블명·정렬 방향 같은 식별자는 값 placeholder로 대체할 수 없습니다. 허용 목록과 드라이버의 식별자 인용 API를 사용하세요. MongoDB에서도 외부 JSON을 쿼리 필터로 그대로 받으면 의도하지 않은 연산자가 들어올 수 있으므로 스키마·타입·허용 필드를 검증합니다. Redis 명령도 클라이언트 API의 분리된 인자로 전달합니다.

## 트랜잭션과 동시성

관계형 DB는 트랜잭션 안의 여러 DML을 COMMIT 또는 ROLLBACK으로 처리합니다. 격리 수준과 잠금에 따라 다른 연결에서 보이는 값과 동시 갱신 동작이 달라집니다. InnoDB의 기본 격리 수준은 REPEATABLE READ, PostgreSQL의 기본은 READ COMMITTED입니다. 교착 상태나 직렬화 실패에는 전체 트랜잭션 재시도가 필요할 수 있습니다. MySQL의 여러 DDL은 암묵적 COMMIT을 일으킵니다.

MongoDB의 단일 문서 변경은 원자적입니다. 다중 문서 트랜잭션에는 replica set 또는 sharded cluster가 필요합니다. 이 실습의 standalone 서버에서는 다중 문서 트랜잭션을 실행하지 않습니다. `startSession()`·`withTransaction()` 학습에는 별도 replica set 구성이 필요합니다. DocumentDB는 MongoDB 자체가 아니므로 서비스의 호환성과 연결 옵션을 별도로 확인하세요.

Redis의 MULTI/EXEC은 큐에 넣은 명령을 연속 실행합니다. 실행 중 개별 명령 오류가 발생해도 이미 실행한 쓰기를 롤백하지 않습니다. WATCH는 경쟁 변경을 감지하면 EXEC을 중단하며 애플리케이션이 재시도합니다. 클라이언트 pipeline은 왕복 횟수를 줄이는 기능으로, 원자적 실행과 같지 않습니다.

## 인덱스와 조회 비용

자주 쓰는 WHERE·정렬·JOIN 조건을 기준으로 인덱스를 설계하고 실제 실행 계획과 데이터 분포로 확인하세요. 복합 인덱스의 열 순서, 선택도, 반환 행 수가 영향을 줍니다. 인덱스가 많으면 INSERT·UPDATE·DELETE 비용과 공간이 증가합니다. 작은 예제의 실행 계획을 운영 데이터에 그대로 적용하지 마세요.

Redis의 키 조회는 SQL 테이블 스캔과 같은 모델이 아닙니다. 키를 찾기 위해 전체 SCAN을 매 요청마다 수행하기보다 필요한 키를 직접 계산할 수 있게 설계합니다. 캐시는 TTL·무효화·캐시 미스 시 원본 조회·동시 만료에 대한 정책을 함께 정해야 합니다.

## 백업·복원과 권한

DB의 복제본이나 Redis AOF만으로 독립적인 백업 전략이 완성되지는 않습니다. MySQL은 mysqldump 등의 논리 백업, PostgreSQL은 pg_dump/pg_restore, MongoDB는 mongodump/mongorestore, Redis는 RDB/AOF 보존 정책을 검토하세요. 데이터 크기와 복구 목표에 따라 물리 백업과 시점 복구가 필요할 수 있습니다. 별도 테스트 인스턴스에서 복원하고 행 수·대표 질의·권한을 검증하세요.

애플리케이션 계정은 필요한 DB와 작업에만 권한을 부여합니다. 관리자 계정을 일반 앱에 사용하지 않고 자격 증명은 환경 변수나 비밀 관리 도구로 전달합니다. 네트워크 접근 제어·TLS·백업 접근 권한을 운영 환경에 맞게 설정합니다.

## 공식 참고 문서

- [MySQL 8.4 매뉴얼](https://dev.mysql.com/doc/refman/8.4/en/)
- [MySQL 암묵적 COMMIT](https://dev.mysql.com/doc/refman/8.4/en/implicit-commit.html)
- [PostgreSQL 17 SQL](https://www.postgresql.org/docs/17/sql.html)
- [PostgreSQL 트랜잭션 격리](https://www.postgresql.org/docs/17/transaction-iso.html)
- [MongoDB CRUD](https://www.mongodb.com/docs/manual/crud/)
- [MongoDB 트랜잭션 환경](https://www.mongodb.com/docs/manual/core/transactions-production-consideration/)
- [Redis 명령 목록](https://redis.io/docs/latest/commands/)
- [Redis 트랜잭션](https://redis.io/docs/latest/develop/using-commands/transactions/)

[목차](README.md)
