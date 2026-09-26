# 입력 — read와 IFS

## 핵심 개념

read는 한 줄 입력을 변수에 저장합니다. IFS=와 -r을 사용하면 앞뒤 공백과 역슬래시를 보존할 수 있습니다.

## 실행 방법

Bash 터미널에서 `bash example.sh`로 실행합니다. Windows의 cmd/PowerShell 구문과 다릅니다. 파일은 UTF-8, LF 줄바꿈으로 저장하세요.

[실습 파일](example.sh)

## 실행 예제

```bash
#!/usr/bin/env bash
if IFS= read -r name; then
    printf 'Hello %s\n' "$name"
else
    printf 'no input\n' >&2
    exit 1
fi
```

## 예상 결과

```text
Hello Alice
```

## 동작 원리와 주의사항

실행 후 Alice를 입력하고 Enter를 누르세요. read는 줄바꿈을 저장하지 않습니다. -r이 없으면 역슬래시 해석이 달라집니다. 종료 상태로 EOF 또는 읽기 실패를 처리합니다. 입력값을 명령으로 실행하는 eval을 사용하지 않습니다.



## 직접 확인하기

공백이 있는 이름·빈 줄·입력 종료를 시험하세요.

---

---

[전체 목차](../README.md) · [이전](../01.%20printf/README.md) · [다음](../03.%20if%20%26%20elif%20%26%20else/README.md)
