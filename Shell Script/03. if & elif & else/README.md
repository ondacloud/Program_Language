# if / elif / else

## 핵심 개념

명령의 종료 상태가 성공이면 해당 분기를 실행합니다.

## 실행 방법

Bash 터미널에서 `bash example.sh`로 실행합니다. Windows의 cmd/PowerShell 구문과 다릅니다. 파일은 UTF-8, LF 줄바꿈으로 저장하세요.

[실습 파일](example.sh)

## 실행 예제

```bash
#!/usr/bin/env bash
n=0
if ((n > 0)); then printf 'positive\n'
elif ((n == 0)); then printf 'zero\n'
else printf 'negative\n'; fi
```

## 예상 결과

```text
zero
```

## 동작 원리와 주의사항

Bash 조건은 성공 상태 0을 참으로 취급합니다. (( )) 안에서는 정수 조건식을 사용합니다. if는 fi로 닫습니다.



## 직접 확인하기

n을 -1과 1로 바꾸세요. 문자열 조건은 [[ ]]로 비교해 보세요.

---

[전체 목차](../README.md) · [이전](../02.%20read/README.md) · [다음](../04.%20case%20%26%20esac/README.md)
