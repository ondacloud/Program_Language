# 텍스트 처리와 파일 읽기

## 핵심 개념

줄 단위 데이터는 read 반복으로, 필드와 레코드 계산은 awk 같은 전용 도구로 다룰 수 있습니다.

## 실행 방법

Bash 터미널에서 `bash example.sh`로 실행합니다. Windows의 cmd/PowerShell 구문과 다릅니다. 파일은 UTF-8, LF 줄바꿈으로 저장하세요.

[실습 파일](example.sh)

## 실행 예제

```bash
#!/usr/bin/env bash
while IFS= read -r line; do
    printf '<%s>\n' "$line"
done <<'DATA'
Alice Kim
Bob
DATA
printf 'Alice 90\nBob 80\n' | awk '{ total += $2 } END { print total }'
```

## 예상 결과

```text
<Alice Kim>
<Bob>
170
```

## 동작 원리와 주의사항

here-document 구분자를 작은따옴표로 감싸면 본문 변수 확장을 하지 않습니다. 파이프 뒤 while은 서브셸에서 실행되어 누적한 변수가 바깥에 남지 않을 수 있습니다. 일반 CSV는 따옴표·쉼표·줄바꿈 규칙이 있어 단순 공백 분리로 처리할 수 없습니다.

## 직접 확인하기

이름에 공백이 있는 점수 데이터는 왜 이 awk 예제의 필드 구조에 맞지 않는지 설명하세요.

---

---

---

[전체 목차](../README.md) · [이전](../21.%20export%20%26%20wait/README.md) · [다음](../23.%20getopts/README.md)
