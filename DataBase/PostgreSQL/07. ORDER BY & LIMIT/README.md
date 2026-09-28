# ORDER BY & LIMIT

ORDER BY로 결과 순서를 정하고 LIMIT으로 반환 행 수를 제한합니다.

## 실행

먼저 [실습 환경](../../LAB.md)을 준비합니다. `DataBase` 폴더에서 실행하세요. 각 예제는 필요한 데이터를 직접 준비합니다.

```powershell
python lab.py PostgreSQL "07. ORDER BY & LIMIT/example.sql"
```

## 예제

```sql
CREATE TEMPORARY TABLE scores (id INTEGER PRIMARY KEY, name VARCHAR(30) NOT NULL, team VARCHAR(10), score INTEGER);
INSERT INTO scores VALUES (1, 'Mina', 'A', 80), (2, 'Jin', 'A', 60), (3, 'Sol', 'B', 90);
SELECT name, score FROM scores ORDER BY score DESC, id ASC LIMIT 2;
```

[실행 파일](example.sql)

## 결과 읽기

Sol 90, Mina 80 순입니다.

## 주의사항

ORDER BY가 없으면 반환 순서를 보장하지 않습니다. 동점일 때도 정렬하려면 고유한 보조 키를 추가하세요.

## 연습

두 번째 행부터 2개를 OFFSET으로 조회하세요.

[과정 목차](../README.md) · [DataBase 목차](../../README.md)
