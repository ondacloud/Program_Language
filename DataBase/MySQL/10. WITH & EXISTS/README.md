# WITH & EXISTS

WITH는 쿼리 안에서 이름 있는 중간 결과를 만듭니다. EXISTS는 서브쿼리 결과의 존재 여부를 검사합니다.

## 실행

먼저 [실습 환경](../../LAB.md)을 준비합니다. `DataBase` 폴더에서 실행하세요. 각 예제는 필요한 데이터를 직접 준비합니다.

```powershell
python lab.py MySQL "10. WITH & EXISTS/example.sql"
```

## 예제

```sql
CREATE TEMPORARY TABLE scores (id INTEGER PRIMARY KEY, name VARCHAR(30) NOT NULL, team VARCHAR(10), score INTEGER);
INSERT INTO scores VALUES (1, 'Mina', 'A', 80), (2, 'Jin', 'A', 60), (3, 'Sol', 'B', 90);
CREATE TEMPORARY TABLE active_teams (team VARCHAR(10) PRIMARY KEY);
INSERT INTO active_teams VALUES ('B');
WITH high_scores AS (SELECT name, team FROM scores WHERE score >= 85) SELECT h.name FROM high_scores h WHERE EXISTS (SELECT 1 FROM active_teams a WHERE a.team = h.team) ORDER BY h.name;
```

[실행 파일](example.sql)

## 결과 읽기

85점 이상이면서 활성 팀 B에 속한 Sol이 반환됩니다.

## 주의사항

CTE가 항상 물리적으로 임시 저장되는 것은 아닙니다. 실행 계획은 옵티마이저가 결정합니다.

## 연습

활성 팀에 A를 추가하고 기준을 75로 바꾸어 결과를 비교하세요.

[과정 목차](../README.md) · [DataBase 목차](../../README.md)
