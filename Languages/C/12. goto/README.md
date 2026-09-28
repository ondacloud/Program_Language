# goto — 레이블로 이동

## 핵심 개념

같은 함수 안의 레이블로 실행 위치를 옮깁니다. 여러 자원의 정리 경로를 합치는 경우에 제한적으로 사용합니다.

## 실행 예제

```c
#include <stdio.h>
#include <stdlib.h>

int main(void) {
    int status = 1;
    int *value = malloc(sizeof *value);
    if (value == NULL) {
        goto cleanup;
    }
    *value = 10;
    printf("%d\n", *value);
    status = 0;
    cleanup:
    free(value);
    return status;
}
```

## 실행 결과

```text
할당 성공 시: 10
```

## 동작 원리와 주의사항

레이블은 함수 이름이 아닙니다. `free(NULL)`은 아무 동작도 하지 않으므로 정리 경로를 합칠 수 있습니다. 단순 반복에는 `for`나 `while`이 더 명확합니다. 초기화를 건너뛰어 유효하지 않은 값을 사용하지 않도록 주의하세요.

## 직접 확인하기

할당 실패 경로에서도 해제 코드가 안전한 이유를 설명하세요.

---

[언어 목차](../README.md) · [이전](../11.%20array/README.md) · [다음](../13.%20pointer/README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[main.c](main.c)

```sh
gcc -std=c17 -Wall -Wextra -Wpedantic main.c -o app
```

빌드 후 Windows PowerShell은 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다.
