# SET NX & SET XX

NX는 키가 없을 때만, XX는 키가 있을 때만 값을 설정합니다. 조건이 맞지 않으면 쓰지 않습니다.

## 실행

먼저 [실습 환경](../../LAB.md)을 준비합니다. `DataBase` 폴더에서 실행하세요. 각 예제는 필요한 데이터를 직접 준비합니다.

```powershell
python lab.py Redis "02. SET NX & SET XX/example.redis"
```

## 예제

```text
DEL course:condition
SET course:condition first NX
SET course:condition second NX
SET course:condition third XX
GET course:condition
```

[실행 파일](example.redis)

## 결과 읽기

첫 NX와 XX는 OK, 두 번째 NX는 null입니다. 최종 값은 third입니다.

## 주의사항

단순 NX 예제만으로 분산 잠금 전체를 구현했다고 볼 수 없습니다. 만료와 소유자 확인도 필요합니다.

## 연습

처음 키를 지운 뒤 XX만 실행하세요.

[과정 목차](../README.md) · [DataBase 목차](../../README.md)
