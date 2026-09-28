# OVER & ROW_NUMBER

윈도 함수는 행을 유지하면서 그룹별 순위나 집계를 계산합니다.

## 실행

먼저 [실습 환경](../../LAB.md)을 준비합니다. `DataBase` 폴더에서 실행하세요. 각 예제는 필요한 데이터를 직접 준비합니다.

```powershell
python lab.py MySQL "12. OVER & ROW_NUMBER/example.sql"
```

## 예제

```sql
CREATE TEMPORARY TABLE scores (id INTEGER PRIMARY KEY, name VARCHAR(30) NOT NULL, team VARCHAR(10), score INTEGER);
INSERT INTO scores VALUES (1, 'Mina', 'A', 80), (2, 'Jin', 'A', 60), (3, 'Sol', 'B', 90);
SELECT name, team, ROW_NUMBER() OVER (PARTITION BY team ORDER BY score DESC, id) AS position FROM scores ORDER BY team, position;
```

[실행 파일](example.sql)

## 결과 읽기

A팀 Mina 1, Jin 2와 B팀 Sol 1입니다.

## 주의사항

ROW_NUMBER는 동점에도 다른 번호를 줍니다. 동점 공동 순위에는 RANK 또는 DENSE_RANK를 검토하세요.

## 연습

팀별 SUM(score) OVER (PARTITION BY team)을 추가하세요.

[과정 목차](../README.md) · [DataBase 목차](../../README.md)
