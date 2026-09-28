# 연산자와 자료형

## 핵심 개념

산술·대입·비교·논리·비트 연산을 구분합니다. 피연산자 타입에 따라 나눗셈 결과가 달라집니다.

## 실행 방법

이 폴더에서 `g++ -std=c++17 -Wall -Wextra -Wpedantic main.cpp -o app`으로 빌드합니다. Windows PowerShell은 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다. MSVC 개발자 터미널에서는 `cl /std:c++17 /EHsc /W4 /utf-8 main.cpp /Fe:app.exe`를 사용할 수 있습니다.

[실습 파일](main.cpp)

## 실행 예제

```cpp
#include <iostream>

int main() {
    int n = 7;
    std::cout << n + 2 << ' ' << n / 2 << ' ' << n % 2 << '\n';
    n += 3;
    std::cout << n << ' ' << 7.0 / 2 << '\n';
    std::cout << std::boolalpha << (n == 10 && n > 0) << '\n';
    std::cout << (5 & 3) << ' ' << (5 | 3) << ' ' << (5 << 1) << '\n';
}
```

## 예상 결과

```text
9 3 1
10 3.5
true
1 7 10
```

## 동작 원리와 주의사항

int의 /는 정수 나눗셈입니다. ==는 비교, =는 대입입니다. &&·||는 단락 평가하고 &·|는 비트 연산입니다. 부호 있는 정수 오버플로와 정수 0 나눗셈은 정의되지 않은 동작이므로 피해야 합니다. ++·--의 전위·후위를 한 식에 복잡하게 섞지 마세요.



## 직접 확인하기

괄호로 우선순위를 바꾸고 정수와 실수 나눗셈을 비교하세요. char·bool·double·int의 용도를 설명하세요.

---

[전체 목차](../README.md) · [다음](../01.%20cout%20%26%20cerr/README.md)
