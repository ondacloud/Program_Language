# 비트 연산·시프트·오버플로 검사

## 핵심 개념

비트 연산은 정수의 각 비트를 조작합니다. 타입의 범위와 시프트 크기를 명시적으로 다루세요.

## 실행 방법

Rust 1.90 이상을 준비하고 Rust 루트 폴더에서 `cargo run --example bits-checked-arithmetic`를 실행합니다. 또는 이 폴더에서 `rustc --edition=2024 example.rs -o app`으로 컴파일하고 Windows는 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다.

[실습 파일](example.rs)

## 실행 예제

```rust
fn main() {
    let a: u8 = 5;
    let b: u8 = 3;
    println!("{} {} {} {}", a & b, a | b, a ^ b, !a);
    println!("{} {}", a << 1, a >> 1);
    println!("{:?}", 255_u8.checked_add(1));
    println!("{} {}", 255_u8.saturating_add(1), 255_u8.wrapping_add(1));
}
```

## 예상 결과

```text
1 7 6 250
10 2
None
255 0
```

## 동작 원리와 주의사항

!는 bool에서는 논리 부정, 정수에서는 비트 반전입니다. u8의 !5는 8비트 범위에서 250입니다. checked는 실패를 Option으로, saturating은 경계값으로, wrapping은 모듈러 결과로 표현합니다. 목적에 맞는 정책을 선택하세요.



## 직접 확인하기

u16으로 바꿔 비트 반전 결과를 비교하세요. checked_shl로 너무 큰 이동 횟수를 검사하세요.

---

---

---

[전체 목차](../README.md) · [이전](../13.%20i32%20%26%20f64%20%26%20bool%20%26%20char/README.md) · [다음](../15.%20move%20%26%20clone/README.md)
