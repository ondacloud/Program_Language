# SELECT·AS

## 핵심 개념

조회할 값이나 열을 지정하고 AS로 결과 열 이름을 붙입니다.

## 실행 방법

SQLite 3.37 이상 기준입니다. SQL 루트에서 `python run.py "01. SELECT & AS/example.sql"`로 실행합니다. Python 표준 sqlite3로 매번 새 메모리 DB를 만들기 때문에 별도 DB 서버가 필요 없습니다. SQLite CLI에서는 `sqlite3 :memory:`를 열고 `.read "example.sql"`을 실행할 수도 있습니다(현재 작업 폴더가 이 예제 폴더일 때).

[실습 파일](example.sql)

## 실행 예제

```sql
SELECT 'Alice' AS name, 20 AS age;
SELECT 1000 * 3 AS total;
```

## 예상 결과

```text
Alice | 20
3000
```

## 동작 원리와 주의사항

문자열 리터럴은 작은따옴표로 적습니다. SELECT *는 간단한 탐색에는 편하지만 명시적 열 목록이 인터페이스 변경에 더 안정적입니다. 동봉 실행기는 행 값을 |로 표시하며 DB 클라이언트마다 표 모양은 달라집니다.



## 직접 확인하기

`SELECT 'O''Brien';`을 실행하여 작은따옴표가 포함된 `O'Brien`을 출력해 보세요.

---

[전체 목차](../README.md) · [이전](../00.%20operator/README.md) · [다음](../02.%20CREATE%20TABLE/README.md)
