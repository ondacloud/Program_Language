# assert·static_assert

## 핵심 개념

런타임 가정과 컴파일 시 조건을 검사합니다.

## 실행 방법

이 폴더에서 `g++ -std=c++17 -Wall -Wextra -Wpedantic main.cpp -o app`으로 빌드합니다. Windows PowerShell은 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다. MSVC 개발자 터미널에서는 `cl /std:c++17 /EHsc /W4 /utf-8 main.cpp /Fe:app.exe`를 사용할 수 있습니다.

[실습 파일](main.cpp)

## 실행 예제

```cpp
#include <iostream>
#include <cassert>

int add(int a, int b) { return a + b; }

int main() {
    static_assert(sizeof(char) == 1, "char size unit");
    assert(add(2, 3) == 5);
    assert(add(-1, 1) == 0);
    std::cout << "checks passed\n";
}
```

## 예상 결과

```text
checks passed
```

## 동작 원리와 주의사항

NDEBUG를 정의하면 assert가 비활성화될 수 있으므로 사용자 입력 검증이나 반드시 실행할 동작을 assert 안에 넣지 마세요. 실제 테스트에는 실패 사례·경계값·자원 정리도 포함합니다.



## 직접 확인하기

틀린 기대값으로 실패를 확인한 뒤 되돌리세요.

---

[전체 목차](../README.md) · [이전](../28.%20thread%20%26%20mutex/README.md)
