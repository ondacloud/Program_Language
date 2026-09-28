# std::cout·std::cerr

## 핵심 개념

스트림에 << 연산자로 값을 삽입합니다. cout은 표준 출력, cerr는 표준 오류입니다.

## 실행 방법

이 폴더에서 `g++ -std=c++17 -Wall -Wextra -Wpedantic main.cpp -o app`으로 빌드합니다. Windows PowerShell은 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다. MSVC 개발자 터미널에서는 `cl /std:c++17 /EHsc /W4 /utf-8 main.cpp /Fe:app.exe`를 사용할 수 있습니다.

[실습 파일](main.cpp)

## 실행 예제

```cpp
#include <iostream>
#include <string>
#include <iomanip>

int main() {
    const std::string name = "Alice";
    std::cout << "Hello " << name << '\n';
    std::cout << std::fixed << std::setprecision(2) << 3.5 << '\n';
}
```

## 예상 결과

```text
Hello Alice
3.50
```

## 동작 원리와 주의사항

std::endl은 줄바꿈과 flush를 수행합니다. 매번 flush가 필요 없다면 \n을 사용합니다. fixed·setprecision 같은 서식 상태는 스트림에 유지됩니다. cerr로 진단을 보내면 결과 데이터와 분리할 수 있습니다.



## 직접 확인하기

cerr에 오류 문구를 출력하고 stdout만 파일로 리디렉션했을 때 차이를 확인하세요.

---

[전체 목차](../README.md) · [이전](../00.%20operator/README.md) · [다음](../02.%20cin%20%26%20getline/README.md)
