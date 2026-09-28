# ZADD & ZRANGE & ZRANK

Sorted Set은 고유 멤버에 숫자 점수를 부여해 정렬합니다.

## 실행

먼저 [실습 환경](../../LAB.md)을 준비합니다. `DataBase` 폴더에서 실행하세요. 각 예제는 필요한 데이터를 직접 준비합니다.

```powershell
python lab.py Redis "09. ZADD & ZRANGE & ZRANK/example.redis"
```

## 예제

```text
DEL course:rank
ZADD course:rank 80 Mina 60 Jin 90 Sol
ZRANGE course:rank 0 -1 REV WITHSCORES
ZREVRANK course:rank Sol
```

[실행 파일](example.redis)

## 결과 읽기

내림차순 Sol 90, Mina 80, Jin 60이며 Sol의 역순 순위는 0입니다.

## 주의사항

순위는 0부터 시작합니다. 같은 점수일 때 문자열 정렬 규칙도 적용됩니다.

## 연습

ZINCRBY로 Jin에게 30점을 추가하세요.

[과정 목차](../README.md) · [DataBase 목차](../../README.md)
