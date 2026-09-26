# 인수와 표준 입력

## 핵심 개념

$1 등은 위치 인수이고 "$@"는 각 인수의 경계를 유지합니다. read는 한 줄을 변수에 넣습니다.

## 실행 방법

Bash 터미널에서 `bash example.sh`로 실행합니다. Windows의 cmd/PowerShell 구문과 다릅니다. 파일은 UTF-8, LF 줄바꿈으로 저장하세요.

[실습 파일](example.sh)

## 실행 예제

```bash
#!/usr/bin/env bash
set -- 'Alice Kim' 'Bob'
printf 'count=%s\n' "$#"
for value in "$@"; do
    printf '<%s>\n' "$value"
done
IFS= read -r line <<< 'a\b c'
printf '%s\n' "$line"
```

## 예상 결과

```text
count=2
<Alice Kim>
<Bob>
a\b c
```

## 동작 원리와 주의사항

`"$*"`는 인수들을 하나의 문자열로 합치므로 `"$@"`와 다릅니다. `read -r`은 역슬래시를 그대로 읽고 IFS=는 앞뒤 공백을 보존합니다. `<<<`는 Bash here-string이며 POSIX sh 문법이 아닙니다. 실제 스크립트에서는 예제의 set -- 대신 호출 인수를 사용합니다.

## 직접 확인하기

인수에 빈 문자열을 하나 넣어도 for가 그 항목을 처리하는지 확인하세요.

---

---

---

[전체 목차](../README.md) · [이전](../16.%20logical%20operator%20%26%20exit%20status/README.md) · [다음](../18.%20pipe%20%26%20redirect/README.md)
