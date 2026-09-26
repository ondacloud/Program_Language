# 2차원 배열

## 핵심 개념

2개의 인덱스로 원소에 접근하는 배열입니다.

## 실행 예제

```c
#include <stdio.h>

int main(void) {
    int a[2][2] = {{1, 2}, {3, 4}};
    for (size_t i = 0; i < 2; i++) {
        for (size_t j = 0; j < 2; j++) {
            printf("%d\n", a[i][j]);
        }
    }
    return 0;
}
```

## 실행 결과

```text
1
2
3
4
```

## 동작 원리와 주의사항

배열의 배열이며 마지막 인덱스가 변하는 방향으로 원소가 연속됩니다. `int **`와 `int a[2][2]`는 같은 타입이 아닙니다.

## 직접 확인하기

각 원소를 2배로 바꿔 다시 출력하세요.

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
