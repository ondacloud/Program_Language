# LIKE·IN·BETWEEN

## 핵심 개념

패턴·목록 포함·범위 조건을 표현합니다.

## 실행 방법

SQLite 3.37 이상 기준입니다. DataBase 루트에서 `python lab.py SQL "09. LIKE & IN & BETWEEN/example.sql"`로 실행합니다. Python 표준 sqlite3의 메모리 DB를 사용하므로 별도 서버가 필요 없습니다. SQLite CLI에서는 `sqlite3 :memory:`를 열고 `.read "example.sql"`을 실행할 수도 있습니다(현재 작업 폴더가 이 예제 폴더일 때).

[실습 파일](example.sql)

## 실행 예제

```sql
CREATE TABLE people (id INTEGER PRIMARY KEY, name TEXT NOT NULL, team TEXT, score INTEGER);
INSERT INTO people VALUES (1, 'Alice', 'A', 10), (2, 'Bob', 'A', 20), (3, 'Cara', 'B', 30), (4, 'Dan', NULL, NULL);
SELECT name FROM people WHERE name LIKE 'A%' ORDER BY id;
SELECT name FROM people WHERE id IN (2, 3) AND score BETWEEN 20 AND 30 ORDER BY id;
```

## 예상 결과

```text
Alice
Bob
Cara
```

## 동작 원리와 주의사항

LIKE의 %는 임의 길이, _는 한 문자 패턴입니다. BETWEEN은 양쪽 끝을 포함합니다. SQLite의 LIKE는 기본적으로 ASCII 대소문자를 구분하지 않는 등 DBMS·콜레이션 차이가 있습니다. NOT IN 목록에 NULL이 있으면 예상과 달리 행이 제외될 수 있습니다.



## 직접 확인하기

NOT IN (1,NULL)과 NOT EXISTS를 비교하세요.

---

[전체 목차](../README.md) · [이전](../08.%20IS%20NULL%20%26%20COALESCE/README.md) · [다음](../10.%20COUNT%20%26%20SUM%20%26%20AVG/README.md)
