# CREATE INDEX & EXPLAIN

인덱스는 조회 후보를 줄이는 데 도움을 주지만 공간과 쓰기 비용이 듭니다. EXPLAIN으로 예상 실행 계획을 살펴봅니다.

## 실행

먼저 [실습 환경](../../LAB.md)을 준비합니다. `DataBase` 폴더에서 실행하세요. 각 예제는 필요한 데이터를 직접 준비합니다.

```powershell
python lab.py PostgreSQL "15. CREATE INDEX & EXPLAIN/example.sql"
```

## 예제

```sql
CREATE TEMPORARY TABLE scores (id INTEGER PRIMARY KEY, name VARCHAR(30) NOT NULL, team VARCHAR(10), score INTEGER);
INSERT INTO scores VALUES (1, 'Mina', 'A', 80), (2, 'Jin', 'A', 60), (3, 'Sol', 'B', 90);
CREATE INDEX idx_scores_score ON scores(score);
EXPLAIN SELECT name FROM scores WHERE score >= 80;
```

[실행 파일](example.sql)

## 결과 읽기

행 대신 실행 계획이 표시됩니다. 데이터가 세 행뿐이므로 인덱스 대신 전체 스캔을 선택할 수 있습니다.

## 주의사항

인덱스를 만들었다고 반드시 사용하지는 않습니다. EXPLAIN ANALYZE는 쿼리를 실제 실행하므로 변경문에 주의하세요.

## 연습

행 수가 증가하면 계획이 어떻게 달라지는지 비교하세요.

[과정 목차](../README.md) · [DataBase 목차](../../README.md)
