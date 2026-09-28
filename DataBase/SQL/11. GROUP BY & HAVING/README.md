# GROUP BY·HAVING

## 핵심 개념

그룹별로 집계하고 집계 결과에 조건을 적용합니다.

## 실행 방법

SQLite 3.37 이상 기준입니다. DataBase 루트에서 `python lab.py SQL "11. GROUP BY & HAVING/example.sql"`로 실행합니다. Python 표준 sqlite3의 메모리 DB를 사용하므로 별도 서버가 필요 없습니다. SQLite CLI에서는 `sqlite3 :memory:`를 열고 `.read "example.sql"`을 실행할 수도 있습니다(현재 작업 폴더가 이 예제 폴더일 때).

[실습 파일](example.sql)

## 실행 예제

```sql
CREATE TABLE people (id INTEGER PRIMARY KEY, name TEXT NOT NULL, team TEXT, score INTEGER);
INSERT INTO people VALUES (1, 'Alice', 'A', 10), (2, 'Bob', 'A', 20), (3, 'Cara', 'B', 30), (4, 'Dan', NULL, NULL);
SELECT team, COUNT(*) AS members, SUM(score) AS total
FROM people WHERE team IS NOT NULL
GROUP BY team HAVING SUM(score) >= 30
ORDER BY team;
```

## 예상 결과

```text
A | 2 | 30
B | 1 | 30
```

## 동작 원리와 주의사항

WHERE는 그룹화 전 행을, HAVING은 그룹화 후 결과를 거릅니다. 집계하지 않은 열은 GROUP BY에 포함하는 방식으로 명확히 작성하세요. SQLite의 느슨한 bare column 허용에 기대면 이식성과 결과 의미가 나빠집니다.



## 직접 확인하기

WHERE score>=20과 HAVING SUM(score)>=20의 차이를 비교하세요.

---

[전체 목차](../README.md) · [이전](../10.%20COUNT%20%26%20SUM%20%26%20AVG/README.md) · [다음](../12.%20INNER%20JOIN/README.md)
