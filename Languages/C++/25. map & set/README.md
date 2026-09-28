# std::map·std::set

## 핵심 개념

키로 값을 찾거나 중복 없는 집합을 표현합니다.

## 실행 방법

이 폴더에서 `g++ -std=c++17 -Wall -Wextra -Wpedantic main.cpp -o app`으로 빌드합니다. Windows PowerShell은 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다. MSVC 개발자 터미널에서는 `cl /std:c++17 /EHsc /W4 /utf-8 main.cpp /Fe:app.exe`를 사용할 수 있습니다.

[실습 파일](main.cpp)

## 실행 예제

```cpp
#include <iostream>
#include <map>
#include <set>
#include <string>

int main() {
    std::map<std::string, int> counts;
    ++counts["a"]; ++counts["a"]; ++counts["b"];
    std::set<int> unique{3, 1, 3};
    std::cout << counts.at("a") << ' ' << unique.size() << '\n';
}
```

## 예상 결과

```text
2 2
```

## 동작 원리와 주의사항

map[key]는 없는 키를 기본값으로 삽입할 수 있습니다. 조회만 하려면 find나 at을 선택하세요. map·set은 키 순서로 정렬되며 unordered 계열은 순회 순서를 보장하지 않습니다.



## 직접 확인하기

없는 키에 []와 at을 적용해 차이를 확인하세요.

---

[전체 목차](../README.md) · [이전](../24.%20sort%20%26%20lambda/README.md) · [다음](../26.%20enum%20class%20%26%20optional/README.md)
