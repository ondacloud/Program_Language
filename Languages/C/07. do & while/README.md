# do-while 반복문

## 핵심 개념

본문을 먼저 실행하므로 최소 한 번 실행합니다. 끝의 `while (조건);`에는 세미콜론이 필요합니다.

## 실행 예제

```c
#include <stdio.h>

int main(void) {
    int n = 3;
    do {
        printf("%d\n", n);
        n++;
    } while (n < 3);
    return 0;
}
```

## 실행 결과

```text
3
```

## 동작 원리와 주의사항

메뉴를 먼저 보여 주고 재실행 여부를 검사할 때 유용합니다. 콜론 `:`이 아니라 세미콜론 `;`으로 끝냅니다.

## 직접 확인하기

같은 조건을 `while`로 바꾸면 출력이 없는 이유를 설명하세요.

---

[언어 목차](../README.md) · [이전](../06.%20while/README.md) · [다음](../08.%20break/README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[main.c](main.c)

```sh
gcc -std=c17 -Wall -Wextra -Wpedantic main.c -o app
```

빌드 후 Windows PowerShell은 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다.
