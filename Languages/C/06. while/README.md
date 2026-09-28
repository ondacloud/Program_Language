# while 반복문

## 핵심 개념

조건이 참인 동안 실행하며 첫 검사부터 거짓이면 본문을 한 번도 실행하지 않습니다.

## 실행 예제

```c
#include <stdio.h>

int main(void) {
    int n = 1;
    while (n <= 3) {
        printf("%d\n", n);
        n++;
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

조건을 바꾸는 갱신을 빠뜨리면 무한 반복이 됩니다. `while (1)`에서는 `break`, `return` 등 종료 경로를 명시합니다.

## 직접 확인하기

초깃값을 4로 바꾸세요. 출력이 없어야 합니다.

---

[언어 목차](../README.md) · [이전](../05.%20for/README.md) · [다음](../07.%20do%20%26%20while/README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[main.c](main.c)

```sh
gcc -std=c17 -Wall -Wextra -Wpedantic main.c -o app
```

빌드 후 Windows PowerShell은 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다.
