# match

## 핵심 개념

패턴과 일치하는 분기를 선택합니다.

## 실행 방법

Rust 루트에서 `cargo run --example syntax-match`으로 실행합니다. 이 폴더에서 `rustc --edition=2024 example.rs -o app`으로 컴파일한 뒤 Windows는 `.\app.exe`, Linux/macOS는 `./app`으로 실행할 수도 있습니다.

[실습 파일](example.rs)

## 실행 예제

```rust
fn main() {
let command = "save";
match command {
    "save" | "write" => println!("saved"),
    "open" => println!("opened"),
    _ => println!("unknown"),
}
}
```

## 예상 결과

```text
saved
```

## 동작 원리와 주의사항

모든 경우를 처리해야 합니다. switch처럼 다음 분기로 자동 진행하지 않으며 _는 나머지 경우를 나타냅니다.



## 직접 확인하기

_를 제거한 뒤 컴파일 오류를 확인하세요.

---

[전체 목차](../README.md) · [이전](../03.%20if%20%26%20else/README.md) · [다음](../05.%20for/README.md)
