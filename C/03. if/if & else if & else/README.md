# else if — 여러 조건 연결

## 핵심 개념

`if`는 함수가 아니라 조건문입니다. C는 0을 거짓, 0 이외의 값을 참으로 판단합니다.

## 실행 예제

```c
#include <stdio.h>

int main(void) {
    int value = 0;
    if (value < 0) {
        puts("negative");
    } else if (value == 0) {
        puts("zero");
    } else {
        puts("positive");
    }
    return 0;
}
```

## 실행 결과

```text
zero
```

## 동작 원리와 주의사항

구체적인 조건을 먼저 배치하고 경계값을 확인합니다.

`if (value = 0)`은 비교가 아닌 대입입니다. 비교에는 `==`를 사용하고, 본문이 한 줄이어도 중괄호를 쓰면 수정할 때 실수를 줄일 수 있습니다.

## 직접 확인하기

`value`를 -1, 0, 1로 바꾸어 각 경로를 확인하세요.

---

[언어 목차](../../README.md) · [상위 주제](../README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[main.c](main.c)

```sh
gcc -std=c17 -Wall -Wextra -Wpedantic main.c -o app
```

빌드 후 Windows PowerShell은 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다.
