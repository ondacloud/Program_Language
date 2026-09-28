# JSON_EXTRACT & JSON_UNQUOTE

JSON_EXTRACT는 JSON 경로로 값을 찾고 JSON_UNQUOTE는 JSON 문자열의 따옴표를 제거합니다.

## 실행

먼저 [실습 환경](../../LAB.md)을 준비합니다. `DataBase` 폴더에서 실행하세요. 각 예제는 필요한 데이터를 직접 준비합니다.

```powershell
python lab.py MySQL "17. JSON_EXTRACT & JSON_UNQUOTE/example.sql"
```

## 예제

```sql
SELECT JSON_UNQUOTE(JSON_EXTRACT('{"name":"Mina","score":80}', '$.name')) AS name;
```

[실행 파일](example.sql)

## 결과 읽기

Mina가 반환됩니다.

## 주의사항

$.name은 JSON 경로입니다. JSON 문자열 결과와 일반 SQL 문자열은 다릅니다.

## 연습

$.score를 추출해 숫자 계산에 사용하세요.

[과정 목차](../README.md) · [DataBase 목차](../../README.md)
