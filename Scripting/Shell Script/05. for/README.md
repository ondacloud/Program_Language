# for

## 핵심 개념

목록의 각 항목을 변수에 넣어 순회합니다.

## 실행 방법

Bash 터미널에서 `bash example.sh`로 실행합니다. Windows의 cmd/PowerShell 구문과 다릅니다. 파일은 UTF-8, LF 줄바꿈으로 저장하세요.

[실습 파일](example.sh)

## 실행 예제

```bash
#!/usr/bin/env bash
for value in 'Alice Kim' Bob; do
  printf '<%s>\n' "$value"
done
```

## 예상 결과

```text
<Alice Kim>
<Bob>
```

## 동작 원리와 주의사항

따옴표로 공백 포함 항목을 보존하세요. 산술 반복은 for ((i=0; i<3; i++)) 형태로도 작성할 수 있습니다.



## 직접 확인하기

항목을 추가하고 "$@"를 순회하도록 바꾸세요.

---

[전체 목차](../README.md) · [이전](../04.%20case%20%26%20esac/README.md) · [다음](../06.%20while/README.md)
