# 입력 — scanf와 scanf_s

## 핵심 개념

`scanf`는 입력을 지정한 타입으로 변환하여 전달받은 주소에 저장합니다. 반환값은 성공적으로 대입한 항목 수입니다.

## 실행 예제

```c
#include <stdio.h>

int main(void) {
    int age;
    char name[20];
    if (scanf("%d %19s", &age, name) != 2) {
        fputs("invalid input\n", stderr);
        return 1;
    }
    printf("%s: %d\n", name, age);
    return 0;
}
```

## 실행 결과

```text
입력: 20 Alice
출력: Alice: 20
```

## 동작 원리와 주의사항

- `name`은 배열이므로 이 예제에서 `&name`을 넘기지 않습니다. `%19s`는 널 문자 1칸을 남깁니다.
- `%s`는 공백 전까지만 읽습니다. 한 줄 입력은 `fgets`를 사용하고 숫자 검증에는 `strtol`을 고려하세요.
- `scanf("%f", &f)`에는 `float *`, `scanf("%lf", &d)`에는 `double *`를 전달합니다.
- `%c`는 공백도 읽습니다. 앞 공백을 건너뛰려면 `" %c"`처럼 씁니다.
- `_CRT_SECURE_NO_WARNINGS`는 MSVC의 경고 제어용이며 모든 컴파일러에서 필수인 코드가 아닙니다.
- `scanf_s`는 모든 C 환경에서 제공되지 않습니다. MSVC에서는 `%s`, `%c`, `%[`에 별도의 버퍼 크기 인수가 필요합니다. 크기 인수가 변환 개수에 포함되지는 않습니다.

## MSVC 전용 부분 예제

아래 코드는 `main` 안에 넣습니다. MSVC의 버퍼 크기 인수 타입은 `unsigned`입니다.

```c
char name[20];
if (scanf_s("%19s", name, (unsigned)sizeof name) == 1) {
    printf("%s\n", name);
}
```

참고: [Microsoft scanf_s 문서](https://learn.microsoft.com/en-us/cpp/c-runtime-library/reference/scanf-s-scanf-s-l-wscanf-s-wscanf-s-l?view=msvc-170).

## 직접 확인하기

이름에 공백을 넣으면 어떻게 될까요? 첫 단어까지만 읽힙니다. 긴 줄은 `fgets`와 버퍼 길이 검사를 사용하세요.

---

[언어 목차](../README.md) · [이전](../01.%20printf/README.md) · [다음](../03.%20if/README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[main.c](main.c) · [input.txt](input.txt)

```sh
gcc -std=c17 -Wall -Wextra -Wpedantic main.c -o app
```

빌드 후 Windows PowerShell은 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다.

입력을 요청하면 아래 내용을 순서대로 입력하세요. 같은 내용의 input.txt도 제공합니다.

```text
20 Alice
```

### 예제 2

`examples/02` 폴더로 이동하여 실행합니다.

[main.c](examples/02/main.c) · [input.txt](examples/02/input.txt)

```sh
cl /std:c17 /W4 /utf-8 main.c /Fe:app.exe
```

scanf_s 예제는 MSVC 개발자 터미널용입니다. Windows PowerShell에서 `.\app.exe`로 실행합니다. 일반 GCC의 scanf_s 지원을 가정하지 않습니다.

입력을 요청하면 아래 내용을 순서대로 입력하세요. 같은 내용의 input.txt도 제공합니다.

```text
Alice
```
