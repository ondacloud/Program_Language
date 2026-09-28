# class·생성자·캡슐화

## 핵심 개념

생성자에서 유효한 상태를 만들고 멤버 함수로 동작을 제공합니다.

## 실행 방법

이 폴더에서 `g++ -std=c++17 -Wall -Wextra -Wpedantic main.cpp -o app`으로 빌드합니다. Windows PowerShell은 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다. MSVC 개발자 터미널에서는 `cl /std:c++17 /EHsc /W4 /utf-8 main.cpp /Fe:app.exe`를 사용할 수 있습니다.

[실습 파일](main.cpp)

## 실행 예제

```cpp
#include <iostream>

class Counter {
    int value_;
public:
    explicit Counter(int value) : value_(value) {}
    void increment() { ++value_; }
    int get() const { return value_; }
};

int main() {
    Counter value{2};
    value.increment();
    std::cout << value.get() << '\n';
}
```

## 예상 결과

```text
3
```

## 동작 원리와 주의사항

멤버 초기화 목록을 사용합니다. const 멤버 함수는 객체를 수정하지 않는 호출 계약입니다. explicit은 의도하지 않은 암시적 변환을 줄입니다.



## 직접 확인하기

감소 시 음수가 되지 않도록 메서드를 추가하세요.

---

[전체 목차](../README.md) · [이전](../16.%20struct/README.md) · [다음](../18.%20destructor%20%26%20RAII/README.md)
