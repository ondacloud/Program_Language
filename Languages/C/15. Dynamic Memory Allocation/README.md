# 동적 메모리 — malloc / calloc / realloc / free

## 핵심 개념

실행 중 필요한 공간을 요청하고 사용이 끝나면 직접 해제합니다. 할당 성공 여부와 소유자를 명확히 정해야 합니다.

## 실행 예제

```c
#include <stdio.h>
#include <stdlib.h>

int main(void) {
    size_t count = 3;
    int *values = malloc(count * sizeof *values);
    if (values == NULL) {
        return 1;
    }
    for (size_t i = 0; i < count; i++) {
        values[i] = (int)i + 1;
    }
    int *grown = realloc(values, 5 * sizeof *values);
    if (grown == NULL) {
        free(values);
        return 1;
    }
    values = grown;
    values[3] = 4;
    values[4] = 5;
    printf("%d %d\n", values[0], values[4]);
    free(values);
    values = NULL;
    return 0;
}
```

## 실행 결과

```text
할당 성공 시: 1 5
```

## 동작 원리와 주의사항

- `malloc`의 내용은 초기화되지 않습니다. `calloc(n, size)`는 모든 비트를 0으로 초기화합니다.
- C에서는 `malloc`의 반환값을 형변환할 필요가 없습니다. `<stdlib.h>`를 포함하세요.
- `realloc`의 결과를 임시 포인터로 받습니다. 실패하면 원래 할당은 살아 있으므로 정리할 수 있습니다.
- `realloc` 성공 후 이전 포인터와 별칭은 더 이상 사용하지 않습니다. 새로 늘어난 영역은 초기화되지 않습니다.
- 동적 길이는 `count > SIZE_MAX / sizeof *values` 등의 곱셈 오버플로 검사도 필요합니다 (`<stdint.h>`).
- 이중 해제, 해제 후 접근, 해제 누락을 피하세요. 한 포인터에 `NULL`을 대입해도 다른 별칭이 자동으로 바뀌지는 않습니다.

## 직접 확인하기

길이 5인 배열의 합을 구하고 모든 정상·오류 경로에서 누수가 없는지 확인하세요. 답: 15.

---

[언어 목차](../README.md) · [이전](../14.%20open%20file/README.md) · [다음](../16.%20string/README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[main.c](main.c)

```sh
gcc -std=c17 -Wall -Wextra -Wpedantic main.c -o app
```

빌드 후 Windows PowerShell은 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다.
