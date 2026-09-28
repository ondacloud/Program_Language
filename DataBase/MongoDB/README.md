# MongoDB

학습 기준: **8.0 / mongosh**. 실제 명령·함수 이름을 기준으로 기초 연산 → 기록·조회 → 조건 → 반복·집계 → 수정·삭제 → 고급 기능 순서로 구성했습니다. 엔진별 기능 차이 때문에 존재하지 않는 문법을 억지로 대응시키지 않습니다.

먼저 [실습 환경](../LAB.md)을 준비하세요. 모든 실행 파일은 독립적으로 실행합니다. 예제끼리 동시에 실행하지 마세요.

| 번호 | 구문·함수 |
|---|---|
| 00 | [$eq & $gt & $and](00.%20%24eq%20%26%20%24gt%20%26%20%24and/README.md) |
| 01 | [printjson & find](01.%20printjson%20%26%20find/README.md) |
| 02 | [insertOne & insertMany](02.%20insertOne%20%26%20insertMany/README.md) |
| 03 | [find & projection](03.%20find%20%26%20projection/README.md) |
| 04 | [$exists & null](04.%20%24exists%20%26%20null/README.md) |
| 05 | [$cond & $switch](05.%20%24cond%20%26%20%24switch/README.md) |
| 06 | [sort & limit & skip](06.%20sort%20%26%20limit%20%26%20skip/README.md) |
| 07 | [forEach](07.%20forEach/README.md) |
| 08 | [updateOne & $set & $inc](08.%20updateOne%20%26%20%24set%20%26%20%24inc/README.md) |
| 09 | [deleteOne & deleteMany](09.%20deleteOne%20%26%20deleteMany/README.md) |
| 10 | [aggregate & $group](10.%20aggregate%20%26%20%24group/README.md) |
| 11 | [$unwind & $lookup](11.%20%24unwind%20%26%20%24lookup/README.md) |
| 12 | [createIndex & explain](12.%20createIndex%20%26%20explain/README.md) |
| 13 | [updateOne & upsert](13.%20updateOne%20%26%20upsert/README.md) |

## 다음 단계

[DB별 차이와 설계](../DESIGN.md)에서 자료 모델, 입력값 바인딩, 트랜잭션, 인덱스, 백업을 확인하세요. 위 목차의 연습을 마친 뒤 학생 성적 관리 기능의 생성·조회·수정·삭제를 하나로 연결해 보세요.

[공식 문서](https://www.mongodb.com/docs/manual/crud/) · [DataBase 목차](../README.md)
