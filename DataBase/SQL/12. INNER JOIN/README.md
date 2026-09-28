# INNER JOIN·ON

## 핵심 개념

결합 조건이 일치하는 행을 연결합니다.

## 실행 방법

SQLite 3.37 이상 기준입니다. DataBase 루트에서 `python lab.py SQL "12. INNER JOIN/example.sql"`로 실행합니다. Python 표준 sqlite3의 메모리 DB를 사용하므로 별도 서버가 필요 없습니다. SQLite CLI에서는 `sqlite3 :memory:`를 열고 `.read "example.sql"`을 실행할 수도 있습니다(현재 작업 폴더가 이 예제 폴더일 때).

[실습 파일](example.sql)

## 실행 예제

```sql
CREATE TABLE teams (id INTEGER PRIMARY KEY, name TEXT NOT NULL);
CREATE TABLE members (id INTEGER PRIMARY KEY, name TEXT NOT NULL, team_id INTEGER);
INSERT INTO teams VALUES (1, 'A'), (2, 'B');
INSERT INTO members VALUES (1, 'Alice', 1), (2, 'Bob', NULL);
SELECT m.name, t.name FROM members AS m
INNER JOIN teams AS t ON t.id = m.team_id ORDER BY m.id;
```

## 예상 결과

```text
Alice | A
```

## 동작 원리와 주의사항

동일한 이름의 열은 별칭으로 명확히 지정하세요. 키가 중복이면 일대다·다대다 결합으로 행 수가 늘어납니다. ON 조건을 빠뜨린 곱집합과 의도한 조인을 구별하세요.



## 직접 확인하기

같은 팀의 회원을 추가하고 행 수가 늘어나는 이유를 설명하세요.

---

[전체 목차](../README.md) · [이전](../11.%20GROUP%20BY%20%26%20HAVING/README.md) · [다음](../13.%20LEFT%20JOIN/README.md)
