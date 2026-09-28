# struct와 멤버

## 핵심 개념

서로 관련 있는 값을 하나의 타입으로 묶습니다.

## 실행 방법

이 폴더에서 `g++ -std=c++17 -Wall -Wextra -Wpedantic main.cpp -o app`으로 빌드합니다. Windows PowerShell은 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다. MSVC 개발자 터미널에서는 `cl /std:c++17 /EHsc /W4 /utf-8 main.cpp /Fe:app.exe`를 사용할 수 있습니다.

[실습 파일](main.cpp)

## 실행 예제

```cpp
#include <iostream>

struct Point { int x; int y; };

int main() {
    Point p{3, 4};
    std::cout << p.x << ' ' << p.y << '\n';
}
```

## 예상 결과

```text
3 4
```

## 동작 원리와 주의사항

struct의 기본 접근은 public, class의 기본 접근은 private입니다. 단순 데이터 묶음에는 구조체가 잘 맞지만 유지해야 할 불변 조건도 고려하세요.



## 직접 확인하기

좌표 이동 함수를 추가하세요.

---

[전체 목차](../README.md) · [이전](../15.%20pointer%20%26%20nullptr/README.md) · [다음](../17.%20class%20%26%20constructor/README.md)
