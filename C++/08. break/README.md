# break

## 핵심 개념

반복 종료와 다음 반복 이동을 구별합니다.

## 실행 방법

이 폴더에서 `g++ -std=c++17 -Wall -Wextra -Wpedantic main.cpp -o app`으로 빌드합니다. Windows PowerShell은 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다. MSVC 개발자 터미널에서는 `cl /std:c++17 /EHsc /W4 /utf-8 main.cpp /Fe:app.exe`를 사용할 수 있습니다.

[실습 파일](main.cpp)

## 실행 예제

```cpp
#include <iostream>

int main() {
    for (int n = 0; n < 4; ++n) {
        if (n == 2) { break; }
        std::cout << n << '\n';
    }
}
```

## 예상 결과

```text
0
1
```

## 동작 원리와 주의사항

break는 가장 가까운 반복문 또는 switch를 종료하고 continue는 다음 반복으로 이동합니다. return은 함수 전체를 끝냅니다.



## 직접 확인하기

중첩 반복에서 어느 반복이 영향을 받는지 확인하세요.

---

[전체 목차](../README.md) · [이전](../07.%20do%20%26%20while/README.md) · [다음](../09.%20continue/README.md)
