# 함수 인수·출력·반환 상태

## 핵심 개념

Bash 함수는 위치 인수로 입력을 받고 표준 출력으로 데이터를 전달하며 return으로 상태를 전달합니다.

## 실행 방법

Bash 터미널에서 `bash example.sh`로 실행합니다. Windows의 cmd/PowerShell 구문과 다릅니다. 파일은 UTF-8, LF 줄바꿈으로 저장하세요.

[실습 파일](example.sh)

## 실행 예제

```bash
#!/usr/bin/env bash
double() {
  local value=${1:-}
  [[ $value =~ ^[0-9]+$ ]] || return 2
  printf '%s
' "$((10#$value * 2))"
}
if result=$(double 12); then printf 'value=%s
' "$result"; fi
double bad
printf 'status=%s
' "$?"
```

## 예상 결과

```text
value=24
status=2
```

## 동작 원리와 주의사항

return 24는 계산값 24를 반환하는 대신 상태 코드를 설정합니다. 상태 코드는 보통 0~255 범위로 사용합니다. $(...)는 마지막 줄바꿈을 제거하며 보통 서브셸 문맥이므로 내부 변수 변경을 외부에 전달하지 않습니다. 이 예제는 작은 양의 정수만 가정합니다.



## 직접 확인하기

인수 누락과 08을 시험하세요. 계산 결과와 오류 메시지가 섞이지 않도록 오류는 >&2로 출력하세요.

---

---

---

[전체 목차](../README.md) · [이전](../10.%20function%20%26%20local/README.md) · [다음](../12.%20array%20%26%20declare/README.md)
