# for 반복문

## 핵심 개념

초기화 → 조건 검사 → 본문 → 증감 순서로 실행합니다. 조건이 거짓이면 종료합니다.

## 실행 예제

```c
#include <stdio.h>

int main(void) {
    for (int i = 1; i <= 3; i++) {
        printf("%d\n", i);
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

`return`을 반복문 안에 넣으면 첫 반복에서 함수 전체가 끝날 수 있습니다. 배열은 보통 `i < length` 조건을 씁니다. `for (;;)`는 종료 조건이 없는 반복입니다.

## 직접 확인하기

1부터 10까지 합을 출력하세요. 답: 55.

---

[언어 목차](../README.md) · [이전](../04.%20switch%20%26%20case/README.md) · [다음](../06.%20while/README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[main.c](main.c)

```sh
gcc -std=c17 -Wall -Wextra -Wpedantic main.c -o app
```

빌드 후 Windows PowerShell은 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다.
