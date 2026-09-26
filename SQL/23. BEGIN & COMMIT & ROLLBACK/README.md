# 트랜잭션

## 핵심 개념

여러 변경을 하나의 작업 단위로 묶어 확정하거나 취소합니다.

## 실행 방법

SQLite 3.37 이상 기준입니다. SQL 루트에서 `python run.py "23. BEGIN & COMMIT & ROLLBACK/example.sql"`로 실행합니다. Python 표준 sqlite3로 매번 새 메모리 DB를 만들기 때문에 별도 DB 서버가 필요 없습니다. SQLite CLI에서는 `sqlite3 :memory:`를 열고 `.read "example.sql"`을 실행할 수도 있습니다(현재 작업 폴더가 이 예제 폴더일 때).

[실습 파일](example.sql)

## 실행 예제

```sql
CREATE TABLE accounts (id INTEGER PRIMARY KEY, balance INTEGER NOT NULL CHECK (balance >= 0));
INSERT INTO accounts VALUES (1, 100), (2, 0);
BEGIN;
UPDATE accounts SET balance = balance - 30 WHERE id = 1;
UPDATE accounts SET balance = balance + 30 WHERE id = 2;
ROLLBACK;
SELECT id, balance FROM accounts ORDER BY id;
BEGIN;
UPDATE accounts SET balance = balance - 30 WHERE id = 1;
UPDATE accounts SET balance = balance + 30 WHERE id = 2;
COMMIT;
SELECT id, balance FROM accounts ORDER BY id;
```

## 예상 결과

```text
1 | 100
2 | 0
1 | 70
2 | 30
```

## 동작 원리와 주의사항

ROLLBACK은 미확정 변경을 취소합니다. 모든 DBMS가 DDL을 동일하게 롤백하는 것은 아닙니다. 동시성·잠금·격리 수준은 DBMS별로 다르며 이 예제는 단일 연결입니다. 오류 발생 시 호출자가 롤백 정책을 명확히 해야 합니다.



## 직접 확인하기

두 번째 UPDATE에 실패를 발생시키고 자동으로 전체가 취소되는지 가정하지 말고 명시적으로 처리하세요.

---

[전체 목차](../README.md) · [이전](../22.%20PRIMARY%20KEY%20%26%20FOREIGN%20KEY/README.md) · [다음](../24.%20CREATE%20INDEX%20%26%20EXPLAIN/README.md)
