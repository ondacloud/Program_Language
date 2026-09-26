# 표준 출력 — printf

## 핵심 개념

`printf`는 `<stdio.h>`의 서식 출력 함수입니다. 서식 지정자와 실제 인수 타입이 맞아야 합니다.

## 실행 예제

```c
#include <stdio.h>

int main(void) {
    int count = 3;
    double price = 2.5;
    printf("count=%d price=%.2f\n", count, price);
    printf("%s %c %zu\n", "C", 'A', sizeof(char));
    return 0;
}
```

## 실행 결과

```text
count=3 price=2.50
C A 1
```

## 동작 원리와 주의사항

- `%d`: `int`, `%u`: `unsigned int`, `%ld`: `long`, `%lld`: `long long`, `%zu`: `size_t`.
- `%f`는 `double`을 출력하며 `float` 인수도 `double`로 승격됩니다. `long double`은 `%Lf`입니다.
- `%c`는 문자, `%s`는 널 종료 문자열, `%p`는 `(void *)`로 변환한 포인터입니다.
- `printf`의 `%f`와 `scanf`의 `%f`를 혼동하지 마세요. 입력에서는 `float *`와 `double *`를 구분합니다.
- 사용자 문자열은 `printf(text)` 대신 `printf("%s", text)`로 출력합니다.

## 직접 확인하기

`%.2f`를 `%.1f`로 바꾸세요. 표시 자릿수만 바뀌며 변수의 값 자체는 변하지 않습니다.

---

[언어 목차](../README.md) · [이전](../00.%20operator/README.md) · [다음](../02.%20scanf%20%26%20scanf_s/README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[main.c](main.c)

```sh
gcc -std=c17 -Wall -Wextra -Wpedantic main.c -o app
```

빌드 후 Windows PowerShell은 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다.
