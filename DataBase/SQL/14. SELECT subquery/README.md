# 서브쿼리

## 핵심 개념

조회 결과를 다른 조회의 값·조건·테이블로 사용합니다.

## 실행 방법

SQLite 3.37 이상 기준입니다. DataBase 루트에서 `python lab.py SQL "14. SELECT subquery/example.sql"`로 실행합니다. Python 표준 sqlite3의 메모리 DB를 사용하므로 별도 서버가 필요 없습니다. SQLite CLI에서는 `sqlite3 :memory:`를 열고 `.read "example.sql"`을 실행할 수도 있습니다(현재 작업 폴더가 이 예제 폴더일 때).

[실습 파일](example.sql)

## 실행 예제

```sql
CREATE TABLE people (id INTEGER PRIMARY KEY, name TEXT NOT NULL, team TEXT, score INTEGER);
INSERT INTO people VALUES (1, 'Alice', 'A', 10), (2, 'Bob', 'A', 20), (3, 'Cara', 'B', 30), (4, 'Dan', NULL, NULL);
SELECT name, score FROM people
WHERE score > (SELECT AVG(score) FROM people)
ORDER BY id;
```

## 예상 결과

```text
Cara | 30
```

## 동작 원리와 주의사항

스칼라 서브쿼리는 값 하나를 의도합니다. 여러 행을 반환했을 때 처리 방식은 DBMS별 차이가 있으므로 유일성을 보장하세요. 상관 서브쿼리는 바깥 행을 참조하며 실행 비용을 확인해야 합니다.



## 직접 확인하기

팀별 평균보다 높은 회원을 찾도록 상관 조건을 추가하세요.

---

[전체 목차](../README.md) · [이전](../13.%20LEFT%20JOIN/README.md) · [다음](../15.%20EXISTS%20%26%20NOT%20EXISTS/README.md)
