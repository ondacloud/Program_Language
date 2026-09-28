# SCAN

SCAN은 커서를 이용해 키 공간을 조금씩 순회합니다. COUNT는 정확한 개수가 아니라 작업량 힌트입니다.

## 실행

먼저 [실습 환경](../../LAB.md)을 준비합니다. `DataBase` 폴더에서 실행하세요. 각 예제는 필요한 데이터를 직접 준비합니다.

```powershell
python lab.py Redis "05. SCAN/example.redis"
```

## 예제

```text
SET course:scan:a 1
SET course:scan:b 2
SCAN 0 MATCH course:scan:* COUNT 100
```

[실행 파일](example.redis)

## 결과 읽기

다음 커서와 일치하는 키 일부가 반환됩니다. 키 순서는 보장되지 않습니다.

## 주의사항

반환 커서가 0이 될 때까지 반복해야 전체 순회입니다. 중복 키가 나올 수 있으므로 클라이언트는 중복을 처리하세요. KEYS *를 운영 DB에 무심코 사용하지 마세요.

## 연습

반환된 커서를 다음 SCAN의 첫 인자로 넣어 완료하세요.

[과정 목차](../README.md) · [DataBase 목차](../../README.md)
