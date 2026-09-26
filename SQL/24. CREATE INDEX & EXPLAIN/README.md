# CREATE INDEX·EXPLAIN QUERY PLAN

## 핵심 개념

조회 패턴을 지원하는 인덱스를 만들고 실행 계획으로 사용 여부를 살펴봅니다.

## 실행 방법

SQLite 3.37 이상 기준입니다. SQL 루트에서 `python run.py "24. CREATE INDEX & EXPLAIN/example.sql"`로 실행합니다. Python 표준 sqlite3로 매번 새 메모리 DB를 만들기 때문에 별도 DB 서버가 필요 없습니다. SQLite CLI에서는 `sqlite3 :memory:`를 열고 `.read "example.sql"`을 실행할 수도 있습니다(현재 작업 폴더가 이 예제 폴더일 때).

[실습 파일](example.sql)

## 실행 예제

```sql
CREATE TABLE people (id INTEGER PRIMARY KEY, name TEXT NOT NULL, team TEXT, score INTEGER);
INSERT INTO people VALUES (1, 'Alice', 'A', 10), (2, 'Bob', 'A', 20), (3, 'Cara', 'B', 30), (4, 'Dan', NULL, NULL);
CREATE INDEX idx_people_team_score ON people(team, score);
SELECT name FROM people WHERE team = 'A' AND score >= 15 ORDER BY id;
```

## 예상 결과

```text
Bob
```

## 동작 원리와 주의사항

복합 인덱스의 열 순서는 조회 조건에 영향을 줍니다. 인덱스는 저장 공간과 쓰기 비용도 추가합니다. 같은 연결에서 SELECT 앞에 EXPLAIN QUERY PLAN을 붙이면 SQLite 계획을 볼 수 있습니다. 계획 문구는 버전에 따라 달라집니다. 작은 예제의 속도로 일반 성능을 단정하지 마세요.



## 직접 확인하기

team 조건을 제거한 쿼리의 계획과 비교하세요. 인덱스가 유용한 실제 데이터 분포를 설명하세요.

---

[전체 목차](../README.md) · [이전](../23.%20BEGIN%20%26%20COMMIT%20%26%20ROLLBACK/README.md) · [다음](../25.%20CREATE%20VIEW/README.md)
