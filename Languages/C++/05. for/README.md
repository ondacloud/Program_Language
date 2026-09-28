# for·범위 기반 for

## 핵심 개념

횟수 반복과 컬렉션 요소 순회를 각각 표현할 수 있습니다.

## 실행 방법

이 폴더에서 `g++ -std=c++17 -Wall -Wextra -Wpedantic main.cpp -o app`으로 빌드합니다. Windows PowerShell은 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다. MSVC 개발자 터미널에서는 `cl /std:c++17 /EHsc /W4 /utf-8 main.cpp /Fe:app.exe`를 사용할 수 있습니다.

[실습 파일](main.cpp)

## 실행 예제

```cpp
#include <iostream>
#include <initializer_list>

int main() {
    int total = 0;
    for (int i = 1; i <= 3; ++i) { total += i; }
    std::cout << total << '\n';
    for (int value : {10, 20}) { std::cout << value << '\n'; }
}
```

## 예상 결과

```text
6
10
20
```

## 동작 원리와 주의사항

범위 기반 for의 auto value는 복사, auto& value는 참조입니다. 수정하지 않을 큰 객체는 const auto&로 불필요한 복사를 줄일 수 있습니다.



## 직접 확인하기

범위의 값을 수정할 때 참조가 필요한 이유를 설명하세요.

---

[전체 목차](../README.md) · [이전](../04.%20switch%20%26%20case/README.md) · [다음](../06.%20while/README.md)
