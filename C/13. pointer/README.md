# 포인터 — 주소와 역참조

## 핵심 개념

포인터는 객체의 주소를 저장합니다. `&value`는 주소를 얻고 `*ptr`은 그 주소의 객체에 접근합니다.

## 실행 예제

```c
#include <stdio.h>

int main(void) {
    int value = 10;
    int *ptr = &value;
    printf("%d\n", *ptr);
    *ptr = 20;
    printf("%d\n", value);
    printf("%p\n", (void *)ptr);
    return 0;
}
```

## 실행 결과

```text
10
20
주소값 (실행마다 달라질 수 있음)
```

## 동작 원리와 주의사항

- 주소 출력은 `%d`가 아니라 `%p`와 `(void *)`를 사용합니다.
- 초기화하지 않은 포인터, `NULL`, 수명이 끝난 객체의 주소를 역참조하지 마세요.
- 지역 변수 주소를 반환하면 함수가 끝난 뒤 유효한 객체를 가리키지 않게 됩니다.
- `const int *p`는 p를 통한 값 변경을 막고, `int *const p`는 포인터 재대입을 막습니다.
- 포인터 덧셈은 해당 타입 원소 단위로 이동합니다. 같은 배열 범위와 끝 다음 위치까지만 계산하고 끝 다음 위치는 역참조하지 않습니다.

## 직접 확인하기

`*ptr = 20`을 `value = 30`으로 바꾸고 `*ptr`을 출력하세요. 같은 객체를 가리키므로 30입니다.

---

[언어 목차](../README.md) · [이전](../12.%20goto/README.md) · [다음](../14.%20open%20file/README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[main.c](main.c)

```sh
gcc -std=c17 -Wall -Wextra -Wpedantic main.c -o app
```

빌드 후 Windows PowerShell은 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다.
