# HSET & HGET & HGETALL

Hash는 하나의 키 아래 필드와 값의 모음을 저장합니다.

## 실행

먼저 [실습 환경](../../LAB.md)을 준비합니다. `DataBase` 폴더에서 실행하세요. 각 예제는 필요한 데이터를 직접 준비합니다.

```powershell
python lab.py Redis "06. HSET & HGET & HGETALL/example.redis"
```

## 예제

```text
DEL course:user
HSET course:user name Mina score 80
HGET course:user name
HINCRBY course:user score 5
HGETALL course:user
```

[실행 파일](example.redis)

## 결과 읽기

name은 Mina, score는 85입니다. HGETALL의 필드 순서는 가정하지 마세요.

## 주의사항

Hash 값도 문자열입니다. 중첩 JSON 객체를 자동으로 필드 구조로 해석하지 않습니다.

## 연습

HDEL로 score만 삭제하세요.

[과정 목차](../README.md) · [DataBase 목차](../../README.md)
