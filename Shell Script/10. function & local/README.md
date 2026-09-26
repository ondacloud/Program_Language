# 함수, local, 반환 상태

## 핵심 개념

함수는 인수를 위치 매개변수로 받고 return으로 종료 상태를 반환합니다. 계산 결과 데이터는 표준 출력 등으로 전달합니다.

## 실행 방법

Bash 터미널에서 `bash example.sh`로 실행합니다. Windows의 cmd/PowerShell 구문과 다릅니다. 파일은 UTF-8, LF 줄바꿈으로 저장하세요.

[실습 파일](example.sh)

## 실행 예제

```bash
#!/usr/bin/env bash
greet() {
    local name=${1:-guest}
    printf 'Hello %s\n' "$name"
}
is_positive() {
    (( $1 > 0 ))
}
message=$(greet Alice)
printf '%s\n' "$message"
if is_positive 3; then
    printf 'valid\n'
fi
```

## 예상 결과

```text
Hello Alice
valid
```

## 동작 원리와 주의사항

return에 문자열을 넣는 방식으로 값을 반환하지 않습니다. 오류 로그는 >&2로 보내 데이터 출력과 분리합니다. local은 Bash 함수 범위의 이름을 만들며 내부 함수에서 보일 수 있는 동적 범위 특성이 있습니다. 외부 숫자 입력은 산술 평가 전에 형식을 검증하세요.

## 직접 확인하기

greet를 인수 없이 호출해 기본값 guest를 확인하세요.

---

---

---

[전체 목차](../README.md) · [이전](../09.%20continue/README.md) · [다음](../11.%20return/README.md)
