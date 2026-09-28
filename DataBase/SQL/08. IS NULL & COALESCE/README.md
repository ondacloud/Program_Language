# IS NULL·COALESCE·NULLIF

## 핵심 개념

값이 없음을 처리하는 SQL 표현식입니다.

## 실행 방법

SQLite 3.37 이상 기준입니다. DataBase 루트에서 `python lab.py SQL "08. IS NULL & COALESCE/example.sql"`로 실행합니다. Python 표준 sqlite3의 메모리 DB를 사용하므로 별도 서버가 필요 없습니다. SQLite CLI에서는 `sqlite3 :memory:`를 열고 `.read "example.sql"`을 실행할 수도 있습니다(현재 작업 폴더가 이 예제 폴더일 때).

[실습 파일](example.sql)

## 실행 예제

```sql
CREATE TABLE people (id INTEGER PRIMARY KEY, name TEXT NOT NULL, team TEXT, score INTEGER);
INSERT INTO people VALUES (1, 'Alice', 'A', 10), (2, 'Bob', 'A', 20), (3, 'Cara', 'B', 30), (4, 'Dan', NULL, NULL);
SELECT name, COALESCE(score, 0) FROM people WHERE score IS NULL;
SELECT NULL = NULL, NULL IS NULL, NULLIF(5, 5);
```

## 예상 결과

```text
Dan | 0
NULL | 1 | NULL
```

## 동작 원리와 주의사항

NULL은 0·빈 문자열과 다릅니다. = NULL 대신 IS NULL을 사용합니다. COALESCE는 첫 번째 NULL이 아닌 값을 반환합니다. NULLIF는 두 값이 같으면 NULL을 반환합니다. 기본값을 넣기 전 결측이 의미하는 바를 정하세요.



## 직접 확인하기

0점과 NULL을 서로 다르게 표시하는 SELECT를 작성하세요.

---

[전체 목차](../README.md) · [이전](../07.%20DISTINCT/README.md) · [다음](../09.%20LIKE%20%26%20IN%20%26%20BETWEEN/README.md)
