# WITH RECURSIVE

## 핵심 개념

기준 행에서 시작해 이전 단계 결과를 바탕으로 행을 확장합니다.

## 실행 방법

SQLite 3.37 이상 기준입니다. SQL 루트에서 `python run.py "18. WITH RECURSIVE/example.sql"`로 실행합니다. Python 표준 sqlite3로 매번 새 메모리 DB를 만들기 때문에 별도 DB 서버가 필요 없습니다. SQLite CLI에서는 `sqlite3 :memory:`를 열고 `.read "example.sql"`을 실행할 수도 있습니다(현재 작업 폴더가 이 예제 폴더일 때).

[실습 파일](example.sql)

## 실행 예제

```sql
WITH RECURSIVE numbers(n) AS (
  SELECT 1
  UNION ALL
  SELECT n + 1 FROM numbers WHERE n < 5
)
SELECT n FROM numbers ORDER BY n;
```

## 예상 결과

```text
1
2
3
4
5
```

## 동작 원리와 주의사항

기준 항과 재귀 항, 종료 조건을 분리해 이해하세요. SQLite 일반 SQL의 for 문 대체 문법이 아니라 재귀적 집합 정의입니다. 트리·그래프에서는 순환과 깊이 제한도 설계해야 합니다.



## 직접 확인하기

최댓값을 바꾸고 순환하는 데이터에서 종료 장치가 필요한 이유를 설명하세요.

---

[전체 목차](../README.md) · [이전](../17.%20WITH/README.md) · [다음](../19.%20OVER%20%26%20ROW_NUMBER/README.md)
