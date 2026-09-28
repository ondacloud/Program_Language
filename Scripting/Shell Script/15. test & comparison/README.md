# 문자열·정수·파일 비교

## 핵심 개념

[[...]] 안의 문자열 검사, 정수 비교 연산자, ((...)) 산술 조건을 구분합니다.

## 실행 방법

Bash 터미널에서 `bash example.sh`로 실행합니다. Windows의 cmd/PowerShell 구문과 다릅니다. 파일은 UTF-8, LF 줄바꿈으로 저장하세요.

[실습 파일](example.sh)

## 실행 예제

```bash
#!/usr/bin/env bash
text='Alice'
n=12
[[ $text == A* ]] && printf 'pattern
'
[[ -n $text && $n -ge 10 ]] && printf 'valid
'
((n >= 10 && n < 20)) && printf 'range
'
[[ -d . ]] && printf 'directory
'
[[ ! -z $text ]] && printf 'not empty
'
```

## 예상 결과

```text
pattern
valid
range
directory
not empty
```

## 동작 원리와 주의사항

[[ ]] 안의 <와 >는 문자열 순서 비교입니다. 정수는 -eq·-ne·-lt·-le·-gt·-ge 또는 (( ))를 사용하세요. 파일 연산자 -e·-f·-d·-r은 존재·일반 파일·디렉터리·읽기 가능 여부를 검사합니다. 테스트 직후에도 파일 상태는 바뀔 수 있습니다.



## 직접 확인하기

문자열 9와 10을 문자열 및 숫자로 각각 비교하세요. A*를 따옴표로 감쌀 때 결과를 확인하세요.

---

[전체 목차](../README.md) · [이전](../14.%20parameter%20expansion/README.md) · [다음](../16.%20logical%20operator%20%26%20exit%20status/README.md)
