# until

## 핵심 개념

조건 명령이 성공할 때까지 반복합니다.

## 실행 방법

Bash 터미널에서 `bash example.sh`로 실행합니다. Windows의 cmd/PowerShell 구문과 다릅니다. 파일은 UTF-8, LF 줄바꿈으로 저장하세요.

[실습 파일](example.sh)

## 실행 예제

```bash
#!/usr/bin/env bash
n=0
until ((n >= 3)); do
  printf '%s\n' "$n"
  ((n += 1))
done
```

## 예상 결과

```text
0
1
2
```

## 동작 원리와 주의사항

while과 달리 조건이 실패하는 동안 본문을 실행합니다. 조건을 부정한 while과 비교해 이해하세요.



## 직접 확인하기

동일 동작을 while로 바꾸고 종료 조건을 설명하세요.

---

[전체 목차](../README.md) · [이전](../06.%20while/README.md) · [다음](../08.%20break/README.md)
