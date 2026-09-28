# EXISTS·NOT EXISTS

## 핵심 개념

하위 조회에 행이 존재하는지 검사합니다.

## 실행 방법

SQLite 3.37 이상 기준입니다. DataBase 루트에서 `python lab.py SQL "15. EXISTS & NOT EXISTS/example.sql"`로 실행합니다. Python 표준 sqlite3의 메모리 DB를 사용하므로 별도 서버가 필요 없습니다. SQLite CLI에서는 `sqlite3 :memory:`를 열고 `.read "example.sql"`을 실행할 수도 있습니다(현재 작업 폴더가 이 예제 폴더일 때).

[실습 파일](example.sql)

## 실행 예제

```sql
CREATE TABLE teams (id INTEGER PRIMARY KEY, name TEXT NOT NULL);
CREATE TABLE members (id INTEGER PRIMARY KEY, name TEXT NOT NULL, team_id INTEGER);
INSERT INTO teams VALUES (1, 'A'), (2, 'B');
INSERT INTO members VALUES (1, 'Alice', 1), (2, 'Bob', NULL);
SELECT t.name FROM teams AS t
WHERE NOT EXISTS (SELECT 1 FROM members AS m WHERE m.team_id = t.id)
ORDER BY t.id;
```

## 예상 결과

```text
B
```

## 동작 원리와 주의사항

EXISTS는 행의 존재가 핵심이므로 SELECT 1을 관례적으로 사용합니다. NULL이 포함된 NOT IN과 NOT EXISTS는 의미가 다를 수 있습니다. 상관 조건을 빠뜨리지 마세요.



## 직접 확인하기

B팀 회원을 추가하고 결과가 없어지는지 확인하세요.

---

[전체 목차](../README.md) · [이전](../14.%20SELECT%20subquery/README.md) · [다음](../16.%20UNION%20%26%20UNION%20ALL/README.md)
