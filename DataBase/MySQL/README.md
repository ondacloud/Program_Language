# MySQL

학습 기준: **8.4 / InnoDB**. 실제 명령·함수 이름을 기준으로 기초 연산 → 기록·조회 → 조건 → 반복·집계 → 수정·삭제 → 고급 기능 순서로 구성했습니다. 엔진별 기능 차이 때문에 존재하지 않는 문법을 억지로 대응시키지 않습니다.

먼저 [실습 환경](../LAB.md)을 준비하세요. 모든 실행 파일은 독립적으로 실행합니다. 예제끼리 동시에 실행하지 마세요.

| 번호 | 구문·함수 |
|---|---|
| 00 | [operator](00.%20operator/README.md) |
| 01 | [SELECT & AS](01.%20SELECT%20%26%20AS/README.md) |
| 02 | [CREATE TABLE & INSERT INTO](02.%20CREATE%20TABLE%20%26%20INSERT%20INTO/README.md) |
| 03 | [WHERE & AND & OR](03.%20WHERE%20%26%20AND%20%26%20OR/README.md) |
| 04 | [CASE WHEN](04.%20CASE%20WHEN/README.md) |
| 05 | [IS NULL & COALESCE](05.%20IS%20NULL%20%26%20COALESCE/README.md) |
| 06 | [LIKE & IN & BETWEEN](06.%20LIKE%20%26%20IN%20%26%20BETWEEN/README.md) |
| 07 | [ORDER BY & LIMIT](07.%20ORDER%20BY%20%26%20LIMIT/README.md) |
| 08 | [COUNT & GROUP BY & HAVING](08.%20COUNT%20%26%20GROUP%20BY%20%26%20HAVING/README.md) |
| 09 | [INNER JOIN & LEFT JOIN](09.%20INNER%20JOIN%20%26%20LEFT%20JOIN/README.md) |
| 10 | [WITH & EXISTS](10.%20WITH%20%26%20EXISTS/README.md) |
| 11 | [WITH RECURSIVE](11.%20WITH%20RECURSIVE/README.md) |
| 12 | [OVER & ROW_NUMBER](12.%20OVER%20%26%20ROW_NUMBER/README.md) |
| 13 | [UPDATE & DELETE FROM](13.%20UPDATE%20%26%20DELETE%20FROM/README.md) |
| 14 | [START TRANSACTION & COMMIT & ROLLBACK](14.%20START%20TRANSACTION%20%26%20COMMIT%20%26%20ROLLBACK/README.md) |
| 15 | [CREATE INDEX & EXPLAIN](15.%20CREATE%20INDEX%20%26%20EXPLAIN/README.md) |
| 16 | [ON DUPLICATE KEY UPDATE](16.%20ON%20DUPLICATE%20KEY%20UPDATE/README.md) |
| 17 | [JSON_EXTRACT & JSON_UNQUOTE](17.%20JSON_EXTRACT%20%26%20JSON_UNQUOTE/README.md) |

## 다음 단계

[DB별 차이와 설계](../DESIGN.md)에서 자료 모델, 입력값 바인딩, 트랜잭션, 인덱스, 백업을 확인하세요. 위 목차의 연습을 마친 뒤 학생 성적 관리 기능의 생성·조회·수정·삭제를 하나로 연결해 보세요.

[공식 문서](https://dev.mysql.com/doc/refman/8.4/en/) · [DataBase 목차](../README.md)
