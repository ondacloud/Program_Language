# UPDATE·SET·WHERE

## 핵심 개념

기존 행의 값을 수정합니다.

## 실행 방법

SQLite 3.37 이상 기준입니다. DataBase 루트에서 `python lab.py SQL "20. UPDATE & SET/example.sql"`로 실행합니다. Python 표준 sqlite3의 메모리 DB를 사용하므로 별도 서버가 필요 없습니다. SQLite CLI에서는 `sqlite3 :memory:`를 열고 `.read "example.sql"`을 실행할 수도 있습니다(현재 작업 폴더가 이 예제 폴더일 때).

[실습 파일](example.sql)

## 실행 예제

```sql
CREATE TABLE people (id INTEGER PRIMARY KEY, name TEXT NOT NULL, team TEXT, score INTEGER);
INSERT INTO people VALUES (1, 'Alice', 'A', 10), (2, 'Bob', 'A', 20), (3, 'Cara', 'B', 30), (4, 'Dan', NULL, NULL);
UPDATE people SET score = score + 5 WHERE id = 2;
SELECT id, name, score FROM people WHERE id = 2;
```

## 예상 결과

```text
2 | Bob | 25
```

## 동작 원리와 주의사항

WHERE가 없으면 모든 행이 대상입니다. 실제 DB에서는 같은 조건의 SELECT로 대상을 확인하고 트랜잭션과 영향 행 수를 함께 검토하세요. 이 예제는 새 메모리 DB에서만 실행됩니다.



## 직접 확인하기

존재하지 않는 id를 수정하고 영향 행 수를 확인하세요.

---

[전체 목차](../README.md) · [이전](../19.%20OVER%20%26%20ROW_NUMBER/README.md) · [다음](../21.%20DELETE%20FROM/README.md)
