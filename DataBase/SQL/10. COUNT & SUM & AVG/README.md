# COUNT·SUM·AVG·MIN·MAX

## 핵심 개념

여러 행을 하나의 요약값으로 집계합니다.

## 실행 방법

SQLite 3.37 이상 기준입니다. DataBase 루트에서 `python lab.py SQL "10. COUNT & SUM & AVG/example.sql"`로 실행합니다. Python 표준 sqlite3의 메모리 DB를 사용하므로 별도 서버가 필요 없습니다. SQLite CLI에서는 `sqlite3 :memory:`를 열고 `.read "example.sql"`을 실행할 수도 있습니다(현재 작업 폴더가 이 예제 폴더일 때).

[실습 파일](example.sql)

## 실행 예제

```sql
CREATE TABLE people (id INTEGER PRIMARY KEY, name TEXT NOT NULL, team TEXT, score INTEGER);
INSERT INTO people VALUES (1, 'Alice', 'A', 10), (2, 'Bob', 'A', 20), (3, 'Cara', 'B', 30), (4, 'Dan', NULL, NULL);
SELECT COUNT(*), COUNT(score), SUM(score), AVG(score), MIN(score), MAX(score) FROM people;
```

## 예상 결과

```text
4 | 3 | 60 | 20.0 | 10 | 30
```

## 동작 원리와 주의사항

COUNT(*)는 행 수, COUNT(열)은 NULL이 아닌 값 수입니다. 대부분의 집계는 NULL을 제외합니다. 행이 없는 경우 COUNT는 0이지만 SUM·AVG는 NULL이므로 구분하세요. 금액을 실수형으로 다룰 때 정밀도 정책이 필요합니다.



## 직접 확인하기

WHERE 1=0을 추가해 빈 집계 결과를 확인하세요.

---

[전체 목차](../README.md) · [이전](../09.%20LIKE%20%26%20IN%20%26%20BETWEEN/README.md) · [다음](../11.%20GROUP%20BY%20%26%20HAVING/README.md)
