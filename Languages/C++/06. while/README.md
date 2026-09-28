# while

## 핵심 개념

조건을 먼저 검사하여 반복합니다.

## 실행 방법

이 폴더에서 `g++ -std=c++17 -Wall -Wextra -Wpedantic main.cpp -o app`으로 빌드합니다. Windows PowerShell은 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다. MSVC 개발자 터미널에서는 `cl /std:c++17 /EHsc /W4 /utf-8 main.cpp /Fe:app.exe`를 사용할 수 있습니다.

[실습 파일](main.cpp)

## 실행 예제

```cpp
#include <iostream>

int main() {
    int n = 0;
    while (n < 3) { std::cout << n << '\n'; ++n; }
}
```

## 예상 결과

```text
0
1
2
```

## 동작 원리와 주의사항

갱신문 누락은 무한 반복을 만들 수 있습니다. 처음부터 조건이 false이면 본문은 실행되지 않습니다.



## 직접 확인하기

초기값을 3으로 바꾸세요.

---

[전체 목차](../README.md) · [이전](../05.%20for/README.md) · [다음](../07.%20do%20%26%20while/README.md)
