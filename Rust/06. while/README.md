# while

## 핵심 개념

조건이 true인 동안 본문을 반복합니다.

## 실행 방법

Rust 루트에서 `cargo run --example control`으로 실행합니다. 이 폴더에서 `rustc --edition=2024 example.rs -o app`으로 컴파일한 뒤 Windows는 `.\app.exe`, Linux/macOS는 `./app`으로 실행할 수도 있습니다.

[실습 파일](example.rs)

## 실행 예제

```rust
fn main() {
let mut n = 0;
while n < 3 { println!("{n}"); n += 1; }
}
```

## 예상 결과

```text
0
1
2
```

## 동작 원리와 주의사항

Rust에는 ++ 연산자가 없어 += 1로 갱신합니다. 처음 조건이 false이면 본문은 실행되지 않습니다.



## 직접 확인하기

처음 값을 3으로 바꾸세요.

---

[전체 목차](../README.md) · [이전](../05.%20for/README.md) · [다음](../07.%20loop/README.md)
