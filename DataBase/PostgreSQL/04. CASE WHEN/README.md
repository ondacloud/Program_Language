# CASE WHEN

CASE는 조건에 따라 값을 선택하는 SQL 식입니다. Python if처럼 문장 블록을 실행하는 제어문과 다릅니다.

## 실행

먼저 [실습 환경](../../LAB.md)을 준비합니다. `DataBase` 폴더에서 실행하세요. 각 예제는 필요한 데이터를 직접 준비합니다.

```powershell
python lab.py PostgreSQL "04. CASE WHEN/example.sql"
```

## 예제

```sql
CREATE TEMPORARY TABLE scores (id INTEGER PRIMARY KEY, name VARCHAR(30) NOT NULL, team VARCHAR(10), score INTEGER);
INSERT INTO scores VALUES (1, 'Mina', 'A', 80), (2, 'Jin', 'A', 60), (3, 'Sol', 'B', 90);
SELECT name, CASE WHEN score >= 85 THEN 'high' WHEN score >= 70 THEN 'middle' ELSE 'low' END AS grade FROM scores ORDER BY id;
```

[실행 파일](example.sql)

## 결과 읽기

Mina middle, Jin low, Sol high입니다.

## 주의사항

위에서부터 처음 참인 WHEN의 값을 사용합니다. ELSE 생략 시 일치하지 않는 결과는 NULL입니다.

## 연습

70점 이상 pass, 나머지 retry로 표시하세요.

[과정 목차](../README.md) · [DataBase 목차](../../README.md)
