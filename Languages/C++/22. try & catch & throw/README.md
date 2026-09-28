# 예외 처리

## 핵심 개념

복구 가능한 오류를 예외로 전달하고 적절한 경계에서 처리합니다.

## 실행 방법

이 폴더에서 `g++ -std=c++17 -Wall -Wextra -Wpedantic main.cpp -o app`으로 빌드합니다. Windows PowerShell은 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다. MSVC 개발자 터미널에서는 `cl /std:c++17 /EHsc /W4 /utf-8 main.cpp /Fe:app.exe`를 사용할 수 있습니다.

[실습 파일](main.cpp)

## 실행 예제

```cpp
#include <iostream>
#include <stdexcept>

int main() {
    try { throw std::invalid_argument("bad input"); }
    catch (const std::exception& error) { std::cout << error.what() << '\n'; }
}
```

## 예상 결과

```text
bad input
```

## 동작 원리와 주의사항

예외는 const 참조로 받는 것이 일반적입니다. 소멸자에서 예외를 밖으로 던지지 않도록 설계하세요. 모든 오류를 예외로만 처리해야 하는 것은 아니며 API 계약에 맞춥니다.



## 직접 확인하기

함수에서 음수 입력을 검사하고 호출부에서 처리하세요.

---

[전체 목차](../README.md) · [이전](../21.%20unique_ptr%20%26%20move/README.md) · [다음](../23.%20ifstream%20%26%20ofstream/README.md)
