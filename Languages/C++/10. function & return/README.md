# 함수·매개변수·return

## 핵심 개념

함수는 매개변수와 반환 타입으로 호출 계약을 표현합니다.

## 실행 방법

이 폴더에서 `g++ -std=c++17 -Wall -Wextra -Wpedantic main.cpp -o app`으로 빌드합니다. Windows PowerShell은 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다. MSVC 개발자 터미널에서는 `cl /std:c++17 /EHsc /W4 /utf-8 main.cpp /Fe:app.exe`를 사용할 수 있습니다.

[실습 파일](main.cpp)

## 실행 예제

```cpp
#include <iostream>

int add(int a, int b = 1) { return a + b; }

int main() {
    std::cout << add(2) << ' ' << add(2, 3) << '\n';
}
```

## 예상 결과

```text
3 5
```

## 동작 원리와 주의사항

기본 인수는 생략한 인수에 적용됩니다. 반환 타입만 다르게 하여 오버로딩할 수는 없습니다. 값 전달과 참조 전달을 구분하세요.



## 직접 확인하기

두 실수를 더하는 오버로드를 추가하고 모호한 호출을 피하세요.

---

[전체 목차](../README.md) · [이전](../09.%20continue/README.md) · [다음](../11.%20array/README.md)
