# DELETE FROM·WHERE

## 핵심 개념

조건에 맞는 행을 삭제합니다.

## 실행 방법

SQLite 3.37 이상 기준입니다. DataBase 루트에서 `python lab.py SQL "21. DELETE FROM/example.sql"`로 실행합니다. Python 표준 sqlite3의 메모리 DB를 사용하므로 별도 서버가 필요 없습니다. SQLite CLI에서는 `sqlite3 :memory:`를 열고 `.read "example.sql"`을 실행할 수도 있습니다(현재 작업 폴더가 이 예제 폴더일 때).

[실습 파일](example.sql)

## 실행 예제

```sql
CREATE TABLE people (id INTEGER PRIMARY KEY, name TEXT NOT NULL, team TEXT, score INTEGER);
INSERT INTO people VALUES (1, 'Alice', 'A', 10), (2, 'Bob', 'A', 20), (3, 'Cara', 'B', 30), (4, 'Dan', NULL, NULL);
DELETE FROM people WHERE id = 4;
SELECT id, name FROM people ORDER BY id;
```

## 예상 결과

```text
1 | Alice
2 | Bob
3 | Cara
```

## 동작 원리와 주의사항

DELETE는 행 삭제, DROP TABLE은 테이블 구조 제거입니다. WHERE 없는 DELETE는 전체 행 삭제입니다. 실습은 새 메모리 DB에 한정하고 운영 데이터에 그대로 실행하지 마세요.



## 직접 확인하기

삭제 전후 COUNT(*)를 비교하고 ROLLBACK으로 취소하는 예제를 만드세요.

---

[전체 목차](../README.md) · [이전](../20.%20UPDATE%20%26%20SET/README.md) · [다음](../22.%20PRIMARY%20KEY%20%26%20FOREIGN%20KEY/README.md)
