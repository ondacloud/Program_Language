# EXISTS & TYPE & DEL

EXISTS로 키 존재, TYPE으로 자료형을 확인하고 DEL로 키를 삭제합니다.

## 실행

먼저 [실습 환경](../../LAB.md)을 준비합니다. `DataBase` 폴더에서 실행하세요. 각 예제는 필요한 데이터를 직접 준비합니다.

```powershell
python lab.py Redis "04. EXISTS & TYPE & DEL/example.redis"
```

## 예제

```text
SET course:temp value
EXISTS course:temp
TYPE course:temp
DEL course:temp
EXISTS course:temp
```

[실행 파일](example.redis)

## 결과 읽기

1, string, 1, 0 순의 결과를 확인합니다.

## 주의사항

키의 자료형과 맞지 않는 명령은 WRONGTYPE 오류를 냅니다. 큰 자료구조 삭제는 UNLINK도 검토하세요.

## 연습

키 삭제 후 TYPE 결과를 확인하세요.

[과정 목차](../README.md) · [DataBase 목차](../../README.md)
