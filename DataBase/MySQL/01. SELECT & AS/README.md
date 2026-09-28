# SELECT & AS

SELECT는 식이나 테이블의 열을 조회하고 AS는 결과 열 이름을 지정합니다. SQL은 print 대신 결과 집합을 반환합니다.

## 실행

먼저 [실습 환경](../../LAB.md)을 준비합니다. `DataBase` 폴더에서 실행하세요. 각 예제는 필요한 데이터를 직접 준비합니다.

```powershell
python lab.py MySQL "01. SELECT & AS/example.sql"
```

## 예제

```sql
CREATE TEMPORARY TABLE scores (id INTEGER PRIMARY KEY, name VARCHAR(30) NOT NULL, team VARCHAR(10), score INTEGER);
INSERT INTO scores VALUES (1, 'Mina', 'A', 80), (2, 'Jin', 'A', 60), (3, 'Sol', 'B', 90);
SELECT name AS student, score + 5 AS adjusted FROM scores ORDER BY id;
```

[실행 파일](example.sql)

## 결과 읽기

Mina 85, Jin 65, Sol 95 순으로 출력됩니다.

## 주의사항

SQL 자체의 표준 input 함수는 없습니다. 입력값은 클라이언트나 드라이버가 바인딩합니다. 열 별칭은 원본 열 이름을 바꾸지 않습니다.

## 연습

이름과 점수의 두 배를 조회하세요.

[과정 목차](../README.md) · [DataBase 목차](../../README.md)
