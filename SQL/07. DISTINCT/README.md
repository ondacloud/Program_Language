# DISTINCT

## 핵심 개념

선택한 열 조합의 중복 행을 제거합니다.

## 실행 방법

SQLite 3.37 이상 기준입니다. SQL 루트에서 `python run.py "07. DISTINCT/example.sql"`로 실행합니다. Python 표준 sqlite3로 매번 새 메모리 DB를 만들기 때문에 별도 DB 서버가 필요 없습니다. SQLite CLI에서는 `sqlite3 :memory:`를 열고 `.read "example.sql"`을 실행할 수도 있습니다(현재 작업 폴더가 이 예제 폴더일 때).

[실습 파일](example.sql)

## 실행 예제

```sql
CREATE TABLE people (id INTEGER PRIMARY KEY, name TEXT NOT NULL, team TEXT, score INTEGER);
INSERT INTO people VALUES (1, 'Alice', 'A', 10), (2, 'Bob', 'A', 20), (3, 'Cara', 'B', 30), (4, 'Dan', NULL, NULL);
SELECT DISTINCT team FROM people
WHERE team IS NOT NULL ORDER BY team;
```

## 예상 결과

```text
A
B
```

## 동작 원리와 주의사항

DISTINCT는 SELECT 목록 전체 조합에 적용됩니다. 중복 조인이 잘못되었는데 DISTINCT로 결과만 숨기지 마세요. NULL 처리도 일반 = 비교와 똑같이 생각하면 안 됩니다.



## 직접 확인하기

team과 score를 함께 선택했을 때 행 수를 비교하세요.

---

[전체 목차](../README.md) · [이전](../06.%20ORDER%20BY%20%26%20LIMIT/README.md) · [다음](../08.%20IS%20NULL%20%26%20COALESCE/README.md)
