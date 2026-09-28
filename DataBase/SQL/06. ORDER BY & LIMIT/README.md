# ORDER BY·LIMIT·OFFSET

## 핵심 개념

정렬 순서와 반환할 행 수를 지정합니다.

## 실행 방법

SQLite 3.37 이상 기준입니다. DataBase 루트에서 `python lab.py SQL "06. ORDER BY & LIMIT/example.sql"`로 실행합니다. Python 표준 sqlite3의 메모리 DB를 사용하므로 별도 서버가 필요 없습니다. SQLite CLI에서는 `sqlite3 :memory:`를 열고 `.read "example.sql"`을 실행할 수도 있습니다(현재 작업 폴더가 이 예제 폴더일 때).

[실습 파일](example.sql)

## 실행 예제

```sql
CREATE TABLE people (id INTEGER PRIMARY KEY, name TEXT NOT NULL, team TEXT, score INTEGER);
INSERT INTO people VALUES (1, 'Alice', 'A', 10), (2, 'Bob', 'A', 20), (3, 'Cara', 'B', 30), (4, 'Dan', NULL, NULL);
SELECT name, score FROM people
WHERE score IS NOT NULL
ORDER BY score DESC, id ASC
LIMIT 2 OFFSET 0;
```

## 예상 결과

```text
Cara | 30
Bob | 20
```

## 동작 원리와 주의사항

ORDER BY 없이는 행 반환 순서를 보장하지 않습니다. 동점에서 안정적인 순서가 필요하면 고유 키를 추가하세요. 큰 OFFSET은 비용이 커질 수 있습니다. LIMIT 문법과 NULL 정렬 기본값은 DBMS별로 다릅니다.



## 직접 확인하기

같은 점수를 추가하고 id 정렬을 제거했을 때 계약이 불명확해지는 이유를 설명하세요.

---

[전체 목차](../README.md) · [이전](../05.%20CASE%20WHEN/README.md) · [다음](../07.%20DISTINCT/README.md)
