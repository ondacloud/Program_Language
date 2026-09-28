# START TRANSACTION & COMMIT & ROLLBACK

트랜잭션은 여러 변경을 하나의 작업으로 묶습니다. COMMIT은 확정, ROLLBACK은 미확정 변경을 취소합니다.

## 실행

먼저 [실습 환경](../../LAB.md)을 준비합니다. `DataBase` 폴더에서 실행하세요. 각 예제는 필요한 데이터를 직접 준비합니다.

```powershell
python lab.py MySQL "14. START TRANSACTION & COMMIT & ROLLBACK/example.sql"
```

## 예제

```sql
CREATE TEMPORARY TABLE scores (id INTEGER PRIMARY KEY, name VARCHAR(30) NOT NULL, team VARCHAR(10), score INTEGER);
INSERT INTO scores VALUES (1, 'Mina', 'A', 80), (2, 'Jin', 'A', 60), (3, 'Sol', 'B', 90);
START TRANSACTION;
UPDATE scores SET score = 0 WHERE id = 1;
ROLLBACK;
SELECT score FROM scores WHERE id = 1;
START TRANSACTION;
UPDATE scores SET score = 81 WHERE id = 1;
COMMIT;
SELECT score FROM scores WHERE id = 1;
```

[실행 파일](example.sql)

## 결과 읽기

첫 조회는 80, 두 번째 조회는 81입니다.

## 주의사항

MySQL은 InnoDB 기준입니다. MySQL의 여러 DDL은 암묵적 COMMIT을 발생시키므로 DML처럼 모두 되돌릴 수 있다고 가정하지 마세요.

## 연습

SAVEPOINT와 ROLLBACK TO SAVEPOINT를 이용해 일부 변경만 취소하세요.

[과정 목차](../README.md) · [DataBase 목차](../../README.md)
