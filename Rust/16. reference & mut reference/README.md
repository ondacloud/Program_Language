# 공유 참조와 가변 참조

## 핵심 개념

참조는 소유권을 넘기지 않고 값을 빌립니다. 동일 값에 대한 가변 접근과 공유 접근의 충돌을 컴파일러가 검사합니다.

## 실행 방법

Rust 1.90 이상을 준비하고 Rust 루트 폴더에서 `cargo run --example borrowing`를 실행합니다. 또는 이 폴더에서 `rustc --edition=2024 example.rs -o app`으로 컴파일하고 Windows는 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다.

[실습 파일](example.rs)

## 실행 예제

```rust
fn append(value: &mut String) { value.push('!'); }
fn main() {
    let mut text = String::from("hi");
    let size = text.len();
    append(&mut text);
    println!("{size} {text}");
}
```

## 예상 결과

```text
2 hi!
```

## 동작 원리와 주의사항

&T는 공유 참조, &mut T는 가변 참조입니다. 겹치는 사용 기간에는 여러 공유 참조 또는 하나의 가변 참조가 허용됩니다. 빌림은 항상 블록 끝까지 이어지는 것이 아니라 마지막 사용 지점에 따라 더 일찍 끝날 수 있습니다.



## 직접 확인하기

공유 참조를 만든 뒤 가변 참조 호출 이후에 다시 사용해 오류를 관찰하세요.

---

---

---

[전체 목차](../README.md) · [이전](../15.%20move%20%26%20clone/README.md) · [다음](../17.%20String%20%26%20str/README.md)
