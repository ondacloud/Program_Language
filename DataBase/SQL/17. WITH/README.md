# WITH·CTE

## 핵심 개념

중간 조회에 이름을 붙여 복잡한 SQL을 읽기 쉽게 구성합니다.

## 실행 방법

SQLite 3.37 이상 기준입니다. DataBase 루트에서 `python lab.py SQL "17. WITH/example.sql"`로 실행합니다. Python 표준 sqlite3의 메모리 DB를 사용하므로 별도 서버가 필요 없습니다. SQLite CLI에서는 `sqlite3 :memory:`를 열고 `.read "example.sql"`을 실행할 수도 있습니다(현재 작업 폴더가 이 예제 폴더일 때).

[실습 파일](example.sql)

## 실행 예제

```sql
CREATE TABLE people (id INTEGER PRIMARY KEY, name TEXT NOT NULL, team TEXT, score INTEGER);
INSERT INTO people VALUES (1, 'Alice', 'A', 10), (2, 'Bob', 'A', 20), (3, 'Cara', 'B', 30), (4, 'Dan', NULL, NULL);
WITH totals AS (
  SELECT team, SUM(score) AS total FROM people
  WHERE team IS NOT NULL GROUP BY team
)
SELECT team, total FROM totals WHERE total >= 30 ORDER BY team;
```

## 예상 결과

```text
A | 30
B | 30
```

## 동작 원리와 주의사항

CTE는 해당 문장에서만 유효한 이름입니다. 물리적으로 임시 테이블을 반드시 만든다고 가정하지 마세요. 실행 계획은 DBMS와 쿼리 최적화에 따라 달라집니다.



## 직접 확인하기

CTE를 두 단계로 나누고 같은 결과가 나오는지 확인하세요.

---

[전체 목차](../README.md) · [이전](../16.%20UNION%20%26%20UNION%20ALL/README.md) · [다음](../18.%20WITH%20RECURSIVE/README.md)
