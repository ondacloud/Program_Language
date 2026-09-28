# operator

산술 연산자는 값을 계산하고 비교·논리 연산자는 조건을 만듭니다. NULL은 값이 없음을 나타내므로 일반 등호로 비교하지 않습니다.

## 실행

먼저 [실습 환경](../../LAB.md)을 준비합니다. `DataBase` 폴더에서 실행하세요. 각 예제는 필요한 데이터를 직접 준비합니다.

```powershell
python lab.py PostgreSQL "00. operator/example.sql"
```

## 예제

```sql
SELECT 7 + 3 AS total, 7 % 3 AS remainder, 7.0 / 2 AS quotient;
SELECT 3 > 2 AS comparison, TRUE AND FALSE AS both;
```

[실행 파일](example.sql)

## 결과 읽기

total은 10, remainder는 1, quotient는 3.5에 해당하는 소수입니다. 비교는 참, AND는 거짓입니다. 표시되는 소수 자릿수와 불리언 형식은 엔진마다 다릅니다.

## 주의사항

PostgreSQL의 정수 / 정수는 정수 나눗셈입니다. MySQL은 /와 정수 나눗셈 DIV를 구분합니다. 이식할 때 형 변환을 명시하세요.

## 연습

정수 7 / 2와 7.0 / 2를 비교하세요.

[과정 목차](../README.md) · [DataBase 목차](../../README.md)
