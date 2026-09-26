# CREATE TABLE·자료형

## 핵심 개념

테이블의 열·타입·제약조건을 선언합니다.

## 실행 방법

SQLite 3.37 이상 기준입니다. SQL 루트에서 `python run.py "02. CREATE TABLE/example.sql"`로 실행합니다. Python 표준 sqlite3로 매번 새 메모리 DB를 만들기 때문에 별도 DB 서버가 필요 없습니다. SQLite CLI에서는 `sqlite3 :memory:`를 열고 `.read "example.sql"`을 실행할 수도 있습니다(현재 작업 폴더가 이 예제 폴더일 때).

[실습 파일](example.sql)

## 실행 예제

```sql
CREATE TABLE students (
  id INTEGER PRIMARY KEY,
  name TEXT NOT NULL,
  score INTEGER CHECK (score BETWEEN 0 AND 100)
) STRICT;
INSERT INTO students VALUES (1, 'Alice', 90);
SELECT id, name, score FROM students;
```

## 예상 결과

```text
1 | Alice | 90
```

## 동작 원리와 주의사항

STRICT는 SQLite 3.37 이상 기능입니다. SQLite의 일반 테이블 타입 친화도는 PostgreSQL 등의 엄격한 타입 검사와 다릅니다. NOT NULL·CHECK·PRIMARY KEY를 데이터 계약에 맞게 선택하세요. SQL 날짜·boolean·자동 증가 표기는 DBMS별로 다릅니다.



## 직접 확인하기

이름 NULL, 점수 101, 점수 문자 입력을 각각 시도하고 오류를 확인하세요.

---

[전체 목차](../README.md) · [이전](../01.%20SELECT%20%26%20AS/README.md) · [다음](../03.%20INSERT%20INTO%20%26%20VALUES/README.md)
