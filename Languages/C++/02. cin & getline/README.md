# std::cin·std::getline

## 핵심 개념

>>는 공백으로 구분된 값을 읽고 getline은 한 줄을 읽습니다. 입력 실패를 반드시 검사합니다.

## 실행 방법

이 폴더에서 `g++ -std=c++17 -Wall -Wextra -Wpedantic main.cpp -o app`으로 빌드합니다. Windows PowerShell은 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다. MSVC 개발자 터미널에서는 `cl /std:c++17 /EHsc /W4 /utf-8 main.cpp /Fe:app.exe`를 사용할 수 있습니다.

실행 후 아래 값을 입력하세요. [input.txt](input.txt)에도 같은 입력을 제공합니다.

```text
20
Alice Kim
```

[실습 파일](main.cpp)

## 실행 예제

```cpp
#include <iostream>
#include <string>

int main() {
    int age;
    std::string name;
    if (!(std::cin >> age)) { std::cerr << "invalid age\n"; return 1; }
    std::getline(std::cin >> std::ws, name);
    if (!std::cin) { std::cerr << "invalid name\n"; return 1; }
    std::cout << age << ' ' << name << '\n';
}
```

## 예상 결과

```text
20 Alice Kim
```

## 동작 원리와 주의사항

>> 뒤의 줄바꿈 때문에 getline이 빈 줄을 읽는 상황을 주의하세요. std::ws는 선행 공백 전체를 건너뛰므로 공백으로 시작하는 이름이나 빈 줄을 보존하려면 별도 정책이 필요합니다. 스트림 실패 상태를 무시한 채 값을 사용하지 마세요.



## 직접 확인하기

나이에 문자를 입력하고 종료 코드를 확인하세요. 공백이 포함된 이름도 한 줄로 읽히는지 확인하세요.

---

[전체 목차](../README.md) · [이전](../01.%20cout%20%26%20cerr/README.md) · [다음](../03.%20if%20%26%20else/README.md)
