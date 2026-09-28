# SQL 학습 가이드

**학습 기준: SQLite 3.37 이상.** 

분류용 상위 폴더 없이 실제 문법·함수 이름으로 배치했습니다. 각 장은 개념 → 실행 파일 → 결과 → 주의사항 → 연습 순서입니다. 세부 예제는 독립적으로 실행하고 한 파일에 합치지 마세요.

## 준비와 실행

SQL은 언어이고 SQLite는 이를 실행하는 DBMS입니다. 여기서는 재현이 쉬운 SQLite를 기준으로 작성했습니다.

## 목차

| 번호 | 문법·함수 | 내용 |
|---|---|---|
| 00 | [operator](00.%20operator/README.md) | 산술·비교·논리 연산자 |
| 01 | [SELECT & AS](01.%20SELECT%20%26%20AS/README.md) | SELECT·AS |
| 02 | [CREATE TABLE](02.%20CREATE%20TABLE/README.md) | CREATE TABLE·자료형 |
| 03 | [INSERT INTO & VALUES](03.%20INSERT%20INTO%20%26%20VALUES/README.md) | INSERT INTO·VALUES |
| 04 | [WHERE & AND & OR](04.%20WHERE%20%26%20AND%20%26%20OR/README.md) | WHERE·AND·OR·NOT |
| 05 | [CASE WHEN](05.%20CASE%20WHEN/README.md) | CASE·WHEN·THEN·ELSE·END |
| 06 | [ORDER BY & LIMIT](06.%20ORDER%20BY%20%26%20LIMIT/README.md) | ORDER BY·LIMIT·OFFSET |
| 07 | [DISTINCT](07.%20DISTINCT/README.md) | DISTINCT |
| 08 | [IS NULL & COALESCE](08.%20IS%20NULL%20%26%20COALESCE/README.md) | IS NULL·COALESCE·NULLIF |
| 09 | [LIKE & IN & BETWEEN](09.%20LIKE%20%26%20IN%20%26%20BETWEEN/README.md) | LIKE·IN·BETWEEN |
| 10 | [COUNT & SUM & AVG](10.%20COUNT%20%26%20SUM%20%26%20AVG/README.md) | COUNT·SUM·AVG·MIN·MAX |
| 11 | [GROUP BY & HAVING](11.%20GROUP%20BY%20%26%20HAVING/README.md) | GROUP BY·HAVING |
| 12 | [INNER JOIN](12.%20INNER%20JOIN/README.md) | INNER JOIN·ON |
| 13 | [LEFT JOIN](13.%20LEFT%20JOIN/README.md) | LEFT JOIN |
| 14 | [SELECT subquery](14.%20SELECT%20subquery/README.md) | 서브쿼리 |
| 15 | [EXISTS & NOT EXISTS](15.%20EXISTS%20%26%20NOT%20EXISTS/README.md) | EXISTS·NOT EXISTS |
| 16 | [UNION & UNION ALL](16.%20UNION%20%26%20UNION%20ALL/README.md) | UNION·UNION ALL |
| 17 | [WITH](17.%20WITH/README.md) | WITH·CTE |
| 18 | [WITH RECURSIVE](18.%20WITH%20RECURSIVE/README.md) | WITH RECURSIVE |
| 19 | [OVER & ROW_NUMBER](19.%20OVER%20%26%20ROW_NUMBER/README.md) | OVER·ROW_NUMBER·윈도 함수 |
| 20 | [UPDATE & SET](20.%20UPDATE%20%26%20SET/README.md) | UPDATE·SET·WHERE |
| 21 | [DELETE FROM](21.%20DELETE%20FROM/README.md) | DELETE FROM·WHERE |
| 22 | [PRIMARY KEY & FOREIGN KEY](22.%20PRIMARY%20KEY%20%26%20FOREIGN%20KEY/README.md) | PRIMARY KEY·UNIQUE·CHECK·FOREIGN KEY |
| 23 | [BEGIN & COMMIT & ROLLBACK](23.%20BEGIN%20%26%20COMMIT%20%26%20ROLLBACK/README.md) | 트랜잭션 |
| 24 | [CREATE INDEX & EXPLAIN](24.%20CREATE%20INDEX%20%26%20EXPLAIN/README.md) | CREATE INDEX·EXPLAIN QUERY PLAN |
| 25 | [CREATE VIEW](25.%20CREATE%20VIEW/README.md) | CREATE VIEW |
| 26 | [parameter binding](26.%20parameter%20binding/README.md) | 매개변수 바인딩 |

## 학습 방법

값을 바꾸기 전에 결과를 예측하고 정상·빈 입력·경계값·잘못된 입력을 확인하세요. 먼저 번호순으로 문법을 익힌 뒤 아래 종합 실습으로 연결합니다.

[종합 실습](PRACTICE.md)

## 공식 참고 자료

- [SQLite SQL 문법](https://www.sqlite.org/lang.html)
- [SQLite 자료형](https://www.sqlite.org/datatype3.html)
- [SQLite STRICT 테이블](https://www.sqlite.org/stricttables.html)
- [Python sqlite3](https://docs.python.org/3/library/sqlite3.html)

[전체 목차](../README.md)

실행 방법: [공통 실습 안내](../LAB.md). 예: `python lab.py SQL "00. operator/example.sql"`.
