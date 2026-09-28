# continue — 다음 반복

## 핵심 개념

현재 반복에서 남은 본문을 건너뜁니다.

## 실행 예제

```c
#include <stdio.h>

int main(void) {
    for (int i = 1; i <= 4; i++) {
        if (i % 2 == 0) {
            continue;
        }
        printf("%d\n", i);
    }
    return 0;
}
```

## 실행 결과

```text
1
3
```

## 동작 원리와 주의사항

`for`에서는 증감식으로 이동한 뒤 조건을 검사합니다. `while`에서는 조건 검사로 이동하므로 본문 끝에만 갱신이 있으면 갱신을 건너뛸 수 있습니다.

## 직접 확인하기

짝수만 출력하도록 조건을 바꾸세요. 답: 나머지가 0이 아닐 때 continue.

---

[언어 목차](../README.md) · [이전](../08.%20break/README.md) · [다음](../10.%20function/README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[main.c](main.c)

```sh
gcc -std=c17 -Wall -Wextra -Wpedantic main.c -o app
```

빌드 후 Windows PowerShell은 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다.
