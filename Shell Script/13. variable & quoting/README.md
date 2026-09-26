# 변수와 따옴표

## 핵심 개념

변수 대입에는 = 양옆 공백이 없습니다. 큰따옴표는 변수 확장을 허용하고 작은따옴표는 문자를 그대로 유지합니다.

## 실행 방법

Bash 터미널에서 `bash example.sh`로 실행합니다. Windows의 cmd/PowerShell 구문과 다릅니다. 파일은 UTF-8, LF 줄바꿈으로 저장하세요.

[실습 파일](example.sh)

## 실행 예제

```bash
#!/usr/bin/env bash
name='Alice Kim'
printf '%s\n' "$name"
printf '%s\n' '$name'
printf '<%s>\n' "$name"
```

## 예상 결과

```text
Alice Kim
$name
<Alice Kim>
```

## 동작 원리와 주의사항

일반 명령 인수의 변수 확장은 `"$name"`처럼 감싸 공백 분리와 경로 패턴 확장을 막습니다. `$name` 값 안의 명령 문자가 자동 재실행되지는 않지만 eval을 사용하면 코드로 해석될 수 있습니다. 텍스트 출력은 printf의 고정 서식과 별도 인수로 작성하세요.

## 직접 확인하기

name에 공백과 *를 넣어도 하나의 인수로 출력되는지 확인하세요.

---

[전체 목차](../README.md) · [이전](../12.%20array%20%26%20declare/README.md) · [다음](../14.%20parameter%20expansion/README.md)
