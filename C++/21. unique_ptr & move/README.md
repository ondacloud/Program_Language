# std::unique_ptr·std::move

## 핵심 개념

unique_ptr는 단일 소유권을 표현하고 이동으로 소유권을 넘깁니다.

## 실행 방법

이 폴더에서 `g++ -std=c++17 -Wall -Wextra -Wpedantic main.cpp -o app`으로 빌드합니다. Windows PowerShell은 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다. MSVC 개발자 터미널에서는 `cl /std:c++17 /EHsc /W4 /utf-8 main.cpp /Fe:app.exe`를 사용할 수 있습니다.

[실습 파일](main.cpp)

## 실행 예제

```cpp
#include <iostream>
#include <memory>
#include <utility>

int main() {
    auto first = std::make_unique<int>(42);
    auto second = std::move(first);
    std::cout << std::boolalpha << (first == nullptr) << ' ' << *second << '\n';
}
```

## 예상 결과

```text
true 42
```

## 동작 원리와 주의사항

std::move 자체는 이동을 실행하는 함수가 아니라 이동 가능한 값으로 취급하도록 변환합니다. 이 unique_ptr는 이동 후 비어 있습니다. 일반 객체의 이동 후 상태가 항상 null인 것은 아닙니다. shared_ptr는 공유 소유권이 실제 필요한 경우에 사용하세요.



## 직접 확인하기

first를 복사하면 왜 안 되는지 컴파일 오류를 확인하세요.

---

[전체 목차](../README.md) · [이전](../20.%20template/README.md) · [다음](../22.%20try%20%26%20catch%20%26%20throw/README.md)
