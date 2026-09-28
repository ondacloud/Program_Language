# MULTI & EXEC & DISCARD

MULTI 이후 명령을 큐에 넣고 EXEC으로 묶어서 실행합니다. DISCARD는 아직 실행되지 않은 큐를 버립니다.

## 실행

먼저 [실습 환경](../../LAB.md)을 준비합니다. `DataBase` 폴더에서 실행하세요. 각 예제는 필요한 데이터를 직접 준비합니다.

```powershell
python lab.py Redis "10. MULTI & EXEC & DISCARD/example.redis"
```

## 예제

```text
SET course:tx 10
MULTI
INCRBY course:tx 5
GET course:tx
EXEC
MULTI
SET course:tx 0
DISCARD
GET course:tx
```

[실행 파일](example.redis)

## 결과 읽기

EXEC 결과의 증가 값과 GET은 15이고 DISCARD 뒤에도 15입니다.

## 주의사항

Redis는 실행 중 명령 오류에 대해 SQL식 롤백을 제공하지 않습니다. MULTI는 데이터베이스의 모든 트랜잭션 특성과 같지 않습니다.

## 연습

DISCARD를 EXEC으로 바꾸어 최종 값을 비교하세요.

[과정 목차](../README.md) · [DataBase 목차](../../README.md)
