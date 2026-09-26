# 배열 — 크기와 인덱스

## 핵심 개념

같은 타입의 원소를 연속된 메모리에 저장합니다. 길이가 3이면 유효 인덱스는 0, 1, 2입니다.

## 실행 예제

```c
#include <stdio.h>

int main(void) {
    int values[] = {10, 20, 30};
    size_t count = sizeof values / sizeof values[0];
    for (size_t i = 0; i < count; i++) {
        printf("%d\n", values[i]);
    }
    return 0;
}
```

## 실행 결과

```text
10
20
30
```

## 동작 원리와 주의사항

C는 배열 경계를 자동 검사하지 않습니다. 범위를 벗어난 접근은 정의되지 않은 동작입니다. `sizeof 배열 / sizeof 원소`는 실제 배열이 보이는 범위에서만 길이 계산에 사용합니다. 함수 매개변수의 `int values[]`는 포인터로 조정되므로 길이를 별도로 전달해야 합니다.

## 직접 확인하기

배열의 합을 계산하세요. 답: 60.

## 세부 문서

- [1차원 배열](1-dimensional%20array/README.md)
- [2차원 배열](2-dimensional%20array/README.md)
- [3차원 배열](3-dimensional%20array/README.md)

---

[언어 목차](../README.md) · [이전](../10.%20function/README.md) · [다음](../12.%20goto/README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[main.c](main.c)

```sh
gcc -std=c17 -Wall -Wextra -Wpedantic main.c -o app
```

빌드 후 Windows PowerShell은 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다.
