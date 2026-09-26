# 상속·virtual·override

## 핵심 개념

기반 타입 참조로 호출해도 실제 객체의 재정의된 동작을 실행할 수 있습니다.

## 실행 방법

이 폴더에서 `g++ -std=c++17 -Wall -Wextra -Wpedantic main.cpp -o app`으로 빌드합니다. Windows PowerShell은 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다. MSVC 개발자 터미널에서는 `cl /std:c++17 /EHsc /W4 /utf-8 main.cpp /Fe:app.exe`를 사용할 수 있습니다.

[실습 파일](main.cpp)

## 실행 예제

```cpp
#include <iostream>
#include <string>

struct Animal {
    virtual ~Animal() = default;
    virtual std::string sound() const = 0;
};
struct Dog : Animal {
    std::string sound() const override { return "woof"; }
};

int main() {
    Dog dog;
    const Animal& animal = dog;
    std::cout << animal.sound() << '\n';
}
```

## 예상 결과

```text
woof
```

## 동작 원리와 주의사항

다형적으로 삭제할 기반 클래스에는 가상 소멸자가 필요합니다. 값으로 기반 타입에 복사하면 객체 슬라이싱이 생길 수 있습니다. override는 의도한 재정의를 컴파일러가 확인하게 합니다.



## 직접 확인하기

다른 Animal 구현을 추가하세요.

---

[전체 목차](../README.md) · [이전](../18.%20destructor%20%26%20RAII/README.md) · [다음](../20.%20template/README.md)
