# UPDATE & DELETE FROM

UPDATE는 조건에 맞는 행의 값을 바꾸고 DELETE FROM은 행을 제거합니다. 먼저 같은 WHERE로 SELECT해 범위를 확인하세요.

## 실행

먼저 [실습 환경](../../LAB.md)을 준비합니다. `DataBase` 폴더에서 실행하세요. 각 예제는 필요한 데이터를 직접 준비합니다.

```powershell
python lab.py MySQL "13. UPDATE & DELETE FROM/example.sql"
```

## 예제

```sql
CREATE TEMPORARY TABLE scores (id INTEGER PRIMARY KEY, name VARCHAR(30) NOT NULL, team VARCHAR(10), score INTEGER);
INSERT INTO scores VALUES (1, 'Mina', 'A', 80), (2, 'Jin', 'A', 60), (3, 'Sol', 'B', 90);
UPDATE scores SET score = score + 5 WHERE id = 2;
DELETE FROM scores WHERE id = 3;
SELECT name, score FROM scores ORDER BY id;
```

[실행 파일](example.sql)

## 결과 읽기

Mina 80, Jin 65가 남습니다.

## 주의사항

WHERE가 없으면 모든 행이 대상입니다. 이 파일은 연결 전용 임시 테이블만 수정합니다.

## 연습

id 1만 100점으로 바꾼 뒤 해당 행만 삭제하세요.

[과정 목차](../README.md) · [DataBase 목차](../../README.md)
