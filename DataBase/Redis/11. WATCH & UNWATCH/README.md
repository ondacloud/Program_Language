# WATCH & UNWATCH

WATCH는 키가 변경되지 않았을 때만 EXEC을 성공시키는 낙관적 동시성 제어입니다.

## 실행

먼저 [실습 환경](../../LAB.md)을 준비합니다. `DataBase` 폴더에서 실행하세요. 각 예제는 필요한 데이터를 직접 준비합니다.

```powershell
python lab.py Redis "11. WATCH & UNWATCH/example.redis"
```

## 예제

```text
SET course:watch 10
WATCH course:watch
GET course:watch
MULTI
SET course:watch 11
EXEC
GET course:watch
```

[실행 파일](example.redis)

## 결과 읽기

다른 변경이 없으면 EXEC이 성공해 11이 됩니다.

## 주의사항

경쟁 변경이 있으면 EXEC은 null로 중단되어 재시도가 필요합니다. WATCH부터 EXEC까지 동일 연결을 유지해야 합니다.

## 연습

대화형 CLI 두 개를 열고 WATCH 뒤 다른 연결에서 값을 바꿔 중단을 관찰하세요.

[과정 목차](../README.md) · [DataBase 목차](../../README.md)
