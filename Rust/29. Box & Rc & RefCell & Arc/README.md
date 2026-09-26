# Box·Rc·RefCell·Arc

## 핵심 개념

스마트 포인터는 소유권과 접근 방식을 타입으로 표현합니다. Rc는 단일 스레드에서 소유권을 공유합니다.

## 실행 방법

Rust 1.90 이상을 준비하고 Rust 루트 폴더에서 `cargo run --example smart-pointers`를 실행합니다. 또는 이 폴더에서 `rustc --edition=2024 example.rs -o app`으로 컴파일하고 Windows는 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다.

[실습 파일](example.rs)

## 실행 예제

```rust
use std::{cell::RefCell, rc::Rc};
fn main() {
    let value = Rc::new(RefCell::new(1));
    let other = Rc::clone(&value);
    *other.borrow_mut() += 1;
    println!("{} {}", value.borrow(), Rc::strong_count(&value));
    let boxed = Box::new(3);
    println!("{}", *boxed);
}
```

## 예상 결과

```text
2 2
3
```

## 동작 원리와 주의사항

Box는 힙 값의 단일 소유권, Rc는 비원자적 참조 카운팅, RefCell은 런타임 빌림 검사를 제공합니다. RefCell 규칙 위반은 panic입니다. Rc 순환 참조는 메모리 누수를 만들 수 있어 Weak를 고려합니다. 스레드 간 공유에는 Arc와 적절한 Mutex 등 동기화를 사용하며 Arc만으로 내부 수정이 안전해지는 것은 아닙니다.



## 직접 확인하기

borrow_mut를 유지하면서 borrow를 시도했을 때 발생하는 오류를 설명하고 공유가 필요 없는 경우를 판단하세요.

---

---

---

[전체 목차](../README.md) · [이전](../28.%20thread.spawn%20%26%20mpsc/README.md) · [다음](../30.%20async%20%26%20Future/README.md)
