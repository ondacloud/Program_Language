# C 학습 가이드

문법을 읽고 직접 실행하면서 동작 원리와 실패 조건을 확인하는 한국어 학습 노트입니다. 기본 설명 기준은 **C17**입니다. 이는 최신 버전이라는 뜻이 아니라 예제의 학습 기준입니다.

## 권장 학습 순서

자료형·입출력 → 조건·반복 → 함수·배열 → 포인터·문자열 → 메모리·파일 → 구조체·분할 빌드·디버깅

폴더 번호는 기존 경로를 유지하기 위한 번호입니다. 새로 보강된 기초 주제는 뒤 번호에 있어도 위 순서에 맞춰 함께 읽으세요. 각 문서는 독립적인 예제이므로 같은 이름의 클래스나 함수를 한 파일에 모두 붙이지 않습니다.

## 첫 프로그램 실행

`main.c` 파일에 저장하세요.

```c
#include <stdio.h>

int main(void) {
    puts("Hello C");
    return 0;
}
```

```sh
gcc -std=c17 -Wall -Wextra -Wpedantic main.c -o app
```

Windows PowerShell은 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다. GCC/Clang이 설치되어 있어야 합니다. MSVC 개발자 터미널에서는 `cl /std:c17 /W4 /utf-8 main.c`로 빌드할 수 있습니다.

## 문서 읽는 방법

1. 핵심 개념을 읽고 실행 결과를 먼저 예상합니다.
2. 예제를 실행하고 출력과 원본 데이터 변경을 관찰합니다.
3. 빈 값, 경계값, 잘못된 입력도 시도합니다.
4. 직접 확인하기 문제로 코드를 바꿔 봅니다.

전체 프로그램과 부분 예제를 구별하세요. 부분 예제는 해당 설명에 나온 위치에 넣고, 다중 파일 예제는 파일별로 저장합니다. 주소·스레드 순서·현재 시간 등은 실행마다 다를 수 있습니다.

## 전체 목차

| 번호 | 주제 |
|---|---|
| 00 | [자료형과 연산자](00.%20operator/README.md) |
| 01 | [표준 출력 — printf](01.%20printf/README.md) |
| 02 | [입력 — scanf와 scanf_s](02.%20scanf%20%26%20scanf_s/README.md) |
| 03 | [조건 분기 — if / else if / else](03.%20if/README.md) |
| 04 | [값에 따른 분기 — switch](04.%20switch%20%26%20case/README.md) |
| 05 | [for 반복문](05.%20for/README.md) |
| 06 | [while 반복문](06.%20while/README.md) |
| 07 | [do-while 반복문](07.%20do%20%26%20while/README.md) |
| 08 | [break — 반복 종료](08.%20break/README.md) |
| 09 | [continue — 다음 반복](09.%20continue/README.md) |
| 10 | [함수 — 선언, 정의, 값 전달](10.%20function/README.md) |
| 11 | [배열 — 크기와 인덱스](11.%20array/README.md) |
| 12 | [goto — 레이블로 이동](12.%20goto/README.md) |
| 13 | [포인터 — 주소와 역참조](13.%20pointer/README.md) |
| 14 | [파일 입출력 — fopen / fclose](14.%20open%20file/README.md) |
| 15 | [동적 메모리 — malloc / calloc / realloc / free](15.%20Dynamic%20Memory%20Allocation/README.md) |
| 16 | [문자열 — 널 종료와 버퍼](16.%20string/README.md) |
| 17 | [구조체, 열거형, typedef](17.%20struct%20enum%20typedef/README.md) |
| 18 | [헤더와 분할 컴파일](18.%20header%20build/README.md) |
| 19 | [디버깅과 정의되지 않은 동작](19.%20debugging%20safety/README.md) |

## 공식 참고 자료

- [표준 초안 C11 N1570 ](https://www.open-std.org/jtc1/sc22/wg14/www/docs/n1570.pdf)
- [GCC 경고 옵션](https://gcc.gnu.org/onlinedocs/gcc/Warning-Options.html)

[전체 언어 가이드](../README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[main.c](main.c)

```sh
gcc -std=c17 -Wall -Wextra -Wpedantic main.c -o app
```

빌드 후 Windows PowerShell은 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다.