# switch·case·default

## 핵심 개념

정수나 열거형 값에 따라 분기합니다. 일반 문자열은 switch 조건으로 직접 사용하지 않습니다.

## 실행 방법

이 폴더에서 `g++ -std=c++17 -Wall -Wextra -Wpedantic main.cpp -o app`으로 빌드합니다. Windows PowerShell은 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다. MSVC 개발자 터미널에서는 `cl /std:c++17 /EHsc /W4 /utf-8 main.cpp /Fe:app.exe`를 사용할 수 있습니다.

[실습 파일](main.cpp)

## 실행 예제

```cpp
#include <iostream>

int main() {
    int menu = 2;
    switch (menu) {
    case 1: std::cout << "open\n"; break;
    case 2: std::cout << "save\n"; break;
    default: std::cout << "unknown\n";
    }
}
```

## 예상 결과

```text
save
```

## 동작 원리와 주의사항

break를 생략하면 다음 case로 이어질 수 있습니다. 의도적 fallthrough는 C++17의 [[fallthrough]]로 표현할 수 있습니다. case 값은 상수식이어야 합니다.



## 직접 확인하기

없는 번호를 넣고 default를 확인하세요.

---

[전체 목차](../README.md) · [이전](../03.%20if%20%26%20else/README.md) · [다음](../05.%20for/README.md)
