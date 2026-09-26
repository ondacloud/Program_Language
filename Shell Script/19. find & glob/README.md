# 파일 경로, glob, 임시 파일

## 핵심 개념

경로의 공백과 패턴 문자를 데이터로 보존하고, 작업 대상 파일을 명확히 정합니다.

## 실행 방법

Bash 터미널에서 `bash example.sh`로 실행합니다. Windows의 cmd/PowerShell 구문과 다릅니다. 파일은 UTF-8, LF 줄바꿈으로 저장하세요.

[실습 파일](example.sh)

## 실행 예제

```bash
#!/usr/bin/env bash
work_dir=$(mktemp -d) || exit 1
cleanup() {
    rm -f -- "$work_dir/a file.txt"
    rmdir -- "$work_dir"
}
trap cleanup EXIT
printf 'hello\n' > "$work_dir/a file.txt"
shopt -s nullglob
for file in "$work_dir"/*.txt; do
    printf '%s\n' "${file##*/}"
done
```

## 예상 결과

```text
a file.txt
```

## 동작 원리와 주의사항

예제는 자신이 만든 임시 파일 하나만 삭제하고 빈 폴더를 정리합니다. `--`는 파일명이 옵션으로 해석되는 것을 막습니다. glob 일치가 없으면 기본 Bash는 패턴 자체를 남기며 nullglob은 빈 목록으로 만듭니다. 재귀 탐색의 복잡한 파일명은 `find ... -print0`와 `read -d` 등으로 처리하세요.

## 직접 확인하기

임시 폴더에 다른 확장자 파일을 추가해 .txt만 선택되는지 확인하세요. 추가 파일은 정리 함수에도 명시하세요.

---

[전체 목차](../README.md) · [이전](../18.%20pipe%20%26%20redirect/README.md) · [다음](../20.%20trap%20%26%20set/README.md)
