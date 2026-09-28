# SET & GET

SET은 문자열 값을 기록하고 GET은 읽습니다. Redis의 입력·출력은 CLI 또는 드라이버 명령과 응답으로 이루어집니다.

## 실행

먼저 [실습 환경](../../LAB.md)을 준비합니다. `DataBase` 폴더에서 실행하세요. 각 예제는 필요한 데이터를 직접 준비합니다.

```powershell
python lab.py Redis "01. SET & GET/example.redis"
```

## 예제

```text
SET course:name Mina
GET course:name
```

[실행 파일](example.redis)

## 결과 읽기

SET은 OK, GET은 Mina를 반환합니다.

## 주의사항

SET은 기존 값을 덮어씁니다. 없던 키의 GET은 null 응답이며 redis-cli 표시 옵션에 따라 빈 출력처럼 보일 수 있습니다.

## 연습

이름을 Jin으로 변경하세요.

[과정 목차](../README.md) · [DataBase 목차](../../README.md)
