# std::array

## 핵심 개념

타입과 길이가 고정된 연속 컬렉션입니다.

## 실행 방법

이 폴더에서 `g++ -std=c++17 -Wall -Wextra -Wpedantic main.cpp -o app`으로 빌드합니다. Windows PowerShell은 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다. MSVC 개발자 터미널에서는 `cl /std:c++17 /EHsc /W4 /utf-8 main.cpp /Fe:app.exe`를 사용할 수 있습니다.

[실습 파일](main.cpp)

## 실행 예제

```cpp
#include <iostream>
#include <array>

int main() {
    std::array<int, 3> values{10, 20, 30};
    std::cout << values.size() << ' ' << values.at(1) << '\n';
}
```

## 예상 결과

```text
3 20
```

## 동작 원리와 주의사항

[]는 경계를 검사하지 않습니다. at은 범위를 벗어나면 예외를 던집니다. std::array의 길이는 타입의 일부이고 초기화하지 않은 기본형 원소를 읽으면 안 됩니다.



## 직접 확인하기

at(3)을 호출하고 예외를 확인하세요.

---

[전체 목차](../README.md) · [이전](../10.%20function%20%26%20return/README.md) · [다음](../12.%20vector/README.md)
