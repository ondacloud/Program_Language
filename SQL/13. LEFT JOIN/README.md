# LEFT JOIN

## 핵심 개념

왼쪽 행을 유지하면서 오른쪽의 일치 데이터가 없으면 NULL을 채웁니다.

## 실행 방법

SQLite 3.37 이상 기준입니다. SQL 루트에서 `python run.py "13. LEFT JOIN/example.sql"`로 실행합니다. Python 표준 sqlite3로 매번 새 메모리 DB를 만들기 때문에 별도 DB 서버가 필요 없습니다. SQLite CLI에서는 `sqlite3 :memory:`를 열고 `.read "example.sql"`을 실행할 수도 있습니다(현재 작업 폴더가 이 예제 폴더일 때).

[실습 파일](example.sql)

## 실행 예제

```sql
CREATE TABLE teams (id INTEGER PRIMARY KEY, name TEXT NOT NULL);
CREATE TABLE members (id INTEGER PRIMARY KEY, name TEXT NOT NULL, team_id INTEGER);
INSERT INTO teams VALUES (1, 'A'), (2, 'B');
INSERT INTO members VALUES (1, 'Alice', 1), (2, 'Bob', NULL);
SELECT m.name, COALESCE(t.name, 'unassigned') FROM members AS m
LEFT JOIN teams AS t ON t.id = m.team_id ORDER BY m.id;
```

## 예상 결과

```text
Alice | A
Bob | unassigned
```

## 동작 원리와 주의사항

오른쪽 열의 조건을 WHERE에 넣으면 NULL 행을 제거해 외부 조인의 의미가 달라질 수 있습니다. 조건을 ON에 둘지 WHERE에 둘지 의도를 먼저 정하세요.



## 직접 확인하기

t.name 조건을 ON과 WHERE에 각각 넣어 Bob이 남는지 비교하세요.

---

[전체 목차](../README.md) · [이전](../12.%20INNER%20JOIN/README.md) · [다음](../14.%20SELECT%20subquery/README.md)
