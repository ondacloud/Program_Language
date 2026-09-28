# std::thread·std::mutex

## 핵심 개념

동시에 실행하는 작업과 공유 상태 접근을 구분합니다.

## 실행 방법

GCC/Clang 환경은 `g++ -std=c++17 -Wall -Wextra -pthread main.cpp -o app`, MSVC 개발자 터미널은 `cl /std:c++17 /EHsc /W4 /utf-8 main.cpp /Fe:app.exe`로 빌드합니다. 생성한 프로그램을 실행하세요.

[실습 파일](main.cpp)

## 실행 예제

```cpp
#include <iostream>
#include <thread>
#include <mutex>

int main() {
    int count = 0;
    std::mutex mutex;
    auto work = [&] {
        for (int i = 0; i < 100; ++i) {
            std::lock_guard<std::mutex> lock(mutex);
            ++count;
        }
    };
    std::thread first(work), second(work);
    first.join(); second.join();
    std::cout << count << '\n';
}
```

## 예상 결과

```text
200
```

## 동작 원리와 주의사항

공유 변수의 동시 쓰기를 mutex로 보호합니다. join 가능한 thread 객체를 정리하지 않으면 프로그램이 종료될 수 있습니다. 예외를 고려한 실무 코드에는 스레드 수명 관리도 필요합니다.



## 직접 확인하기

mutex를 제거하는 대신 atomic을 사용한 버전을 작성하세요.

---

[전체 목차](../README.md) · [이전](../27.%20include%20%26%20namespace/README.md) · [다음](../29.%20assert%20%26%20static_assert/README.md)
