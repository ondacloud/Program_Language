# 옵션 처리와 스크립트 검사

## 핵심 개념

getopts는 짧은 옵션을 파싱합니다. 사용법·종료 상태·입력 검증을 함께 설계해야 재사용하기 쉽습니다.

## 실행 방법

Bash 터미널에서 `bash example.sh`로 실행합니다. Windows의 cmd/PowerShell 구문과 다릅니다. 파일은 UTF-8, LF 줄바꿈으로 저장하세요.

[실습 파일](example.sh)

## 실행 예제

```bash
#!/usr/bin/env bash
name='guest'
while getopts ':n:' option; do
    case "$option" in
        n) name=$OPTARG ;;
        *) printf 'usage: %s [-n name]\n' "$0" >&2; exit 2 ;;
    esac
done
shift "$((OPTIND - 1))"
printf 'Hello %s\n' "$name"
```

## 예상 결과

```text
인수 없이 실행: Hello guest
-n Alice로 실행: Hello Alice
```

## 동작 원리와 주의사항

`n:`는 n 옵션에 값이 필요하다는 의미입니다. OPTIND-1만큼 shift하면 처리한 옵션을 제외한 위치 인수가 남습니다. `bash -n example.sh`는 문법 검사만 하며 명령 성공을 보장하지 않습니다. ShellCheck를 설치하면 인용·확장 실수를 추가 점검할 수 있습니다.

## 직접 확인하기

정상 옵션, 빠진 옵션 값, 알 수 없는 옵션을 각각 시험하고 종료 상태 0과 2를 구분하세요.

---

[전체 목차](../README.md) · [이전](../22.%20grep%20%26%20sed%20%26%20awk/README.md) · [다음](../24.%20bash%20%26%20shebang/README.md)
