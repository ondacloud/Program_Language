# INNER JOIN & LEFT JOIN

JOIN은 연결 조건에 맞춰 테이블을 결합합니다. LEFT JOIN은 오른쪽에 대응 행이 없어도 왼쪽 행을 유지합니다.

## 실행

먼저 [실습 환경](../../LAB.md)을 준비합니다. `DataBase` 폴더에서 실행하세요. 각 예제는 필요한 데이터를 직접 준비합니다.

```powershell
python lab.py PostgreSQL "09. INNER JOIN & LEFT JOIN/example.sql"
```

## 예제

```sql
CREATE TEMPORARY TABLE scores (id INTEGER PRIMARY KEY, name VARCHAR(30) NOT NULL, team VARCHAR(10), score INTEGER);
INSERT INTO scores VALUES (1, 'Mina', 'A', 80), (2, 'Jin', 'A', 60), (3, 'Sol', 'B', 90);
CREATE TEMPORARY TABLE teams (code VARCHAR(10) PRIMARY KEY, label VARCHAR(30));
INSERT INTO teams VALUES ('A','Alpha');
SELECT s.name, t.label FROM scores s LEFT JOIN teams t ON s.team = t.code ORDER BY s.id;
```

[실행 파일](example.sql)

## 결과 읽기

Mina·Jin은 Alpha, Sol은 NULL label입니다.

## 주의사항

오른쪽 테이블 조건을 WHERE에 두면 NULL 확장 행이 제외될 수 있습니다. 일대다 관계는 결과 행을 늘립니다.

## 연습

INNER JOIN으로 바꾸고 사라지는 행을 설명하세요.

[과정 목차](../README.md) · [DataBase 목차](../../README.md)
