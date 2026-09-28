# EXPIRE & TTL

EXPIRE는 키의 수명을 초 단위로 정하고 TTL은 남은 수명을 조회합니다.

## 실행

먼저 [실습 환경](../../LAB.md)을 준비합니다. `DataBase` 폴더에서 실행하세요. 각 예제는 필요한 데이터를 직접 준비합니다.

```powershell
python lab.py Redis "03. EXPIRE & TTL/example.redis"
```

## 예제

```text
SET course:session token EX 60
TTL course:session
EXPIRE course:session 120
TTL course:session
```

[실행 파일](example.redis)

## 결과 읽기

TTL은 실행 시간에 따라 약 60, 약 120입니다. EXPIRE 성공 응답은 1입니다.

## 주의사항

TTL -1은 만료 없음, -2는 키 없음입니다. 일반 SET으로 덮어쓰면 기존 TTL이 제거되므로 KEEPTTL 필요 여부를 확인하세요.

## 연습

PERSIST를 실행한 뒤 TTL을 비교하세요.

[과정 목차](../README.md) · [DataBase 목차](../../README.md)
