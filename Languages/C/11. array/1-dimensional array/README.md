# 1차원 배열

## 핵심 개념

1개의 인덱스로 원소에 접근하는 배열입니다.

## 실행 예제

```c
#include <stdio.h>

int main(void) {
    int a[3] = {1, 2, 3};
    for (size_t i = 0; i < 3; i++) {
        printf("%d\n", a[i]);
    }
    return 0;
}
```

## 실행 결과

```text
1
2
3
```

## 동작 원리와 주의사항

초기화하지 않은 자동 지역 배열을 읽지 마세요. `int a[3] = {0};`은 모든 원소를 0으로 초기화합니다.

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
