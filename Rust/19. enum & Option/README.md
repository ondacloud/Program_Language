# 열거형·패턴·Option

## 핵심 개념

enum의 각 변형은 서로 다른 데이터를 가질 수 있습니다. match는 가능한 경우를 빠짐없이 처리하도록 검사합니다.

## 실행 방법

Rust 1.90 이상을 준비하고 Rust 루트 폴더에서 `cargo run --example enums`를 실행합니다. 또는 이 폴더에서 `rustc --edition=2024 example.rs -o app`으로 컴파일하고 Windows는 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다.

[실습 파일](example.rs)

## 실행 예제

```rust
enum Action { Add(i32), Reset }
fn apply(value: i32, action: Action) -> i32 {
    match action { Action::Add(n) => value + n, Action::Reset => 0 }
}
fn main() {
    println!("{} {}", apply(2, Action::Add(3)), apply(2, Action::Reset));
    let values = [10];
    match values.get(1) { Some(n) => println!("{n}"), None => println!("missing") }
}
```

## 예상 결과

```text
5 0
missing
```

## 동작 원리와 주의사항

Option<T>의 Some(T)와 None으로 값의 부재를 표현합니다. unwrap은 None에서 panic하므로 예상 가능한 부재에는 match, if let, unwrap_or 등을 사용하세요. 와일드카드 _는 나머지 경우를 묶지만 새 변형 추가를 놓칠 수 있습니다.



## 직접 확인하기

배열 인덱스를 0으로 바꾸고 if let으로 동일한 동작을 작성하세요.

---

---

---

[전체 목차](../README.md) · [이전](../18.%20struct%20%26%20impl/README.md) · [다음](../20.%20Vec%20%26%20HashMap/README.md)
