# PRIMARY KEY·UNIQUE·CHECK·FOREIGN KEY

## 핵심 개념

무결성 규칙을 DB에 선언하여 잘못된 데이터의 저장을 막습니다.

## 실행 방법

SQLite 3.37 이상 기준입니다. SQL 루트에서 `python run.py "22. PRIMARY KEY & FOREIGN KEY/example.sql"`로 실행합니다. Python 표준 sqlite3로 매번 새 메모리 DB를 만들기 때문에 별도 DB 서버가 필요 없습니다. SQLite CLI에서는 `sqlite3 :memory:`를 열고 `.read "example.sql"`을 실행할 수도 있습니다(현재 작업 폴더가 이 예제 폴더일 때).

[실습 파일](example.sql)

## 실행 예제

```sql
PRAGMA foreign_keys = ON;
CREATE TABLE parent (id INTEGER PRIMARY KEY, name TEXT UNIQUE NOT NULL);
CREATE TABLE child (
  id INTEGER PRIMARY KEY,
  parent_id INTEGER NOT NULL REFERENCES parent(id),
  quantity INTEGER NOT NULL CHECK (quantity > 0)
);
INSERT INTO parent VALUES (1, 'A');
INSERT INTO child VALUES (1, 1, 2);
SELECT id, parent_id, quantity FROM child;
```

## 예상 결과

```text
1 | 1 | 2
```

## 동작 원리와 주의사항

SQLite 외래 키 검사는 연결별 PRAGMA foreign_keys 설정을 확인해야 합니다. NOT NULL과 CHECK는 역할이 다르며 CHECK 결과가 NULL인 상황을 주의하세요. CASCADE 정책은 삭제·수정 전파 범위를 이해하고 정합니다.



## 직접 확인하기

없는 parent_id, quantity=0, 중복 name을 각각 넣고 거부되는지 확인하세요.

---

[전체 목차](../README.md) · [이전](../21.%20DELETE%20FROM/README.md) · [다음](../23.%20BEGIN%20%26%20COMMIT%20%26%20ROLLBACK/README.md)
