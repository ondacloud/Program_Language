# 산술·비교·논리 연산자

## 핵심 개념

SQL은 행 집합을 조회·변경하는 선언형 언어입니다. 식은 SELECT·WHERE 등에서 사용합니다.

## 실행 방법

SQLite 3.37 이상 기준입니다. SQL 루트에서 `python run.py "00. operator/example.sql"`로 실행합니다. Python 표준 sqlite3로 매번 새 메모리 DB를 만들기 때문에 별도 DB 서버가 필요 없습니다. SQLite CLI에서는 `sqlite3 :memory:`를 열고 `.read "example.sql"`을 실행할 수도 있습니다(현재 작업 폴더가 이 예제 폴더일 때).

[실습 파일](example.sql)

## 실행 예제

```sql
SELECT 7 + 2, 7 / 2, 7.0 / 2, 7 % 2;
SELECT 5 > 3, 5 = 3, 5 <> 3;
SELECT (5 > 3) AND (2 < 4), NOT (5 = 3);
SELECT 'Hello' || ' SQL';
```

## 예상 결과

```text
9 | 3 | 3.5 | 1
1 | 0 | 1
1 | 1
Hello SQL
```

## 동작 원리와 주의사항

SQLite의 정수끼리 나눗셈은 정수 결과이며 논리 결과는 1·0 또는 NULL입니다. =는 동등 비교입니다. ||는 SQLite 문자열 연결이지만 DBMS에 따라 동작이 다릅니다. 0 나눗셈과 문자열·숫자 암시적 변환은 DBMS별 차이가 있으므로 의존하지 마세요.



## 직접 확인하기

괄호로 우선순위를 명확하게 하고 NULL과의 비교 결과를 확인하세요.

---

[전체 목차](../README.md) · [다음](../01.%20SELECT%20%26%20AS/README.md)
