# C++ 학습 가이드

**학습 기준: C++17.** 최신 버전이라는 뜻이 아니라 예제의 기준입니다.

분류용 상위 폴더 없이 실제 문법·함수 이름으로 배치했습니다. 각 장은 개념 → 실행 파일 → 결과 → 주의사항 → 연습 순서입니다. 세부 예제는 독립적으로 실행하고 한 파일에 합치지 마세요.

## 준비와 실행

컴파일러를 준비하고 각 폴더의 main.cpp를 빌드합니다. GCC/Clang은 `g++ -std=c++17 main.cpp -o app`, MSVC 개발자 터미널은 `cl /std:c++17 /EHsc /utf-8 main.cpp /Fe:app.exe`가 기본입니다. Windows는 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다. 분할 컴파일·thread 장에는 별도 명령을 적었습니다. 입력 장에는 input.txt를 동봉했습니다.

## 목차

| 번호 | 문법·함수 | 내용 |
|---|---|---|
| 00 | [operator](00.%20operator/README.md) | 연산자와 자료형 |
| 01 | [cout & cerr](01.%20cout%20%26%20cerr/README.md) | std::cout·std::cerr |
| 02 | [cin & getline](02.%20cin%20%26%20getline/README.md) | std::cin·std::getline |
| 03 | [if & else](03.%20if%20%26%20else/README.md) | if·else if·else |
| 04 | [switch & case](04.%20switch%20%26%20case/README.md) | switch·case·default |
| 05 | [for](05.%20for/README.md) | for·범위 기반 for |
| 06 | [while](06.%20while/README.md) | while |
| 07 | [do & while](07.%20do%20%26%20while/README.md) | do·while |
| 08 | [break](08.%20break/README.md) | break |
| 09 | [continue](09.%20continue/README.md) | continue |
| 10 | [function & return](10.%20function%20%26%20return/README.md) | 함수·매개변수·return |
| 11 | [array](11.%20array/README.md) | std::array |
| 12 | [vector](12.%20vector/README.md) | std::vector |
| 13 | [string](13.%20string/README.md) | std::string |
| 14 | [reference & const](14.%20reference%20%26%20const/README.md) | 참조·const·auto |
| 15 | [pointer & nullptr](15.%20pointer%20%26%20nullptr/README.md) | 포인터·역참조·nullptr |
| 16 | [struct](16.%20struct/README.md) | struct와 멤버 |
| 17 | [class & constructor](17.%20class%20%26%20constructor/README.md) | class·생성자·캡슐화 |
| 18 | [destructor & RAII](18.%20destructor%20%26%20RAII/README.md) | 소멸자와 RAII |
| 19 | [virtual & override](19.%20virtual%20%26%20override/README.md) | 상속·virtual·override |
| 20 | [template](20.%20template/README.md) | template |
| 21 | [unique_ptr & move](21.%20unique_ptr%20%26%20move/README.md) | std::unique_ptr·std::move |
| 22 | [try & catch & throw](22.%20try%20%26%20catch%20%26%20throw/README.md) | 예외 처리 |
| 23 | [ifstream & ofstream](23.%20ifstream%20%26%20ofstream/README.md) | 파일 입출력 |
| 24 | [sort & lambda](24.%20sort%20%26%20lambda/README.md) | std::sort·람다 |
| 25 | [map & set](25.%20map%20%26%20set/README.md) | std::map·std::set |
| 26 | [enum class & optional](26.%20enum%20class%20%26%20optional/README.md) | enum class·std::optional |
| 27 | [include & namespace](27.%20include%20%26%20namespace/README.md) | 헤더·namespace·분할 컴파일 |
| 28 | [thread & mutex](28.%20thread%20%26%20mutex/README.md) | std::thread·std::mutex |
| 29 | [assert & static_assert](29.%20assert%20%26%20static_assert/README.md) | assert·static_assert |

## 학습 방법

값을 바꾸기 전에 결과를 예측하고 정상·빈 입력·경계값·잘못된 입력을 확인하세요. 먼저 번호순으로 문법을 익힌 뒤 아래 종합 실습으로 연결합니다.

[종합 실습](PRACTICE.md)

## 공식 참고 자료

- [Microsoft C++ 안내](https://learn.microsoft.com/en-us/cpp/cpp/welcome-back-to-cpp-modern-cpp?view=msvc-170)
- [C++ Core Guidelines](https://isocpp.github.io/CppCoreGuidelines/CppCoreGuidelines)

[전체 목차](../README.md) · [추가·검증 기록](../CPP_R_SQL_VALIDATION.md)
