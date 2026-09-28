# WHERE & AND & OR

WHERE는 개별 행을 걸러냅니다. AND와 OR를 섞을 때 괄호로 의도를 표현하세요.

## 실행

먼저 [실습 환경](../../LAB.md)을 준비합니다. `DataBase` 폴더에서 실행하세요. 각 예제는 필요한 데이터를 직접 준비합니다.

```powershell
python lab.py MySQL "03. WHERE & AND & OR/example.sql"
```

## 예제

```sql
CREATE TEMPORARY TABLE scores (id INTEGER PRIMARY KEY, name VARCHAR(30) NOT NULL, team VARCHAR(10), score INTEGER);
INSERT INTO scores VALUES (1, 'Mina', 'A', 80), (2, 'Jin', 'A', 60), (3, 'Sol', 'B', 90);
SELECT name, score FROM scores WHERE (team = 'A' OR team = 'B') AND score >= 80 ORDER BY id;
```

[실행 파일](example.sql)

## 결과 읽기

Mina 80, Sol 90이 나옵니다.

## 주의사항

AND의 우선순위가 OR보다 높습니다. 사용자 입력을 문자열로 이어 붙이지 마세요.

## 연습

A팀이면서 70점 이상인 행만 조회하세요.

[과정 목차](../README.md) · [DataBase 목차](../../README.md)
