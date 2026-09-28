# 라이프타임과 참조 관계

## 핵심 개념

라이프타임 표기는 참조 사이의 유효 기간 관계를 설명합니다. 값을 오래 살게 만들거나 런타임 수명을 연장하지 않습니다.

## 실행 방법

Rust 1.90 이상을 준비하고 Rust 루트 폴더에서 `cargo run --example lifetimes`를 실행합니다. 또는 이 폴더에서 `rustc --edition=2024 example.rs -o app`으로 컴파일하고 Windows는 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다.

[실습 파일](example.rs)

## 실행 예제

```rust
fn longer<'a>(a: &'a str, b: &'a str) -> &'a str {
    if a.len() >= b.len() { a } else { b }
}
fn main() {
    let first = String::from("Rust");
    let second = String::from("Go");
    println!("{}", longer(&first, &second));
}
```

## 예상 결과

```text
Rust
```

## 동작 원리와 주의사항

반환 참조는 두 입력을 모두 안전하게 빌릴 수 있는 기간 안에서 사용됩니다. 지역 String을 만들어 &str로 반환하는 것은 해결되지 않습니다. 필요하다면 소유 String을 반환하세요. 단순한 함수는 생략 규칙으로 표기가 필요 없기도 합니다.



## 직접 확인하기

두 번째 문자열을 내부 블록에서 만들고 반환 참조를 밖에서 사용하면 왜 거부되는지 설명하세요.

---

---

---

[전체 목차](../README.md) · [이전](../21.%20trait%20%26%20generic/README.md) · [다음](../23.%20iter%20%26%20map%20%26%20filter/README.md)
