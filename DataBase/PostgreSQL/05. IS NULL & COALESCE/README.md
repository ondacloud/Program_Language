# IS NULL & COALESCE

IS NULL로 결측값을 검사하고 COALESCE로 첫 번째 NULL 아닌 값을 선택합니다.

## 실행

먼저 [실습 환경](../../LAB.md)을 준비합니다. `DataBase` 폴더에서 실행하세요. 각 예제는 필요한 데이터를 직접 준비합니다.

```powershell
python lab.py PostgreSQL "05. IS NULL & COALESCE/example.sql"
```

## 예제

```sql
CREATE TEMPORARY TABLE scores (id INTEGER PRIMARY KEY, name VARCHAR(30) NOT NULL, team VARCHAR(10), score INTEGER);
INSERT INTO scores VALUES (1, 'Mina', 'A', 80), (2, 'Jin', 'A', 60), (3, 'Sol', 'B', 90);
INSERT INTO scores VALUES (4, 'Ara', NULL, NULL);
SELECT name, COALESCE(score, 0) AS display_score FROM scores WHERE score IS NULL;
```

[실행 파일](example.sql)

## 결과 읽기

Ara 0이 반환됩니다. 원본 score는 여전히 NULL입니다.

## 주의사항

표시용 0과 실제 0점은 의미가 다릅니다. NULL = NULL의 결과도 참이 아닙니다.

## 연습

NULL team을 unknown으로 표시하세요.

[과정 목차](../README.md) · [DataBase 목차](../../README.md)
