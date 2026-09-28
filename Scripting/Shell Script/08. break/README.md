# break

## 핵심 개념

반복을 종료합니다.

## 실행 방법

Bash 터미널에서 `bash example.sh`로 실행합니다. Windows의 cmd/PowerShell 구문과 다릅니다. 파일은 UTF-8, LF 줄바꿈으로 저장하세요.

[실습 파일](example.sh)

## 실행 예제

```bash
#!/usr/bin/env bash
for n in 0 1 2 3; do
  if ((n == 2)); then break; fi
  printf '%s\n' "$n"
done
```

## 예상 결과

```text
0
1
```

## 동작 원리와 주의사항

break는 반복 바깥으로, continue는 다음 반복으로 이동합니다. 함수 종료 상태를 지정하는 return과 구분하세요.



## 직접 확인하기

중첩 반복에서 동작을 확인하고 두 키워드를 서로 바꾸어 보세요.

---

[전체 목차](../README.md) · [이전](../07.%20until/README.md) · [다음](../09.%20continue/README.md)
