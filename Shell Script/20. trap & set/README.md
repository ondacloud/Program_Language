# 오류 처리, set 옵션, trap

## 핵심 개념

중요한 명령은 직접 성공 여부를 검사하고 trap으로 종료 시 정리 동작을 등록합니다.

## 실행 방법

Bash 터미널에서 `bash example.sh`로 실행합니다. Windows의 cmd/PowerShell 구문과 다릅니다. 파일은 UTF-8, LF 줄바꿈으로 저장하세요.

[실습 파일](example.sh)

## 실행 예제

```bash
#!/usr/bin/env bash
set -u
set -o pipefail
trap 'printf "cleanup\n"' EXIT
if false; then
    printf 'unexpected\n'
else
    printf 'handled\n'
fi
printf 'finished\n'
```

## 예상 결과

```text
handled
finished
cleanup
```

## 동작 원리와 주의사항

set -u는 미정의 변수 확장을 오류로 취급합니다. set -e는 조건문·논리 목록·서브셸 등 문맥별 예외가 있어 모든 실패를 자동 처리하는 기능이 아닙니다. trap EXIT도 SIGKILL 같은 강제 종료에는 실행되지 않습니다. trap 문자열은 등록 시점과 실행 시점의 확장을 구분하세요.

## 직접 확인하기

명시적인 exit 2를 마지막에 넣고 정리 출력과 종료 상태를 함께 확인하세요.

---

---

---

[전체 목차](../README.md) · [이전](../19.%20find%20%26%20glob/README.md) · [다음](../21.%20export%20%26%20wait/README.md)
