# 헤더와 분할 컴파일

## 핵심 개념

헤더에는 공개 선언을, `.c` 파일에는 함수 정의를 둡니다. 전처리 → 컴파일 → 어셈블 → 링크를 거쳐 실행 파일이 만들어집니다.

## 파일 구성

`calc.h`:

```c
#ifndef CALC_H
#define CALC_H
int add(int a, int b);
#endif
```

`calc.c`:

```c
#include "calc.h"
int add(int a, int b) {
    return a + b;
}
```

`main.c`:

```c
#include <stdio.h>
#include "calc.h"
int main(void) {
    printf("%d\n", add(2, 3));
    return 0;
}
```

## 빌드와 결과

GCC 또는 Clang이 설치된 터미널에서 세 파일이 있는 폴더로 이동합니다.

```sh
gcc -std=c17 -Wall -Wextra -Wpedantic main.c calc.c -o app
```

Windows PowerShell에서는 `.\app.exe`, Linux/macOS에서는 `./app`으로 실행합니다. 결과는 `5`입니다.

## 주의사항

- include guard는 한 번의 전처리 과정에서 헤더 중복 포함을 막습니다.
- `.c` 파일을 `#include`하지 말고 각각 컴파일하여 링크하세요.
- 헤더에 일반 전역 변수 정의를 넣으면 중복 정의가 발생할 수 있습니다. 필요하면 헤더에 `extern` 선언, 한 `.c`에 정의를 둡니다.
- 파일 범위 `static`은 이름을 해당 번역 단위 내부로 제한합니다. 블록 범위 `static` 변수는 프로그램 실행 동안 값을 유지합니다.
- 매크로는 텍스트 치환입니다. `SQUARE(i++)`처럼 부작용이 있는 인수를 반복 평가하는 매크로 대신 함수를 고려하세요.

## 직접 확인하기

`calc.c`를 빌드 명령에서 빼 보세요. 선언을 알아도 함수 정의를 링크하지 않으면 링크 오류가 발생합니다.

---

[언어 목차](../README.md) · [이전](../17.%20struct%20enum%20typedef/README.md) · [다음](../19.%20debugging%20safety/README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[calc.h](calc.h) · [calc.c](calc.c) · [main.c](main.c)

```sh
gcc -std=c17 -Wall -Wextra -Wpedantic main.c calc.c -o app
```

빌드 후 Windows PowerShell은 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다.
