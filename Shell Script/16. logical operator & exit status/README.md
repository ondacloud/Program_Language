# 논리 연산과 종료 코드

## 핵심 개념

셸의 조건은 명령 성공 여부입니다. 상태 코드 0이 성공이며 &&·||는 다음 명령의 실행 여부를 결정합니다.

## 실행 방법

Bash 터미널에서 `bash example.sh`로 실행합니다. Windows의 cmd/PowerShell 구문과 다릅니다. 파일은 UTF-8, LF 줄바꿈으로 저장하세요.

[실습 파일](example.sh)

## 실행 예제

```bash
#!/usr/bin/env bash
true && printf 'success
'
false || printf 'fallback
'
if ! false; then printf 'negated
'; fi
false
status=$?
printf 'status=%s
' "$status"
printf 'bits=%s
' "$((5 & 3)) $((5 | 3)) $((5 ^ 3)) $((5 << 1))"
```

## 예상 결과

```text
success
fallback
negated
status=1
bits=1 7 6 10
```

## 동작 원리와 주의사항

$?는 직전 명령 상태이므로 다른 명령 전에 저장해야 합니다. a && b || c는 b가 실패해도 c를 실행하므로 항상 if/else와 같지는 않습니다. &는 명령 문맥에서 백그라운드 실행이며 산술 문맥의 &는 비트 AND입니다.



## 직접 확인하기

true && false || printf로 실행 경로를 확인하고 if/else로 의도를 명확하게 바꾸세요.

---

[전체 목차](../README.md) · [이전](../15.%20test%20%26%20comparison/README.md) · [다음](../17.%20set%20%26%20positional%20parameters/README.md)
