# 함수와 반환값

## 핵심 개념

함수의 매개변수와 반환 타입을 명시합니다. 블록 마지막 표현식은 세미콜론 없이 반환값이 됩니다.

## 실행 방법

Rust 1.90 이상을 준비하고 Rust 루트 폴더에서 `cargo run --example functions`를 실행합니다. 또는 이 폴더에서 `rustc --edition=2024 example.rs -o app`으로 컴파일하고 Windows는 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다.

[실습 파일](example.rs)

## 실행 예제

```rust
fn square(n: i32) -> i32 { n * n }
fn main() {
    let value = { let x = 3; square(x) };
    println!("{value}");
}
```

## 예상 결과

```text
9
```

## 동작 원리와 주의사항

n * n 뒤에 세미콜론을 붙이면 값 대신 단위 타입 ()이 되어 반환 타입과 맞지 않습니다. return은 조기 반환에 유용합니다. Rust는 같은 이름의 함수 오버로딩을 일반적으로 지원하지 않습니다.



## 직접 확인하기

음수도 제곱되는지 확인하고 두 정수 중 큰 값을 반환하는 함수를 작성하세요.

---

---

---

[전체 목차](../README.md) · [이전](../09.%20continue/README.md) · [다음](../11.%20array%20%26%20tuple/README.md)
