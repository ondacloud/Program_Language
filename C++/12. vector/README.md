# std::vector

## 핵심 개념

크기를 늘리거나 줄일 수 있는 연속 컬렉션입니다.

## 실행 방법

이 폴더에서 `g++ -std=c++17 -Wall -Wextra -Wpedantic main.cpp -o app`으로 빌드합니다. Windows PowerShell은 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다. MSVC 개발자 터미널에서는 `cl /std:c++17 /EHsc /W4 /utf-8 main.cpp /Fe:app.exe`를 사용할 수 있습니다.

[실습 파일](main.cpp)

## 실행 예제

```cpp
#include <iostream>
#include <vector>

int main() {
    std::vector<int> values{10, 20};
    values.push_back(30);
    values[0] = 5;
    std::cout << values.size() << ' ' << values.front() << ' ' << values.back() << '\n';
}
```

## 예상 결과

```text
3 5 30
```

## 동작 원리와 주의사항

size는 원소 수, capacity는 재할당 없이 담을 수 있는 용량입니다. 재할당은 기존 포인터·참조·반복자를 무효화할 수 있습니다. 빈 vector에 front·back을 호출하지 마세요.



## 직접 확인하기

reserve를 사용하고 size가 변하지 않는지 확인하세요.

---

[전체 목차](../README.md) · [이전](../11.%20array/README.md) · [다음](../13.%20string/README.md)
