# 포인터·역참조·nullptr

## 핵심 개념

포인터는 객체 주소를 담으며 nullptr로 아무 객체도 가리키지 않는 상태를 표현합니다.

## 실행 방법

이 폴더에서 `g++ -std=c++17 -Wall -Wextra -Wpedantic main.cpp -o app`으로 빌드합니다. Windows PowerShell은 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다. MSVC 개발자 터미널에서는 `cl /std:c++17 /EHsc /W4 /utf-8 main.cpp /Fe:app.exe`를 사용할 수 있습니다.

[실습 파일](main.cpp)

## 실행 예제

```cpp
#include <iostream>

int main() {
    int value = 3;
    int* ptr = &value;
    *ptr = 7;
    std::cout << value << '\n';
    ptr = nullptr;
    std::cout << std::boolalpha << (ptr == nullptr) << '\n';
}
```

## 예상 결과

```text
7
true
```

## 동작 원리와 주의사항

nullptr·해제된 객체·수명이 끝난 지역 객체를 역참조하면 안 됩니다. 포인터 타입 자체가 소유권을 설명하지 않으므로 소유 자원은 스마트 포인터 등으로 관리하세요.



## 직접 확인하기

참조와 포인터의 null 가능성·재대입 차이를 설명하세요.

---

[전체 목차](../README.md) · [이전](../14.%20reference%20%26%20const/README.md) · [다음](../16.%20struct/README.md)
