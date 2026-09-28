# INSERT INTO·VALUES

## 핵심 개념

열 목록과 값을 대응시켜 새 행을 추가합니다.

## 실행 방법

SQLite 3.37 이상 기준입니다. DataBase 루트에서 `python lab.py SQL "03. INSERT INTO & VALUES/example.sql"`로 실행합니다. Python 표준 sqlite3의 메모리 DB를 사용하므로 별도 서버가 필요 없습니다. SQLite CLI에서는 `sqlite3 :memory:`를 열고 `.read "example.sql"`을 실행할 수도 있습니다(현재 작업 폴더가 이 예제 폴더일 때).

[실습 파일](example.sql)

## 실행 예제

```sql
CREATE TABLE items (id INTEGER PRIMARY KEY, name TEXT NOT NULL, quantity INTEGER DEFAULT 0);
INSERT INTO items (id, name) VALUES (1, 'pen');
INSERT INTO items (id, name, quantity) VALUES (2, 'book', 3);
SELECT id, name, quantity FROM items ORDER BY id;
```

## 예상 결과

```text
1 | pen | 0
2 | book | 3
```

## 동작 원리와 주의사항

열 목록을 명시하면 테이블 열 순서 변화에 덜 취약합니다. 기본값은 열을 생략할 때 적용되며 NULL을 명시한 경우와 다릅니다. 실제 사용자 데이터는 문자열 연결이 아니라 매개변수로 전달하세요.



## 직접 확인하기

같은 기본키를 다시 넣어 오류를 확인하세요.

---

[전체 목차](../README.md) · [이전](../02.%20CREATE%20TABLE/README.md) · [다음](../04.%20WHERE%20%26%20AND%20%26%20OR/README.md)
