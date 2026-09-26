# if·else if·else

## 핵심 개념

조건이 참인 첫 분기만 실행합니다. 중괄호로 범위를 명확히 표시합니다.

## 실행 방법

이 폴더에서 `g++ -std=c++17 -Wall -Wextra -Wpedantic main.cpp -o app`으로 빌드합니다. Windows PowerShell은 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다. MSVC 개발자 터미널에서는 `cl /std:c++17 /EHsc /W4 /utf-8 main.cpp /Fe:app.exe`를 사용할 수 있습니다.

[실습 파일](main.cpp)

## 실행 예제

```cpp
#include <iostream>

int main() {
    int score = 85;
    if (score >= 90) { std::cout << "A\n"; }
    else if (score >= 80) { std::cout << "B\n"; }
    else { std::cout << "C\n"; }
}
```

## 예상 결과

```text
B
```

## 동작 원리와 주의사항

조건에서 0은 false, 0이 아닌 산술 값은 true로 변환됩니다. 비교하려던 위치에 대입 =을 쓰지 않도록 주의하세요.



## 직접 확인하기

79·80·89·90을 시험하세요.

---

[전체 목차](../README.md) · [이전](../02.%20cin%20%26%20getline/README.md) · [다음](../04.%20switch%20%26%20case/README.md)
