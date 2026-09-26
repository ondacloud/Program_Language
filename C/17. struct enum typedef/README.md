# 구조체, 열거형, typedef

## 핵심 개념

`struct`는 여러 값을 묶고, `enum`은 이름 있는 정수 상수를 정의하며, `typedef`는 타입에 별칭을 부여합니다.

## 실행 예제

```c
#include <stdio.h>

typedef enum { INACTIVE, ACTIVE } Status;
typedef struct {
    const char *name;
    Status status;
} User;

int main(void) {
    User user = {"Alice", ACTIVE};
    User *ptr = &user;
    printf("%s %d\n", ptr->name, user.status);
    return 0;
}
```

## 실행 결과

```text
Alice 1
```

## 동작 원리와 주의사항

값에는 `.`, 구조체 포인터에는 `->`를 사용합니다. 구조체 대입은 멤버 값을 복사하지만 포인터가 가리키는 데이터까지 깊게 복사하지 않습니다. 패딩 때문에 `sizeof(struct)`는 멤버 크기의 합보다 클 수 있습니다. `typedef` 자체가 새로운 별개 타입을 만드는 것은 아닙니다.

## 직접 확인하기

정수 age 멤버를 추가하고 초기화·출력하세요.

---

[언어 목차](../README.md) · [이전](../16.%20string/README.md) · [다음](../18.%20header%20build/README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[main.c](main.c)

```sh
gcc -std=c17 -Wall -Wextra -Wpedantic main.c -o app
```

빌드 후 Windows PowerShell은 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다.
