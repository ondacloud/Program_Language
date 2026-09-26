# UNION·UNION ALL

## 핵심 개념

같은 열 구조의 조회 결과를 연결합니다.

## 실행 방법

SQLite 3.37 이상 기준입니다. SQL 루트에서 `python run.py "16. UNION & UNION ALL/example.sql"`로 실행합니다. Python 표준 sqlite3로 매번 새 메모리 DB를 만들기 때문에 별도 DB 서버가 필요 없습니다. SQLite CLI에서는 `sqlite3 :memory:`를 열고 `.read "example.sql"`을 실행할 수도 있습니다(현재 작업 폴더가 이 예제 폴더일 때).

[실습 파일](example.sql)

## 실행 예제

```sql
SELECT value FROM (SELECT 1 AS value UNION SELECT 1 UNION SELECT 2) ORDER BY value;
SELECT value FROM (SELECT 1 AS value UNION ALL SELECT 1 UNION ALL SELECT 2) ORDER BY value;
```

## 예상 결과

```text
1
2
1
1
2
```

## 동작 원리와 주의사항

UNION은 중복을 제거하고 UNION ALL은 유지합니다. 열 개수와 의미 있는 타입 대응이 필요합니다. 전체 결과 정렬은 마지막 단계에서 지정하세요. INTERSECT·EXCEPT는 교집합·차집합에 해당합니다.



## 직접 확인하기

두 조회에 값을 더해 UNION과 UNION ALL의 행 수를 비교하세요.

---

[전체 목차](../README.md) · [이전](../15.%20EXISTS%20%26%20NOT%20EXISTS/README.md) · [다음](../17.%20WITH/README.md)
