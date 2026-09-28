# for

## 핵심 개념

반복 가능한 값의 요소를 차례로 꺼내 실행합니다.

## 실행 방법

Rust 루트에서 `cargo run --example loop-fundamentals`으로 실행합니다. 이 폴더에서 `rustc --edition=2024 example.rs -o app`으로 컴파일한 뒤 Windows는 `.\app.exe`, Linux/macOS는 `./app`으로 실행할 수도 있습니다.

[실습 파일](example.rs)

## 실행 예제

```rust
fn main() {
let mut sum = 0;
for n in 1..=3 { sum += n; }
println!("{sum}");
}
```

## 예상 결과

```text
6
```

## 동작 원리와 주의사항

1..=3은 끝 포함, 1..3은 끝 제외 범위입니다. 인덱스로 접근하는 것보다 값을 직접 순회하는 방법을 먼저 고려하세요.



## 직접 확인하기

끝 제외 범위로 바꾸어 결과를 확인하세요.

---

[전체 목차](../README.md) · [이전](../04.%20match/README.md) · [다음](../06.%20while/README.md)
