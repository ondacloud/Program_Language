# DataBase — 데이터베이스 학습

SQL 기초와 DBMS별 실제 명령을 구분합니다.

```text
DataBase/
├── SQL/             # SQLite로 실행하는 SQL 기초 27개 장
├── MySQL/           # MySQL 8.4 — 18개 장
├── PostgreSQL/      # PostgreSQL 17 — 18개 장
├── MongoDB/         # MongoDB 8.0 / mongosh — 14개 장
├── Redis/           # Redis 7.4 / redis-cli — 14개 장
├── compose.yaml
├── lab.py
├── LAB.md
├── DESIGN.md
└── README.md
```

| 과정 | 저장·질의 모델 | 시작 |
|---|---|---|
| SQL | 질의 언어의 기초; 실행 엔진은 SQLite | [27개 장](SQL/README.md) |
| MySQL | 관계형 테이블과 SQL | [구문별 목차](MySQL/README.md) |
| PostgreSQL | 관계형 테이블, SQL, JSONB | [구문별 목차](PostgreSQL/README.md) |
| MongoDB | BSON 문서와 MongoDB Query Language | [명령별 목차](MongoDB/README.md) |
| Redis | 키와 문자열·Hash·List·Set·Sorted Set·Stream | [명령별 목차](Redis/README.md) |

MongoDB와 Redis는 이 과정에서 SQL을 사용하지 않습니다. SQL의 SELECT·WHERE를 두 엔진에 그대로 입력할 수 없습니다. 각 과정의 파일명만 보고 해당 구문을 찾을 수 있도록 평면 목차를 유지했습니다.

추천 순서: SQL → MySQL 또는 PostgreSQL → MongoDB → Redis. [DB별 차이·설계·운영](DESIGN.md)을 함께 확인하세요. 각 장은 개념, 실행 파일, 결과, 주의사항, 연습으로 구성합니다.

[Software-Development 전체 목차](../README.md)
