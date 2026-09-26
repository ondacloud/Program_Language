# Bash 스크립트와 실행 흐름

## 핵심 개념

셸은 명령을 실행하고 표준 입출력을 연결하는 명령 해석기입니다. 이 과정은 POSIX sh 전체가 아니라 Bash 문법을 기준으로 합니다.

## 실행 방법

Bash 터미널에서 `bash example.sh`로 실행합니다. Windows의 cmd/PowerShell 구문과 다릅니다. 파일은 UTF-8, LF 줄바꿈으로 저장하세요.

[실습 파일](example.sh)

## 실행 예제

```bash
#!/usr/bin/env bash
printf 'Hello Bash\n'
printf 'arguments=%s\n' "$#"
```

## 예상 결과

```text
Hello Bash
arguments=0
```

## 동작 원리와 주의사항

- 첫 줄 shebang은 파일을 직접 실행할 때 사용할 인터프리터를 지정합니다. `bash example.sh`는 명시한 Bash를 사용합니다.
- Linux/macOS에서 직접 실행하려면 실행 권한과 `./example.sh` 경로가 필요합니다. `sh example.sh`는 Bash 전용 문법을 보장하지 않습니다.
- Windows에서는 WSL 또는 Git Bash를 사용할 수 있지만 경로와 제공되는 외부 명령이 다를 수 있습니다.
- 주석은 `#`로 시작합니다. CRLF 때문에 `bash
` 오류가 나면 LF로 저장하세요.

## 직접 확인하기

bash example.sh one two로 실행하세요. arguments=2가 됩니다.

---

---

---

[전체 목차](../README.md) · [이전](../23.%20getopts/README.md)
