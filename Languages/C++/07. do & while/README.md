# do·while

## 핵심 개념

본문을 먼저 실행하고 조건을 검사하므로 최소 한 번 실행됩니다.

## 실행 방법

이 폴더에서 `g++ -std=c++17 -Wall -Wextra -Wpedantic main.cpp -o app`으로 빌드합니다. Windows PowerShell은 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다. MSVC 개발자 터미널에서는 `cl /std:c++17 /EHsc /W4 /utf-8 main.cpp /Fe:app.exe`를 사용할 수 있습니다.

[실습 파일](main.cpp)

## 실행 예제

```cpp
#include <iostream>

int main() {
    int n = 3;
    do { std::cout << n << '\n'; ++n; } while (n < 3);
}
```

## 예상 결과

```text
3
```

## 동작 원리와 주의사항

마지막 while 뒤에는 세미콜론을 붙입니다. 입력 재시도처럼 먼저 작업한 뒤 판단하는 흐름에 사용할 수 있습니다.



## 직접 확인하기

같은 조건의 while과 비교하세요.

---

[전체 목차](../README.md) · [이전](../06.%20while/README.md) · [다음](../08.%20break/README.md)
