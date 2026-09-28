# OVER·ROW_NUMBER·윈도 함수

## 핵심 개념

행을 유지하면서 그룹별 순위·누적값을 계산합니다.

## 실행 방법

SQLite 3.37 이상 기준입니다. DataBase 루트에서 `python lab.py SQL "19. OVER & ROW_NUMBER/example.sql"`로 실행합니다. Python 표준 sqlite3의 메모리 DB를 사용하므로 별도 서버가 필요 없습니다. SQLite CLI에서는 `sqlite3 :memory:`를 열고 `.read "example.sql"`을 실행할 수도 있습니다(현재 작업 폴더가 이 예제 폴더일 때).

[실습 파일](example.sql)

## 실행 예제

```sql
CREATE TABLE people (id INTEGER PRIMARY KEY, name TEXT NOT NULL, team TEXT, score INTEGER);
INSERT INTO people VALUES (1, 'Alice', 'A', 10), (2, 'Bob', 'A', 20), (3, 'Cara', 'B', 30), (4, 'Dan', NULL, NULL);
SELECT name,
  ROW_NUMBER() OVER (ORDER BY score DESC, id) AS rank,
  SUM(score) OVER (ORDER BY score DESC, id ROWS BETWEEN UNBOUNDED PRECEDING AND CURRENT ROW) AS running
FROM people WHERE score IS NOT NULL
ORDER BY score DESC, id;
```

## 예상 결과

```text
Cara | 1 | 30
Bob | 2 | 50
Alice | 3 | 60
```

## 동작 원리와 주의사항

GROUP BY처럼 행을 줄이지 않습니다. 윈도 내부 ORDER BY와 최종 출력 ORDER BY는 역할이 다릅니다. 동점 처리와 ROWS·RANGE 프레임 기본값을 명확히 하세요. PARTITION BY로 그룹별 계산을 할 수 있습니다.



## 직접 확인하기

동점 점수를 추가하고 ROW_NUMBER·RANK·DENSE_RANK를 비교하세요.

---

[전체 목차](../README.md) · [이전](../18.%20WITH%20RECURSIVE/README.md) · [다음](../20.%20UPDATE%20%26%20SET/README.md)
