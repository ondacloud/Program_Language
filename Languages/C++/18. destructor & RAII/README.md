# 소멸자와 RAII

## 핵심 개념

객체 수명에 자원 수명을 연결하여 범위를 벗어날 때 자동으로 정리합니다.

## 실행 방법

이 폴더에서 `g++ -std=c++17 -Wall -Wextra -Wpedantic main.cpp -o app`으로 빌드합니다. Windows PowerShell은 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다. MSVC 개발자 터미널에서는 `cl /std:c++17 /EHsc /W4 /utf-8 main.cpp /Fe:app.exe`를 사용할 수 있습니다.

[실습 파일](main.cpp)

## 실행 예제

```cpp
#include <iostream>

struct Guard {
    Guard() { std::cout << "acquire\n"; }
    ~Guard() { std::cout << "release\n"; }
};

int main() {
    { Guard guard; std::cout << "body\n"; }
    std::cout << "after\n";
}
```

## 예상 결과

```text
acquire
body
release
after
```

## 동작 원리와 주의사항

예외가 전파되는 정상적인 스택 되감기에서도 지역 객체 소멸자가 실행됩니다. 강제 프로세스 종료까지 보장하는 것은 아닙니다. 직접 소유 클래스를 만들기보다 표준 컨테이너·스마트 포인터를 우선 사용하세요.



## 직접 확인하기

중첩 블록의 소멸 순서를 확인하세요.

---

[전체 목차](../README.md) · [이전](../17.%20class%20%26%20constructor/README.md) · [다음](../19.%20virtual%20%26%20override/README.md)
