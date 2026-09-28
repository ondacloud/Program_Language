# SADD & SISMEMBER & SINTER

Set은 중복 없는 문자열 집합입니다. 순서는 보장하지 않으며 교집합 같은 집합 연산을 제공합니다.

## 실행

먼저 [실습 환경](../../LAB.md)을 준비합니다. `DataBase` 폴더에서 실행하세요. 각 예제는 필요한 데이터를 직접 준비합니다.

```powershell
python lab.py Redis "08. SADD & SISMEMBER & SINTER/example.redis"
```

## 예제

```text
DEL course:set:a course:set:b
SADD course:set:a sql web sql
SADD course:set:b web db
SISMEMBER course:set:a sql
SINTER course:set:a course:set:b
```

[실행 파일](example.redis)

## 결과 읽기

첫 SADD는 새 원소 수 2, membership은 1, 교집합은 web입니다.

## 주의사항

Set은 입력 순서나 정렬 순서를 유지하지 않습니다. 정렬이 필요하면 Sorted Set을 검토하세요.

## 연습

SUNION과 SDIFF 결과를 비교하세요.

[과정 목차](../README.md) · [DataBase 목차](../../README.md)
