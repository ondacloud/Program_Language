# ON CONFLICT & RETURNING

ON CONFLICT는 고유 키 충돌 시 동작을 지정하고 RETURNING은 변경한 행을 반환합니다.

## 실행

먼저 [실습 환경](../../LAB.md)을 준비합니다. `DataBase` 폴더에서 실행하세요. 각 예제는 필요한 데이터를 직접 준비합니다.

```powershell
python lab.py PostgreSQL "16. ON CONFLICT & RETURNING/example.sql"
```

## 예제

```sql
CREATE TEMPORARY TABLE scores (id INTEGER PRIMARY KEY, name VARCHAR(30) NOT NULL, team VARCHAR(10), score INTEGER);
INSERT INTO scores VALUES (1, 'Mina', 'A', 80), (2, 'Jin', 'A', 60), (3, 'Sol', 'B', 90);
INSERT INTO scores VALUES (1,'Mina','A',95) ON CONFLICT (id) DO UPDATE SET score = EXCLUDED.score RETURNING id, name, score;
```

[실행 파일](example.sql)

## 결과 읽기

id 1의 점수가 95로 변경되고 변경한 행이 즉시 반환됩니다.

## 주의사항

충돌 대상에는 적절한 UNIQUE 또는 PRIMARY KEY 제약이 있어야 합니다. MySQL의 구문과 다릅니다.

## 연습

DO NOTHING으로 바꾸면 반환 행이 어떻게 달라지는지 확인하세요.

[과정 목차](../README.md) · [DataBase 목차](../../README.md)
