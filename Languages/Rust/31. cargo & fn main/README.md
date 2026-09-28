# Rust와 Cargo 시작

## 핵심 개념

Rust는 컴파일 단계에서 타입과 많은 메모리 오류를 검사합니다. Cargo는 빌드·의존성·테스트를 관리합니다.

## 실행 방법

Rust 1.90 이상을 준비하고 Rust 루트 폴더에서 `cargo run --example hello`를 실행합니다. 또는 이 폴더에서 `rustc --edition=2024 example.rs -o app`으로 컴파일하고 Windows는 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다.

[실습 파일](example.rs)

## 실행 예제

```rust
fn main() {
    println!("Hello Rust");
}
```

## 예상 결과

```text
Hello Rust
```

## 동작 원리와 주의사항

main이 실행 진입점입니다. println!의 !는 매크로 호출을 나타냅니다. 이 과정은 Rust 1.90 이상, edition 2024를 기준으로 하며 외부 crate 없이 실행됩니다. rustc --version과 cargo --version으로 설치를 확인하세요.



## 직접 확인하기

문구를 바꾸고 cargo run --example hello로 다시 실행하세요. cargo check와 cargo build의 차이를 설명하세요.

---

---

---

[전체 목차](../README.md) · [이전](../30.%20async%20%26%20Future/README.md)
