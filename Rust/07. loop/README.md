# loop

## 핵심 개념

명시적으로 빠져나갈 때까지 반복하며 break 값으로 결과를 돌려줄 수 있습니다.

## 실행 방법

Rust 루트에서 `cargo run --example syntax-loop`으로 실행합니다. 이 폴더에서 `rustc --edition=2024 example.rs -o app`으로 컴파일한 뒤 Windows는 `.\app.exe`, Linux/macOS는 `./app`으로 실행할 수도 있습니다.

[실습 파일](example.rs)

## 실행 예제

```rust
fn main() {
let mut n = 0;
let result = loop {
    n += 1;
    if n == 3 { break n * 2; }
};
println!("{result}");
}
```

## 예상 결과

```text
6
```

## 동작 원리와 주의사항

loop와 while의 종료 조건 위치가 다릅니다. 이 예제의 loop 표현식 결과 타입은 break가 전달하는 정수로 정해집니다.



## 직접 확인하기

반환값을 n으로 바꿔 실행하세요.

---

[전체 목차](../README.md) · [이전](../06.%20while/README.md) · [다음](../08.%20break/README.md)
