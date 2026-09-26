# 값에 따른 분기 — switch

## 핵심 개념

정수형 또는 열거형 표현식에 맞는 `case`로 이동합니다. `case`에는 정수 상수식이 필요합니다.

## 실행 예제

```c
#include <stdio.h>

int main(void) {
    int menu = 2;
    switch (menu) {
    case 1:
        puts("create");
        break;
    case 2:
    case 3:
        puts("read");
        break;
    default:
        puts("unknown");
        break;
    }
    return 0;
}
```

## 실행 결과

```text
read
```

## 동작 원리와 주의사항

`break`가 없으면 다음 레이블 아래 코드로 진행합니다. 이것을 fall-through라고 합니다. `default`는 일치하는 값이 없을 때 실행합니다. C의 `switch`로 문자열을 직접 비교할 수는 없습니다.

## 직접 확인하기

`menu`를 3, 9로 바꾸세요. 답: read, unknown.

---

[언어 목차](../README.md) · [이전](../03.%20if/README.md) · [다음](../05.%20for/README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[main.c](main.c)

```sh
gcc -std=c17 -Wall -Wextra -Wpedantic main.c -o app
```

빌드 후 Windows PowerShell은 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다.
