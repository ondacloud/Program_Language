# WHERE·AND·OR·NOT

## 핵심 개념

행별 조건을 만족하는 데이터만 선택합니다.

## 실행 방법

SQLite 3.37 이상 기준입니다. DataBase 루트에서 `python lab.py SQL "04. WHERE & AND & OR/example.sql"`로 실행합니다. Python 표준 sqlite3의 메모리 DB를 사용하므로 별도 서버가 필요 없습니다. SQLite CLI에서는 `sqlite3 :memory:`를 열고 `.read "example.sql"`을 실행할 수도 있습니다(현재 작업 폴더가 이 예제 폴더일 때).

[실습 파일](example.sql)

## 실행 예제

```sql
CREATE TABLE people (id INTEGER PRIMARY KEY, name TEXT NOT NULL, team TEXT, score INTEGER);
INSERT INTO people VALUES (1, 'Alice', 'A', 10), (2, 'Bob', 'A', 20), (3, 'Cara', 'B', 30), (4, 'Dan', NULL, NULL);
SELECT name, score FROM people
WHERE team = 'A' AND score >= 15
ORDER BY id;
```

## 예상 결과

```text
Bob | 20
```

## 동작 원리와 주의사항

AND는 OR보다 우선순위가 높으므로 혼합 조건은 괄호로 명시하세요. WHERE는 TRUE인 행만 남기며 FALSE와 UNKNOWN(NULL)은 제외합니다. 비교 전에 컬럼에 함수를 무조건 적용하면 인덱스 활용이 달라질 수 있습니다.



## 직접 확인하기

A팀이거나 점수가 30 이상인 조건으로 바꾸고 괄호 차이를 확인하세요.

---

[전체 목차](../README.md) · [이전](../03.%20INSERT%20INTO%20%26%20VALUES/README.md) · [다음](../05.%20CASE%20WHEN/README.md)
