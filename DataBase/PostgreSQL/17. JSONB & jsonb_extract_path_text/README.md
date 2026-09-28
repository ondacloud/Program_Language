# JSONB & jsonb_extract_path_text

JSONB는 구조가 유동적인 JSON 값을 저장합니다. 관계형 열과 JSON을 필요한 만큼 함께 사용할 수 있습니다.

## 실행

먼저 [실습 환경](../../LAB.md)을 준비합니다. `DataBase` 폴더에서 실행하세요. 각 예제는 필요한 데이터를 직접 준비합니다.

```powershell
python lab.py PostgreSQL "17. JSONB & jsonb_extract_path_text/example.sql"
```

## 예제

```sql
SELECT jsonb_extract_path_text('{"name":"Mina","score":80}'::jsonb, 'name') AS name;
```

[실행 파일](example.sql)

## 결과 읽기

Mina가 텍스트로 반환됩니다.

## 주의사항

자주 정렬·조인하는 핵심 필드는 일반 열로 모델링하는 편이 명확할 수 있습니다. JSON null과 SQL NULL을 구분하세요.

## 연습

score를 추출하여 integer로 변환하고 5를 더하세요.

[과정 목차](../README.md) · [DataBase 목차](../../README.md)
