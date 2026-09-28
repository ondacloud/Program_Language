# ON DUPLICATE KEY UPDATE

기본 키 또는 고유 키 충돌 시 기존 행을 갱신하는 MySQL의 upsert 구문입니다.

## 실행

먼저 [실습 환경](../../LAB.md)을 준비합니다. `DataBase` 폴더에서 실행하세요. 각 예제는 필요한 데이터를 직접 준비합니다.

```powershell
python lab.py MySQL "16. ON DUPLICATE KEY UPDATE/example.sql"
```

## 예제

```sql
CREATE TEMPORARY TABLE scores (id INTEGER PRIMARY KEY, name VARCHAR(30) NOT NULL, team VARCHAR(10), score INTEGER);
INSERT INTO scores VALUES (1, 'Mina', 'A', 80), (2, 'Jin', 'A', 60), (3, 'Sol', 'B', 90);
INSERT INTO scores VALUES (1,'Mina','A',95) AS incoming ON DUPLICATE KEY UPDATE score = incoming.score;
SELECT id, name, score FROM scores WHERE id = 1;
```

[실행 파일](example.sql)

## 결과 읽기

id 1의 점수가 95로 바뀝니다.

## 주의사항

여러 UNIQUE 제약이 있으면 어떤 충돌을 처리하는지 설계를 검토하세요. PostgreSQL ON CONFLICT와 동일한 문법이 아닙니다.

## 연습

새 id 4를 사용해 INSERT 경로도 확인하세요.

[과정 목차](../README.md) · [DataBase 목차](../../README.md)
