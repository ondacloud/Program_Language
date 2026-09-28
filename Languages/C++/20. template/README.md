# template

## 핵심 개념

타입을 매개변수로 받아 같은 알고리즘을 여러 타입에 적용합니다.

## 실행 방법

이 폴더에서 `g++ -std=c++17 -Wall -Wextra -Wpedantic main.cpp -o app`으로 빌드합니다. Windows PowerShell은 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다. MSVC 개발자 터미널에서는 `cl /std:c++17 /EHsc /W4 /utf-8 main.cpp /Fe:app.exe`를 사용할 수 있습니다.

[실습 파일](main.cpp)

## 실행 예제

```cpp
#include <iostream>

template <typename T> T twice(T value) { return value + value; }

int main() {
    std::cout << twice(3) << ' ' << twice(2.5) << '\n';
}
```

## 예상 결과

```text
6 5
```

## 동작 원리와 주의사항

사용한 연산을 타입이 지원해야 합니다. 템플릿 정의는 인스턴스화하는 곳에서 볼 수 있어야 하므로 보통 헤더에 둡니다. C++20 concepts는 이 C++17 예제의 범위 밖입니다.



## 직접 확인하기

std::string으로 twice를 호출할 때 어떤 연산이 사용되는지 확인하세요.

---

[전체 목차](../README.md) · [이전](../19.%20virtual%20%26%20override/README.md) · [다음](../21.%20unique_ptr%20%26%20move/README.md)
