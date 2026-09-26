# std::string

## 핵심 개념

문자열을 소유하며 길이와 메모리를 관리합니다.

## 실행 방법

이 폴더에서 `g++ -std=c++17 -Wall -Wextra -Wpedantic main.cpp -o app`으로 빌드합니다. Windows PowerShell은 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다. MSVC 개발자 터미널에서는 `cl /std:c++17 /EHsc /W4 /utf-8 main.cpp /Fe:app.exe`를 사용할 수 있습니다.

[실습 파일](main.cpp)

## 실행 예제

```cpp
#include <iostream>
#include <string>

int main() {
    std::string text = "Hello";
    text += " C++";
    std::cout << text << '\n';
    std::cout << text.size() << ' ' << text.substr(0, 5) << '\n';
}
```

## 예상 결과

```text
Hello C++
9 Hello
```

## 동작 원리와 주의사항

size는 char 단위 수이며 UTF-8에서 사용자에게 보이는 글자 수와 같지 않습니다. find 실패는 npos입니다. 문자열을 수정하면 c_str 포인터의 유효성이 바뀔 수 있습니다.



## 직접 확인하기

find로 없는 문자열을 찾고 npos와 비교하세요.

---

[전체 목차](../README.md) · [이전](../12.%20vector/README.md) · [다음](../14.%20reference%20%26%20const/README.md)
