# EVAL

EVAL은 Lua 스크립트를 서버에서 실행합니다. 스크립트 동안 다른 명령이 끼어들지 않습니다.

## 실행

먼저 [실습 환경](../../LAB.md)을 준비합니다. `DataBase` 폴더에서 실행하세요. 각 예제는 필요한 데이터를 직접 준비합니다.

```powershell
python lab.py Redis "12. EVAL/example.redis"
```

## 예제

```text
SET course:lua 10
EVAL "local v = redis.call('INCRBY', KEYS[1], ARGV[1]); return v" 1 course:lua 5
GET course:lua
```

[실행 파일](example.redis)

## 결과 읽기

스크립트 반환값과 저장된 값이 15입니다.

## 주의사항

키는 KEYS, 입력은 ARGV로 전달하세요. 긴 스크립트는 서버를 막습니다. 스크립트 런타임 오류 역시 이전 쓰기를 자동 롤백하지 않습니다.

## 연습

증가량 ARGV를 3으로 바꾸세요.

[과정 목차](../README.md) · [DataBase 목차](../../README.md)
