# std::sort·람다

## 핵심 개념

알고리즘에 함수를 전달하여 비교·변환 동작을 지정합니다.

## 실행 방법

이 폴더에서 `g++ -std=c++17 -Wall -Wextra -Wpedantic main.cpp -o app`으로 빌드합니다. Windows PowerShell은 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다. MSVC 개발자 터미널에서는 `cl /std:c++17 /EHsc /W4 /utf-8 main.cpp /Fe:app.exe`를 사용할 수 있습니다.

[실습 파일](main.cpp)

## 실행 예제

```cpp
#include <iostream>
#include <vector>
#include <algorithm>

int main() {
    std::vector<int> values{3, 1, 2};
    std::sort(values.begin(), values.end(), [](int a, int b) { return a > b; });
    for (std::size_t i = 0; i < values.size(); ++i) {
        if (i) std::cout << ' ';
        std::cout << values[i];
    }
    std::cout << '\n';
}
```

## 예상 결과

```text
3 2 1
```

## 동작 원리와 주의사항

비교자는 엄격한 약한 순서를 만족해야 하므로 >=처럼 동등한 값에도 true를 주지 마세요. 람다의 참조 캡처는 참조 대상 수명보다 오래 사용하면 위험합니다.



## 직접 확인하기

오름차순으로 바꾸고 중복 값도 넣어 보세요.

---

[전체 목차](../README.md) · [이전](../23.%20ifstream%20%26%20ofstream/README.md) · [다음](../25.%20map%20%26%20set/README.md)
