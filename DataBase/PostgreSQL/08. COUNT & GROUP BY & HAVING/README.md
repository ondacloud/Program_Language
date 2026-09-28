# COUNT & GROUP BY & HAVING

집계 함수는 여러 행을 요약합니다. WHERE는 집계 전 행을, HAVING은 집계 후 그룹을 필터링합니다.

## 실행

먼저 [실습 환경](../../LAB.md)을 준비합니다. `DataBase` 폴더에서 실행하세요. 각 예제는 필요한 데이터를 직접 준비합니다.

```powershell
python lab.py PostgreSQL "08. COUNT & GROUP BY & HAVING/example.sql"
```

## 예제

```sql
CREATE TEMPORARY TABLE scores (id INTEGER PRIMARY KEY, name VARCHAR(30) NOT NULL, team VARCHAR(10), score INTEGER);
INSERT INTO scores VALUES (1, 'Mina', 'A', 80), (2, 'Jin', 'A', 60), (3, 'Sol', 'B', 90);
SELECT team, COUNT(*) AS members, SUM(score) AS total, AVG(score) AS average FROM scores GROUP BY team HAVING COUNT(*) >= 2 ORDER BY team;
```

[실행 파일](example.sql)

## 결과 읽기

A팀만 반환되며 members 2, total 140, average 70입니다.

## 주의사항

COUNT(*)는 행 수이고 COUNT(score)는 NULL 아닌 score 수입니다. 집계되지 않은 선택 열은 GROUP BY에 포함하세요.

## 연습

팀별 최고 점수 MAX(score)를 추가하세요.

[과정 목차](../README.md) · [DataBase 목차](../../README.md)
