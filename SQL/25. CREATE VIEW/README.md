# CREATE VIEW

## 핵심 개념

재사용할 조회 정의에 이름을 붙입니다.

## 실행 방법

SQLite 3.37 이상 기준입니다. SQL 루트에서 `python run.py "25. CREATE VIEW/example.sql"`로 실행합니다. Python 표준 sqlite3로 매번 새 메모리 DB를 만들기 때문에 별도 DB 서버가 필요 없습니다. SQLite CLI에서는 `sqlite3 :memory:`를 열고 `.read "example.sql"`을 실행할 수도 있습니다(현재 작업 폴더가 이 예제 폴더일 때).

[실습 파일](example.sql)

## 실행 예제

```sql
CREATE TABLE people (id INTEGER PRIMARY KEY, name TEXT NOT NULL, team TEXT, score INTEGER);
INSERT INTO people VALUES (1, 'Alice', 'A', 10), (2, 'Bob', 'A', 20), (3, 'Cara', 'B', 30), (4, 'Dan', NULL, NULL);
CREATE VIEW active_scores AS SELECT id, name, score FROM people WHERE score IS NOT NULL;
SELECT name, score FROM active_scores WHERE score >= 20 ORDER BY id;
```

## 예상 결과

```text
Bob | 20
Cara | 30
```

## 동작 원리와 주의사항

일반 view는 조회 정의이며 결과를 항상 별도로 저장하는 것은 아닙니다. SQLite view는 기본적으로 읽기 전용이고 쓰기를 지원하려면 별도 트리거 등 설계가 필요합니다. view만으로 모든 권한 통제가 해결되는 것은 아닙니다.



## 직접 확인하기

기본 테이블의 점수를 수정하고 view 결과가 바뀌는지 확인하세요.

---

[전체 목차](../README.md) · [이전](../24.%20CREATE%20INDEX%20%26%20EXPLAIN/README.md) · [다음](../26.%20parameter%20binding/README.md)
