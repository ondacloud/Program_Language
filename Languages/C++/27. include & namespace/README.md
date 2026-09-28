# 헤더·namespace·분할 컴파일

## 핵심 개념

선언과 정의를 나누고 namespace로 이름 충돌을 줄입니다.

## 실행 방법

이 폴더에서 `g++ -std=c++17 -Wall -Wextra -Wpedantic main.cpp calc.cpp -o app`으로 빌드합니다. MSVC는 `cl /std:c++17 /EHsc /W4 /utf-8 main.cpp calc.cpp /Fe:app.exe`입니다. Windows는 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다.

[실습 파일](main.cpp)

## 실행 예제

```cpp
#include <iostream>

#include "calc.h"

int main() {
    std::cout << study::add(2, 3) << '\n';
}
```

## 예상 결과

```text
5
```

## 동작 원리와 주의사항

헤더에는 중복 포함 방지 장치를 두고 비-inline 함수 정의는 소스 파일에 둡니다. 헤더에서 using namespace std를 전역에 두지 마세요. 아래 실행은 calc.cpp도 함께 컴파일해야 합니다.

동봉 파일: [calc.h](calc.h) · [calc.cpp](calc.cpp)

## 직접 확인하기

곱셈 함수를 선언·정의·호출하고 링크 누락 오류를 확인하세요.

---

[전체 목차](../README.md) · [이전](../26.%20enum%20class%20%26%20optional/README.md) · [다음](../28.%20thread%20%26%20mutex/README.md)
