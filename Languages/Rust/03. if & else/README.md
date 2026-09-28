# if / else if / else

## 핵심 개념

if는 bool 조건에 따라 값을 선택하는 표현식입니다.

## 실행 방법

Rust 루트에서 `cargo run --example branching-patterns`으로 실행합니다. 이 폴더에서 `rustc --edition=2024 example.rs -o app`으로 컴파일한 뒤 Windows는 `.\app.exe`, Linux/macOS는 `./app`으로 실행할 수도 있습니다.

[실습 파일](example.rs)

## 실행 예제

```rust
fn main() {
let n = 0;
let label = if n > 0 { "positive" } else if n == 0 { "zero" } else { "negative" };
println!("{label}");
}
```

## 예상 결과

```text
zero
```

## 동작 원리와 주의사항

숫자를 자동으로 bool로 바꾸지 않습니다. 결과를 변수에 저장할 때 각 분기의 타입이 맞아야 합니다.



## 직접 확인하기

n을 -1과 1로 바꾸세요. 분기 반환 타입을 다르게 만들면 어떤 오류가 나나요?

---

[전체 목차](../README.md) · [이전](../02.%20stdin%20%26%20read_line/README.md) · [다음](../04.%20match/README.md)
