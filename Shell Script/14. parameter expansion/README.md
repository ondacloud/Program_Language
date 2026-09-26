# 매개변수 확장과 명령 치환

## 핵심 개념

${...}로 기본값·부분 문자열을 다루고 $(...)로 명령의 표준 출력을 가져옵니다.

## 실행 방법

Bash 터미널에서 `bash example.sh`로 실행합니다. Windows의 cmd/PowerShell 구문과 다릅니다. 파일은 UTF-8, LF 줄바꿈으로 저장하세요.

[실습 파일](example.sh)

## 실행 예제

```bash
#!/usr/bin/env bash
name=''
printf '%s\n' "${name:-guest}"
file='report.txt'
printf '%s\n' "${file%.txt}"
value=$(printf 'hello\n\n')
printf '<%s>\n' "$value"
```

## 예상 결과

```text
guest
report
<hello>
```

## 동작 원리와 주의사항

`${name:-guest}`는 unset 또는 빈 값일 때 기본값을 사용하지만 변수를 수정하지 않습니다. `:=`는 기본값을 대입하고 `:?`는 필수 값 검사에 사용합니다. 콜론 없는 `-`는 unset만 검사합니다. 명령 치환은 마지막 줄바꿈들을 제거합니다. `${file%.txt}`의 패턴은 정규식이 아닙니다.

## 직접 확인하기

빈 name에 ${name-guest}를 사용하면 무엇이 출력될까요? 빈 문자열입니다.

---

---

---

[전체 목차](../README.md) · [이전](../13.%20variable%20%26%20quoting/README.md) · [다음](../15.%20test%20%26%20comparison/README.md)
