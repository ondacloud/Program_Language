# XADD & XRANGE & XLEN

Stream은 ID가 있는 이벤트를 순서대로 기록합니다. *는 서버가 새 ID를 만들도록 합니다.

## 실행

먼저 [실습 환경](../../LAB.md)을 준비합니다. `DataBase` 폴더에서 실행하세요. 각 예제는 필요한 데이터를 직접 준비합니다.

```powershell
python lab.py Redis "13. XADD & XRANGE & XLEN/example.redis"
```

## 예제

```text
DEL course:events
XADD course:events * kind signup user Mina
XADD course:events * kind login user Mina
XLEN course:events
XRANGE course:events - +
```

[실행 파일](example.redis)

## 결과 읽기

길이는 2이고 두 이벤트가 표시됩니다. 생성 ID는 실행마다 달라집니다.

## 주의사항

소비자 그룹은 XGROUP·XREADGROUP·XACK으로 별도 관리합니다. 처리 성공 후 ACK와 중복 처리 설계가 필요합니다.

## 연습

XREAD COUNT 2 STREAMS course:events 0으로 처음부터 읽으세요.

[과정 목차](../README.md) · [DataBase 목차](../../README.md)
