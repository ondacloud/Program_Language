# 파이프와 리디렉션

## 핵심 개념

파이프는 앞 명령의 표준 출력을 다음 명령의 표준 입력으로 연결합니다. 표준 출력과 표준 오류는 별도 스트림입니다.

## 실행 방법

Bash 터미널에서 `bash example.sh`로 실행합니다. Windows의 cmd/PowerShell 구문과 다릅니다. 파일은 UTF-8, LF 줄바꿈으로 저장하세요.

[실습 파일](example.sh)

## 실행 예제

```bash
#!/usr/bin/env bash
printf 'banana\napple\nbanana\n' | sort | uniq
printf 'warning\n' >&2
if printf 'hello\n' | grep -q '^hello$'; then
    printf 'found\n'
fi
```

## 예상 결과

```text
표준 출력: apple, banana, found (각각 한 줄)
표준 오류: warning
```

## 동작 원리와 주의사항

`>`는 파일을 덮어쓰고 `>>`는 추가합니다. `2>`는 오류를 보냅니다. `command >file 2>&1`과 `command 2>&1 >file`은 적용 순서 때문에 다릅니다. 기본 파이프 종료 상태는 마지막 명령이며 pipefail을 켜면 실패한 명령의 상태도 반영합니다. grep 1은 일치 없음, 2는 오류로 구별하세요.

## 직접 확인하기

같은 정렬을 sort -u로 간단히 작성해 보세요.

---

[전체 목차](../README.md) · [이전](../17.%20set%20%26%20positional%20parameters/README.md) · [다음](../19.%20find%20%26%20glob/README.md)
