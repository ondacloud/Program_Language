# 출력 — printf와 형식 문자열

## 핵심 개념

printf는 형식 문자열에 맞춰 값을 출력합니다. 줄바꿈을 명시하고 입력값은 형식과 분리합니다.

## 실행 방법

Bash 터미널에서 `bash example.sh`로 실행합니다. Windows의 cmd/PowerShell 구문과 다릅니다. 파일은 UTF-8, LF 줄바꿈으로 저장하세요.

[실습 파일](example.sh)

## 실행 예제

```bash
#!/usr/bin/env bash
name='Alice Kim'
count=3
printf 'Hello %s\n' "$name"
printf 'count=%d\n' "$count"
printf '%s\n' '100% complete'
```

## 예상 결과

```text
Hello Alice Kim
count=3
100% complete
```

## 동작 원리와 주의사항

%s는 문자열, %d는 정수 형식입니다. printf "$value"처럼 외부 값을 형식 문자열로 사용하지 말고 printf "%s\n" "$value"로 전달하세요. echo의 옵션·이스케이프 처리는 구현에 따라 달라질 수 있어 형식이 중요하면 printf를 사용합니다.



## 직접 확인하기

공백·퍼센트·역슬래시가 있는 문자열을 출력하고 따옴표를 제거하면 무엇이 달라지는지 설명하세요.

---

[전체 목차](../README.md) · [이전](../00.%20operator/README.md) · [다음](../02.%20read/README.md)
