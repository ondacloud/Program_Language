# while

## 핵심 개념

조건 명령이 성공하는 동안 반복합니다.

## 실행 방법

Bash 터미널에서 `bash example.sh`로 실행합니다. Windows의 cmd/PowerShell 구문과 다릅니다. 파일은 UTF-8, LF 줄바꿈으로 저장하세요.

[실습 파일](example.sh)

## 실행 예제

```bash
#!/usr/bin/env bash
n=0
while ((n < 3)); do
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

do와 done 사이가 본문입니다. 조건을 매번 바꾸지 않으면 끝나지 않을 수 있습니다. Bash에는 일반적인 do-while 키워드 조합이 없습니다.



## 직접 확인하기

초기값을 3으로 바꾸고 본문이 실행되지 않는지 확인하세요.

---

[전체 목차](../README.md) · [이전](../05.%20for/README.md) · [다음](../07.%20until/README.md)
