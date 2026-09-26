# CASE·WHEN·THEN·ELSE·END

## 핵심 개념

조건에 따라 결과 값을 선택하는 표현식입니다.

## 실행 방법

SQLite 3.37 이상 기준입니다. SQL 루트에서 `python run.py "05. CASE WHEN/example.sql"`로 실행합니다. Python 표준 sqlite3로 매번 새 메모리 DB를 만들기 때문에 별도 DB 서버가 필요 없습니다. SQLite CLI에서는 `sqlite3 :memory:`를 열고 `.read "example.sql"`을 실행할 수도 있습니다(현재 작업 폴더가 이 예제 폴더일 때).

[실습 파일](example.sql)

## 실행 예제

```sql
CREATE TABLE people (id INTEGER PRIMARY KEY, name TEXT NOT NULL, team TEXT, score INTEGER);
INSERT INTO people VALUES (1, 'Alice', 'A', 10), (2, 'Bob', 'A', 20), (3, 'Cara', 'B', 30), (4, 'Dan', NULL, NULL);
SELECT name,
  CASE WHEN score IS NULL THEN 'missing'
       WHEN score >= 20 THEN 'pass'
       ELSE 'retry' END AS result
FROM people ORDER BY id;
```

## 예상 결과

```text
Alice | retry
Bob | pass
Cara | pass
Dan | missing
```

## 동작 원리와 주의사항

CASE는 일반 프로그램의 if 문장과 달리 하나의 값을 만드는 식입니다. ELSE를 생략하고 어느 조건도 맞지 않으면 NULL입니다. SQLite 일반 SQL에는 절차형 IF·FOR 문이 없으며 다른 DB의 저장 프로시저 문법과 구별해야 합니다.



## 직접 확인하기

경계 점수 19·20과 NULL을 각각 분류하세요.

---

[전체 목차](../README.md) · [이전](../04.%20WHERE%20%26%20AND%20%26%20OR/README.md) · [다음](../06.%20ORDER%20BY%20%26%20LIMIT/README.md)
