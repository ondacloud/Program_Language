# 함수 — 선언, 정의, 값 전달

## 핵심 개념

함수는 입력을 받아 작업하고 결과를 반환합니다. 호출하기 전에 선언 또는 정의가 보여야 합니다.

## 실행 예제

```c
#include <stdio.h>

int square(int value);  // 함수 선언

int square(int value) { // 함수 정의
    return value * value;
}

int main(void) {
    int value = 3;
    printf("%d\n", square(value));
    printf("%d\n", value);
    return 0;
}
```

## 실행 결과

```text
9
3
```

## 동작 원리와 주의사항

매개변수는 인수의 복사본입니다. 호출자 변수를 바꾸려면 주소를 전달하고 포인터로 접근합니다. C17에서 매개변수가 없는 함수는 `f(void)`로 선언합니다. 반환값이 없는 함수는 `void`를 사용합니다. 재귀 함수에는 종료 조건이 필요합니다.

## 직접 확인하기

두 정수 중 큰 값을 반환하는 `max_int` 함수를 만들고 같은 값도 시험하세요.

---

[언어 목차](../README.md) · [이전](../09.%20continue/README.md) · [다음](../11.%20array/README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[main.c](main.c)

```sh
gcc -std=c17 -Wall -Wextra -Wpedantic main.c -o app
```

빌드 후 Windows PowerShell은 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다.
