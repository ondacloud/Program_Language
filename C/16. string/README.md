# 문자열 — 널 종료와 버퍼

## 핵심 개념

C 문자열은 끝에 널 문자 `'\0'`가 있는 `char` 배열입니다. 데이터 길이와 버퍼 용량을 구분해야 합니다.

## 실행 예제

```c
#include <stdio.h>
#include <string.h>

int main(void) {
    char text[16] = "Hello";
    printf("%zu %zu\n", strlen(text), sizeof text);
    int written = snprintf(text, sizeof text, "%s %d", "C", 17);
    if (written < 0 || (size_t)written >= sizeof text) {
        return 1;
    }
    printf("%s\n", text);
    return 0;
}
```

## 실행 결과

```text
5 16
C 17
```

## 동작 원리와 주의사항

`strlen`은 종료 널 앞의 바이트 수를 반환합니다. 한글 문자 수와 같지 않을 수 있습니다. `strcmp(a, b) == 0`으로 내용을 비교하며 `a == b`는 주소 비교입니다. 문자열 리터럴은 수정하지 않고 `const char *`로 참조하세요. `strncpy`는 항상 널 종료를 보장하지 않습니다.

## 직접 확인하기

버퍼를 4칸으로 줄이면 `snprintf` 결과 검사에서 잘림을 감지하는지 확인하세요.

---

[언어 목차](../README.md) · [이전](../15.%20Dynamic%20Memory%20Allocation/README.md) · [다음](../17.%20struct%20enum%20typedef/README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[main.c](main.c)

```sh
gcc -std=c17 -Wall -Wextra -Wpedantic main.c -o app
```

빌드 후 Windows PowerShell은 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다.
