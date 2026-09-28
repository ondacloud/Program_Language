# INCR & DECR & INCRBY

Redis는 키에 자료구조를 저장합니다. 숫자 증가 명령은 문자열로 저장된 정수를 원자적으로 갱신합니다.

## 실행

먼저 [실습 환경](../../LAB.md)을 준비합니다. `DataBase` 폴더에서 실행하세요. 각 예제는 필요한 데이터를 직접 준비합니다.

```powershell
python lab.py Redis "00. INCR & DECR & INCRBY/example.redis"
```

## 예제

```text
SET course:counter 10
INCR course:counter
DECR course:counter
INCRBY course:counter 5
GET course:counter
```

[실행 파일](example.redis)

## 결과 읽기

증가 11, 감소 10, 증가 15, 마지막 값 15입니다.

## 주의사항

GET 후 애플리케이션에서 +1하고 SET하면 동시 변경이 유실될 수 있습니다. 정수가 아닌 값에 INCR하면 오류입니다.

## 연습

INCRBY에 -3을 전달하세요.

[과정 목차](../README.md) · [DataBase 목차](../../README.md)
