# 제네릭과 trait

## 핵심 개념

제네릭은 여러 타입에 공통 알고리즘을 적용하고 trait bound는 사용할 수 있는 동작을 제한합니다.

## 실행 방법

Rust 1.90 이상을 준비하고 Rust 루트 폴더에서 `cargo run --example traits`를 실행합니다. 또는 이 폴더에서 `rustc --edition=2024 example.rs -o app`으로 컴파일하고 Windows는 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다.

[실습 파일](example.rs)

## 실행 예제

```rust
trait Describe { fn describe(&self) -> String; }
struct User { name: String }
impl Describe for User { fn describe(&self) -> String { format!("user:{}", self.name) } }
fn show<T: Describe>(value: &T) { println!("{}", value.describe()); }
fn main() { show(&User { name: "Kim".into() }); }
```

## 예상 결과

```text
user:Kim
```

## 동작 원리와 주의사항

T: Describe는 전달 타입이 Describe를 구현해야 한다는 뜻입니다. 제네릭의 정적 디스패치와 &dyn Describe의 동적 디스패치를 구분하세요. trait에는 기본 구현을 둘 수도 있습니다.



## 직접 확인하기

다른 구조체에 Describe를 구현하고 같은 show 함수로 출력하세요.

---

---

---

[전체 목차](../README.md) · [이전](../20.%20Vec%20%26%20HashMap/README.md) · [다음](../22.%20lifetime/README.md)
