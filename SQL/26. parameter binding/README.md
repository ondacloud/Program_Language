# 매개변수 바인딩

## 핵심 개념

SQL 구조와 외부 입력 값을 분리합니다.

## 실행 방법

SQL 루트에서 `python run.py "26. parameter binding/example.sql" --param min_score=20`을 실행합니다. SQLite CLI에서는 `.parameter init`과 `.parameter set :min_score 20` 후 `.read`를 사용합니다.

[실습 파일](example.sql)

## 실행 예제

```sql
CREATE TABLE people (id INTEGER PRIMARY KEY, name TEXT NOT NULL, team TEXT, score INTEGER);
INSERT INTO people VALUES (1, 'Alice', 'A', 10), (2, 'Bob', 'A', 20), (3, 'Cara', 'B', 30), (4, 'Dan', NULL, NULL);
SELECT name, score FROM people WHERE score >= :min_score ORDER BY id;
```

## 예상 결과

```text
Bob | 20
Cara | 30
```

## 동작 원리와 주의사항

동봉 Python 실행기는 min_score를 바인딩합니다. 문자열을 SQL에 직접 이어 붙이지 마세요. 값 바인딩으로 테이블명·열 이름 같은 식별자를 대신할 수는 없으며 동적 식별자는 허용 목록으로 처리해야 합니다. 플레이스홀더 문법은 드라이버별로 다릅니다.



## 직접 확인하기

min_score=30과 문자열 값을 전달하고 입력 타입 검증을 어디서 할지 정하세요.

---

[전체 목차](../README.md) · [이전](../25.%20CREATE%20VIEW/README.md)
