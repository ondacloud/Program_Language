# SQL 종합 실습 — 주문·고객 조회

customers·orders·order_items 테이블을 만들고 기본키·외래키·수량 제약을 정하세요. 작은 테스트 데이터를 넣고 고객별 주문 수, 주문 없는 고객, 매출 상위 고객을 조회합니다. 주문 추가를 트랜잭션으로 묶고 실패 시 롤백합니다.

완료 기준: 중복 키·없는 고객·0 이하 수량을 거부합니다. LEFT JOIN의 NULL 행, 동점 정렬, COUNT(*)와 COUNT(열) 차이를 설명하세요. 외부 입력은 바인딩하고 조회 조건에 맞는 인덱스를 EXPLAIN QUERY PLAN으로 확인합니다.

## DBMS별 차이

| 항목 | 이 과정 | 다른 DBMS로 옮길 때 |
|---|---|---|
| 실행기 | SQLite 3.37+ | 해당 서버·드라이버 준비 |
| 타입 | SQLite 친화도, STRICT 장 | PostgreSQL·MySQL·SQL Server 타입으로 재검토 |
| 자동 키 | INTEGER PRIMARY KEY | IDENTITY·AUTO_INCREMENT 등 해당 문법 확인 |
| 페이지 제한 | LIMIT·OFFSET | TOP·FETCH 등 지원 문법 확인 |
| 문자열 | 작은따옴표, 연결은 SQLite || | 연결 함수·모드·콜레이션 확인 |
| 절차형 분기·반복 | 일반 SQL에 IF·FOR 없음 | PL/pgSQL·T-SQL 등 별도 절차 언어 |
| 트랜잭션 | 단일 메모리 DB 연결 | 격리·잠금·DDL 커밋 정책 재검토 |

[목차](README.md)
