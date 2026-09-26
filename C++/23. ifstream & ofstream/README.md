# 파일 입출력

## 핵심 개념

fstream 계열은 파일을 스트림으로 다루며 스코프가 끝나면 닫습니다.

## 실행 방법

이 폴더에서 `g++ -std=c++17 -Wall -Wextra -Wpedantic main.cpp -o app`으로 빌드합니다. Windows PowerShell은 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다. MSVC 개발자 터미널에서는 `cl /std:c++17 /EHsc /W4 /utf-8 main.cpp /Fe:app.exe`를 사용할 수 있습니다.

[실습 파일](main.cpp)

## 실행 예제

```cpp
#include <iostream>
#include <fstream>
#include <string>

int main() {
    std::ifstream file("sample.txt");
    if (!file) { std::cerr << "open failed\n"; return 1; }
    std::string line;
    while (std::getline(file, line)) { std::cout << line << '\n'; }
    if (file.bad()) { return 1; }
}
```

## 예상 결과

```text
Hello C++
```

## 동작 원리와 주의사항

동봉한 sample.txt를 읽습니다. ofstream은 기본 모드에서 기존 파일을 잘라 쓸 수 있으므로 대상과 모드를 명확히 정하세요. 파일 경로는 보통 실행 작업 폴더 기준입니다. EOF와 읽기 오류를 구분하세요.



## 직접 확인하기

파일 이름을 바꾸어 열기 실패 경로를 확인하세요. 새 연습 파일에만 ofstream 쓰기를 구현하세요.

---

[전체 목차](../README.md) · [이전](../22.%20try%20%26%20catch%20%26%20throw/README.md) · [다음](../24.%20sort%20%26%20lambda/README.md)
