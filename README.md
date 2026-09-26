# Programming Languages — 언어별 학습 노트

프로그래밍 언어를 **개념 → 코드 → 결과 → 주의사항 → 연습** 순서로 학습하는 정리한 문서입니다. 기초 문법뿐 아니라 메모리, 오류 처리, 모듈, 테스트까지 연결합니다.

## 언어별 시작점

| 언어 | 설명 기준 | 주요 학습 내용 |
|---|---|---|
| [C](C/README.md) | C17 | 포인터·문자열·메모리·구조체·분할 컴파일 |
| [Go](Golang/README.md) | Go 1.22 이상 | slice·interface·error·고루틴·채널·context |
| [Java](Java/README.md) | Java 17 | 객체지향·제네릭·컬렉션·Stream·동시성 |
| [Python](Python/README.md) | Python 3.10 이상 | 컬렉션·함수·클래스·제너레이터·타입 힌트 |
| [Shell Script](Shell%20Script/README.md) | Bash 4 이상 | 따옴표·파이프·파일·프로세스·오류 처리 |
| [PowerShell](PowerShell/README.md) | PowerShell 7.x | 객체 파이프·함수·파일·모듈·WhatIf |
| [HTML](HTML/README.md) | Living Standard 기본 | 시맨틱 구조·폼·접근성 |
| [CSS](CSS/README.md) | 현대 브라우저 기본 CSS | 박스 모델·Flexbox·Grid·반응형 |
| [JavaScript](JavaScript/README.md) | 현대 ECMAScript | 함수·모듈·비동기·DOM·Fetch |
| [React](React/README.md) | React 19.3.0 | 컴포넌트·Hooks·상태·Effect·검증 |
| [Node.js](Node.js/README.md) | Node.js 24.x | 파일·스트림·HTTP·프로세스·테스트 |
| [Rust](Rust/README.md) | Rust 1.90+, edition 2024 | 소유권·빌림·trait·Result·동시성 |
| [C++](C%2B%2B/README.md) | C++17 | cout·cin·제어문·클래스·RAII·표준 라이브러리 |
| [R](R/README.md) | R 4.1 이상 | print·scan·제어문·벡터·data.frame·통계·그래프 |
| [SQL](SQL/README.md) | SQLite 3.37 이상 | SELECT·INSERT·WHERE·JOIN·집계·트랜잭션 |

최신 기능 전체를 나열하기보다 위 기준에서 실행 가능한 핵심 개념을 설명합니다. 기능의 도입 버전이 중요한 곳은 개별 문서에 표시합니다.

## 공부하는 순서

1. 언어별 README의 첫 프로그램을 실행합니다.
2. 입출력·조건·반복·함수의 기본 흐름을 익힙니다.
3. 데이터가 복사되는지, 공유되는지, 수정 가능한지 확인합니다.
4. 오류 입력과 자원 정리까지 포함하는 작은 프로그램을 작성합니다.
5. 테스트로 정상·빈 입력·경계값·실패 경로를 확인합니다.