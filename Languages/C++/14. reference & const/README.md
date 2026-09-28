# 참조·const·auto

## 핵심 개념

참조는 기존 객체의 별칭입니다. const 참조는 해당 참조를 통한 수정을 막습니다.

## 실행 방법

이 폴더에서 `g++ -std=c++17 -Wall -Wextra -Wpedantic main.cpp -o app`으로 빌드합니다. Windows PowerShell은 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다. MSVC 개발자 터미널에서는 `cl /std:c++17 /EHsc /W4 /utf-8 main.cpp /Fe:app.exe`를 사용할 수 있습니다.

[실습 파일](main.cpp)

## 실행 예제

```cpp
#include <iostream>

int main() {
    int value = 3;
    int& alias = value;
    alias += 2;
    const int& view = value;
    auto copy = value;
    copy = 9;
    std::cout << view << ' ' << copy << '\n';
}
```

## 예상 결과

```text
5 9
```

## 동작 원리와 주의사항

참조는 초기화가 필요하고 다른 객체로 재바인딩할 수 없습니다. auto가 항상 참조를 유지하는 것은 아니므로 auto&와 구분합니다. 지역 객체를 가리키는 참조를 반환하지 마세요.



## 직접 확인하기

view를 수정하면 왜 컴파일 오류가 나는지 설명하세요.

---

[전체 목차](../README.md) · [이전](../13.%20string/README.md) · [다음](../15.%20pointer%20%26%20nullptr/README.md)
