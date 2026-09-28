# Rust 학습 가이드

분류용 상위 폴더 없이 실제 문법·함수 이름을 번호순으로 배치했습니다. 폴더에서 README와 실행 파일을 바로 확인하세요.

## 실행 환경

Rust 1.90 이상, edition 2024 기준입니다. Rust 루트에서 `cargo run --example hello`로 시작하고 각 장의 Cargo 명령을 따릅니다. Cargo 타깃 이름은 유지했으며 Cargo.toml의 파일 경로를 새 배치에 맞췄습니다.

## 목차

| 번호 | 문법·함수 | 설명 |
|---|---|---|
| 00 | [operator](00.%20operator/README.md) | 산술·대입·비교·논리 연산자 |
| 01 | [print! & println!](01.%20print%21%20%26%20println%21/README.md) | 출력 — print!·println!·eprintln! |
| 02 | [stdin & read_line](02.%20stdin%20%26%20read_line/README.md) | 입력 — stdin().read_line과 parse |
| 03 | [if & else](03.%20if%20%26%20else/README.md) | if / else if / else |
| 04 | [match](04.%20match/README.md) | match |
| 05 | [for](05.%20for/README.md) | for |
| 06 | [while](06.%20while/README.md) | while |
| 07 | [loop](07.%20loop/README.md) | loop |
| 08 | [break](08.%20break/README.md) | break |
| 09 | [continue](09.%20continue/README.md) | continue |
| 10 | [fn & return](10.%20fn%20%26%20return/README.md) | 함수와 반환값 |
| 11 | [array & tuple](11.%20array%20%26%20tuple/README.md) | 배열·튜플·상수·블록 스코프 |
| 12 | [let & mut](12.%20let%20%26%20mut/README.md) | 변수·타입·가변성 |
| 13 | [i32 & f64 & bool & char](13.%20i32%20%26%20f64%20%26%20bool%20%26%20char/README.md) | 정수·실수·bool·char와 타입 변환 |
| 14 | [bitwise operator & checked_add](14.%20bitwise%20operator%20%26%20checked_add/README.md) | 비트 연산·시프트·오버플로 검사 |
| 15 | [move & clone](15.%20move%20%26%20clone/README.md) | 소유권·이동·복제 |
| 16 | [reference & mut reference](16.%20reference%20%26%20mut%20reference/README.md) | 공유 참조와 가변 참조 |
| 17 | [String & str](17.%20String%20%26%20str/README.md) | 슬라이스와 UTF-8 문자열 |
| 18 | [struct & impl](18.%20struct%20%26%20impl/README.md) | 구조체와 메서드 |
| 19 | [enum & Option](19.%20enum%20%26%20Option/README.md) | 열거형·패턴·Option |
| 20 | [Vec & HashMap](20.%20Vec%20%26%20HashMap/README.md) | Vec와 HashMap |
| 21 | [trait & generic](21.%20trait%20%26%20generic/README.md) | 제네릭과 trait |
| 22 | [lifetime](22.%20lifetime/README.md) | 라이프타임과 참조 관계 |
| 23 | [iter & map & filter](23.%20iter%20%26%20map%20%26%20filter/README.md) | 반복자와 클로저 |
| 24 | [Result & Ok & Err](24.%20Result%20%26%20Ok%20%26%20Err/README.md) | Result와 ? 오류 전파 |
| 25 | [mod & pub & use](25.%20mod%20%26%20pub%20%26%20use/README.md) | 모듈·가시성·crate |
| 26 | [fs.read_to_string](26.%20fs.read_to_string/README.md) | 파일 읽기와 자원 수명 |
| 27 | [test & assert_eq!](27.%20test%20%26%20assert_eq%21/README.md) | 단위 테스트와 경계값 |
| 28 | [thread.spawn & mpsc](28.%20thread.spawn%20%26%20mpsc/README.md) | 스레드·채널·소유권 전달 |
| 29 | [Box & Rc & RefCell & Arc](29.%20Box%20%26%20Rc%20%26%20RefCell%20%26%20Arc/README.md) | Box·Rc·RefCell·Arc |
| 30 | [async & Future](30.%20async%20%26%20Future/README.md) | Future와 비동기 실행 경계 |
| 31 | [cargo & fn main](31.%20cargo%20%26%20fn%20main/README.md) | Rust와 Cargo 시작 |

## 공식 참고 자료

- [Rust Book](https://doc.rust-lang.org/book/)
- [소유권](https://doc.rust-lang.org/book/ch04-01-what-is-ownership.html)
- [Cargo 가이드](https://doc.rust-lang.org/cargo/guide/)
- [Rust 설치](https://rust-lang.org/tools/install/)

[전체 과정](../../README.md)
