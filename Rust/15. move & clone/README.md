# 소유권·이동·복제

## 핵심 개념

값은 소유자를 가지며 소유자가 범위를 벗어나면 정리됩니다. String의 대입은 기본적으로 소유권을 이동합니다.

## 실행 방법

Rust 1.90 이상을 준비하고 Rust 루트 폴더에서 `cargo run --example ownership`를 실행합니다. 또는 이 폴더에서 `rustc --edition=2024 example.rs -o app`으로 컴파일하고 Windows는 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다.

[실습 파일](example.rs)

## 실행 예제

```rust
fn main() {
    let first = String::from("rust");
    let second = first;
    let third = second.clone();
    println!("{second} {third}");
    let a = 7;
    let b = a;
    println!("{a} {b}");
}
```

## 예상 결과

```text
rust rust
7 7
```

## 동작 원리와 주의사항

이동 후 first를 사용하면 컴파일 오류입니다. clone은 별도 데이터를 만들 수 있어 비용이 듭니다. i32 같은 Copy 타입은 대입 후에도 원본을 사용할 수 있습니다. 이동은 모든 데이터의 바이트를 깊게 복사한다는 뜻이 아닙니다.



## 직접 확인하기

first를 출력해 오류를 확인한 뒤 clone 없이 빌림으로 문자열 길이를 구하는 방법을 생각하세요.

---

---

---

[전체 목차](../README.md) · [이전](../14.%20bitwise%20operator%20%26%20checked_add/README.md) · [다음](../16.%20reference%20%26%20mut%20reference/README.md)
