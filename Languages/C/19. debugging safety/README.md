# 디버깅과 정의되지 않은 동작

## 핵심 개념

컴파일에 성공했다는 사실만으로 프로그램의 동작이 안전해지는 것은 아닙니다. 경계·수명·초기화·반환값을 함께 점검합니다.

## 실행 예제

```c
#include <stdio.h>
#include <assert.h>

int main(void) {
    int values[] = {2, 4, 6};
    size_t count = sizeof values / sizeof values[0];
    assert(count == 3);
    int total = 0;
    for (size_t i = 0; i < count; i++) {
        total += values[i];
    }
    assert(total == 12);
    printf("%d\n", total);
    return 0;
}
```

## 실행 결과

```text
12
```

## 동작 원리와 주의사항

`assert`는 내부 불변식 확인용입니다. `NDEBUG`를 정의하면 제거될 수 있으므로 입력 검증이나 반드시 실행해야 할 작업을 넣지 마세요. 배열 경계 초과, 미초기화 값 읽기, 해제 후 접근, 부호 있는 정수 오버플로는 대표적인 오류입니다.

## 점검 명령

GCC/Clang의 지원 환경에서는 다음처럼 런타임 검사를 추가할 수 있습니다. Windows 배포판에 따라 sanitizer 지원 여부가 다릅니다.

```sh
gcc -std=c17 -Wall -Wextra -Wpedantic -g -fsanitize=address,undefined main.c -o app
```

경고를 먼저 해결하고, 디버거의 중단점으로 인덱스와 포인터 수명을 관찰하세요. sanitizer도 실행되지 않은 경로의 모든 결함을 증명해 주지는 않습니다.

## 직접 확인하기

합계 기대값을 바꾸어 assertion 실패를 관찰한 후 복구하세요.

---

[언어 목차](../README.md) · [이전](../18.%20header%20build/README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[main.c](main.c)

```sh
gcc -std=c17 -Wall -Wextra -Wpedantic main.c -o app
```

빌드 후 Windows PowerShell은 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다.
