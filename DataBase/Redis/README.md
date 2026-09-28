# Redis

학습 기준: **7.4 / redis-cli**. 실제 명령·함수 이름을 기준으로 기초 연산 → 기록·조회 → 조건 → 반복·집계 → 수정·삭제 → 고급 기능 순서로 구성했습니다. 엔진별 기능 차이 때문에 존재하지 않는 문법을 억지로 대응시키지 않습니다.

먼저 [실습 환경](../LAB.md)을 준비하세요. 모든 실행 파일은 독립적으로 실행합니다. 예제끼리 동시에 실행하지 마세요.

| 번호 | 구문·함수 |
|---|---|
| 00 | [INCR & DECR & INCRBY](00.%20INCR%20%26%20DECR%20%26%20INCRBY/README.md) |
| 01 | [SET & GET](01.%20SET%20%26%20GET/README.md) |
| 02 | [SET NX & SET XX](02.%20SET%20NX%20%26%20SET%20XX/README.md) |
| 03 | [EXPIRE & TTL](03.%20EXPIRE%20%26%20TTL/README.md) |
| 04 | [EXISTS & TYPE & DEL](04.%20EXISTS%20%26%20TYPE%20%26%20DEL/README.md) |
| 05 | [SCAN](05.%20SCAN/README.md) |
| 06 | [HSET & HGET & HGETALL](06.%20HSET%20%26%20HGET%20%26%20HGETALL/README.md) |
| 07 | [LPUSH & RPUSH & LRANGE](07.%20LPUSH%20%26%20RPUSH%20%26%20LRANGE/README.md) |
| 08 | [SADD & SISMEMBER & SINTER](08.%20SADD%20%26%20SISMEMBER%20%26%20SINTER/README.md) |
| 09 | [ZADD & ZRANGE & ZRANK](09.%20ZADD%20%26%20ZRANGE%20%26%20ZRANK/README.md) |
| 10 | [MULTI & EXEC & DISCARD](10.%20MULTI%20%26%20EXEC%20%26%20DISCARD/README.md) |
| 11 | [WATCH & UNWATCH](11.%20WATCH%20%26%20UNWATCH/README.md) |
| 12 | [EVAL](12.%20EVAL/README.md) |
| 13 | [XADD & XRANGE & XLEN](13.%20XADD%20%26%20XRANGE%20%26%20XLEN/README.md) |

## 다음 단계

[DB별 차이와 설계](../DESIGN.md)에서 자료 모델, 입력값 바인딩, 트랜잭션, 인덱스, 백업을 확인하세요. 위 목차의 연습을 마친 뒤 학생 성적 관리 기능의 생성·조회·수정·삭제를 하나로 연결해 보세요.

[공식 문서](https://redis.io/docs/latest/commands/) · [DataBase 목차](../README.md)
