# WITH RECURSIVE

재귀 CTE는 시작 행과 이전 결과를 참조하는 반복 항으로 구성합니다. SQL의 집합 반복을 배우는 예제입니다.

## 실행

먼저 [실습 환경](../../LAB.md)을 준비합니다. `DataBase` 폴더에서 실행하세요. 각 예제는 필요한 데이터를 직접 준비합니다.

```powershell
python lab.py PostgreSQL "11. WITH RECURSIVE/example.sql"
```

## 예제

```sql
WITH RECURSIVE nums(n) AS (SELECT 1 UNION ALL SELECT n + 1 FROM nums WHERE n < 5) SELECT n FROM nums ORDER BY n;
```

[실행 파일](example.sql)

## 결과 읽기

1부터 5까지 다섯 행입니다.

## 주의사항

종료 조건이 반드시 필요합니다. 일반 for 문처럼 각 행에 외부 부수 효과를 실행하는 방식은 아닙니다.

## 연습

1부터 10까지 생성한 뒤 SUM으로 합계를 구하세요.

[과정 목차](../README.md) · [DataBase 목차](../../README.md)
