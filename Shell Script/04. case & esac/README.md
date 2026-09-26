# case / esac

## 핵심 개념

문자열을 패턴과 비교하여 실행할 분기를 선택합니다.

## 실행 방법

Bash 터미널에서 `bash example.sh`로 실행합니다. Windows의 cmd/PowerShell 구문과 다릅니다. 파일은 UTF-8, LF 줄바꿈으로 저장하세요.

[실습 파일](example.sh)

## 실행 예제

```bash
#!/usr/bin/env bash
command='run'
case "$command" in
  start|run) printf 'starting\n' ;;
  stop) printf 'stopping\n' ;;
  *) printf 'unknown\n' ;;
esac
```

## 예상 결과

```text
starting
```

## 동작 원리와 주의사항

패턴은 일반적으로 glob 문법이며 정규식이 아닙니다. ;;는 현재 분기를 끝내고 esac은 case를 닫습니다.



## 직접 확인하기

start·stop·알 수 없는 값을 각각 시험하세요.

---

[전체 목차](../README.md) · [이전](../03.%20if%20%26%20elif%20%26%20else/README.md) · [다음](../05.%20for/README.md)
