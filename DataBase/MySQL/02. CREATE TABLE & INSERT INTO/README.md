# CREATE TABLE & INSERT INTO

CREATE TABLE로 열·자료형·제약을 선언하고 INSERT INTO로 행을 저장합니다. 자동 생성 키는 애플리케이션에서 직접 계산하지 않습니다.

## 실행

먼저 [실습 환경](../../LAB.md)을 준비합니다. `DataBase` 폴더에서 실행하세요. 각 예제는 필요한 데이터를 직접 준비합니다.

```powershell
python lab.py MySQL "02. CREATE TABLE & INSERT INTO/example.sql"
```

## 예제

```sql
CREATE TEMPORARY TABLE students (id INTEGER AUTO_INCREMENT PRIMARY KEY, name VARCHAR(30) NOT NULL, score INTEGER CHECK (score BETWEEN 0 AND 100));
INSERT INTO students (name, score) VALUES ('Mina', 80), ('Jin', 60);
SELECT * FROM students ORDER BY id;
```

[실행 파일](example.sql)

## 결과 읽기

자동 생성된 id와 함께 Mina 80, Jin 60 두 행이 나옵니다.

## 주의사항

이 예제의 TEMPORARY 테이블은 연결이 종료되면 사라집니다. 영구 테이블과 다릅니다. MySQL AUTO_INCREMENT와 PostgreSQL IDENTITY는 서로 다른 문법입니다.

## 연습

중복되지 않는 email 열과 UNIQUE 제약을 추가하세요.

[과정 목차](../README.md) · [DataBase 목차](../../README.md)
