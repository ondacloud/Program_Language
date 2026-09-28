# break — 반복 종료

## 핵심 개념

가장 가까운 반복문 또는 switch를 즉시 종료하는 제어문입니다.

## 실행 예제

```c
#include <stdio.h>

int main(void) {
    for (int i = 1; i <= 5; i++) {
        if (i == 3) {
            break;
        }
        printf("%d\n", i);
    }
    return 0;
}
```

## 실행 결과

```text
1
2
```

## 동작 원리와 주의사항

중첩 반복문 전체를 한 번에 종료하지 않습니다. 함수 자체를 종료하려면 `return`을 사용합니다.

## 직접 확인하기

출력을 `if` 앞으로 이동하면 3도 출력되는지 확인하세요.

---

[언어 목차](../README.md) · [이전](../07.%20do%20%26%20while/README.md) · [다음](../09.%20continue/README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[main.c](main.c)

```sh
gcc -std=c17 -Wall -Wextra -Wpedantic main.c -o app
```

빌드 후 Windows PowerShell은 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다.
