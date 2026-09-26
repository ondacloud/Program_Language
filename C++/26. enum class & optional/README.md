# enum class·std::optional

## 핵심 개념

이름 있는 선택지와 값이 없을 수 있는 결과를 타입으로 표현합니다.

## 실행 방법

이 폴더에서 `g++ -std=c++17 -Wall -Wextra -Wpedantic main.cpp -o app`으로 빌드합니다. Windows PowerShell은 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다. MSVC 개발자 터미널에서는 `cl /std:c++17 /EHsc /W4 /utf-8 main.cpp /Fe:app.exe`를 사용할 수 있습니다.

[실습 파일](main.cpp)

## 실행 예제

```cpp
#include <iostream>
#include <optional>

enum class Status { Ready, Done };

int main() {
    Status status = Status::Ready;
    std::optional<int> value = 7;
    std::cout << std::boolalpha << (status == Status::Ready) << ' ' << value.value_or(0) << '\n';
    value.reset();
    std::cout << value.value_or(0) << '\n';
}
```

## 예상 결과

```text
true 7
0
```

## 동작 원리와 주의사항

enum class는 열거자 이름 범위를 타입 안에 둡니다. 비어 있는 optional을 *로 역참조하지 마세요. 값 부재와 실패 원인을 함께 전달해야 한다면 더 풍부한 오류 모델이 필요합니다.



## 직접 확인하기

optional이 있는 경우와 없는 경우를 if로 처리하세요.

---

[전체 목차](../README.md) · [이전](../25.%20map%20%26%20set/README.md) · [다음](../27.%20include%20%26%20namespace/README.md)
