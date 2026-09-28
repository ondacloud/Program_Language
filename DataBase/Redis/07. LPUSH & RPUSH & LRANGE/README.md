# LPUSH & RPUSH & LRANGE

List는 순서가 있는 문자열 목록입니다. 왼쪽·오른쪽 삽입과 제거를 조합해 큐나 스택을 만듭니다.

## 실행

먼저 [실습 환경](../../LAB.md)을 준비합니다. `DataBase` 폴더에서 실행하세요. 각 예제는 필요한 데이터를 직접 준비합니다.

```powershell
python lab.py Redis "07. LPUSH & RPUSH & LRANGE/example.redis"
```

## 예제

```text
DEL course:queue
RPUSH course:queue first second
LPUSH course:queue zero
LRANGE course:queue 0 -1
LPOP course:queue
```

[실행 파일](example.redis)

## 결과 읽기

목록은 zero, first, second이고 LPOP은 zero입니다.

## 주의사항

LRANGE의 끝 인덱스는 포함됩니다. 큰 목록 전체 조회는 응답량이 커집니다.

## 연습

FIFO 큐를 RPUSH와 LPOP으로 구현하세요.

[과정 목차](../README.md) · [DataBase 목차](../../README.md)
