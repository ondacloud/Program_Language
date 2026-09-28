# LIKE & IN & BETWEEN

LIKE는 문자열 패턴, IN은 후보 집합, BETWEEN은 양 끝을 포함한 범위를 검사합니다.

## 실행

먼저 [실습 환경](../../LAB.md)을 준비합니다. `DataBase` 폴더에서 실행하세요. 각 예제는 필요한 데이터를 직접 준비합니다.

```powershell
python lab.py PostgreSQL "06. LIKE & IN & BETWEEN/example.sql"
```

## 예제

```sql
CREATE TEMPORARY TABLE scores (id INTEGER PRIMARY KEY, name VARCHAR(30) NOT NULL, team VARCHAR(10), score INTEGER);
INSERT INTO scores VALUES (1, 'Mina', 'A', 80), (2, 'Jin', 'A', 60), (3, 'Sol', 'B', 90);
SELECT name FROM scores WHERE name LIKE 'M%' AND team IN ('A', 'B') AND score BETWEEN 70 AND 90;
```

[실행 파일](example.sql)

## 결과 읽기

Mina 한 행입니다.

## 주의사항

LIKE의 대소문자 처리는 엔진·collation에 따라 다릅니다. 날짜 범위는 종료 시각 미만 조건이 더 명확할 수 있습니다.

## 연습

60점과 90점도 포함되는지 확인하세요.

[과정 목차](../README.md) · [DataBase 목차](../../README.md)
