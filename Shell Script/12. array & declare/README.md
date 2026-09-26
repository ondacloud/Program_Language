# 배열과 연관 배열

## 핵심 개념

Bash 배열은 여러 인수의 경계를 보존합니다. 연관 배열은 Bash 4 이상에서 지원합니다.

## 실행 방법

Bash 터미널에서 `bash example.sh`로 실행합니다. Windows의 cmd/PowerShell 구문과 다릅니다. 파일은 UTF-8, LF 줄바꿈으로 저장하세요.

[실습 파일](example.sh)

## 실행 예제

```bash
#!/usr/bin/env bash
names=('Alice Kim' 'Bob')
names+=('Chris')
printf 'count=%s\n' "${#names[@]}"
printf '%s\n' "${names[@]}"
declare -A scores=([Alice]=90 [Bob]=80)
printf 'Alice=%s\n' "${scores[Alice]}"
```

## 예상 결과

```text
count=3
Alice Kim
Bob
Chris
Alice=90
```

## 동작 원리와 주의사항

`"${names[@]}"`는 원소별 인수, `"${names[*]}"`는 합친 인수입니다. 연관 배열의 순회 순서를 기대하지 마세요. macOS 기본 Bash가 3.2라면 연관 배열 예제는 별도 Bash 4+가 필요합니다. 스크립트 첫 줄만으로 최소 버전이 설치되지는 않습니다.

## 직접 확인하기

빈 원소를 추가하고 개수와 출력이 유지되는지 확인하세요.

---

---

---

[전체 목차](../README.md) · [이전](../11.%20return/README.md) · [다음](../13.%20variable%20%26%20quoting/README.md)
