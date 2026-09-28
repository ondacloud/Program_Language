# break

## 핵심 개념

가장 가까운 반복문을 종료합니다.

## 실행 방법

Rust 루트에서 `cargo run --example syntax-break`으로 실행합니다. 이 폴더에서 `rustc --edition=2024 example.rs -o app`으로 컴파일한 뒤 Windows는 `.\app.exe`, Linux/macOS는 `./app`으로 실행할 수도 있습니다.

[실습 파일](example.rs)

## 실행 예제

```rust
fn main() {
for n in 0..4 {
    if n == 2 { break; }
    println!("{n}");
}
}
```

## 예상 결과

```text
0
1
```

## 동작 원리와 주의사항

중첩 반복에서는 레이블을 지정해 대상 반복을 선택할 수 있습니다. return은 함수 전체를 종료하므로 역할이 다릅니다.



## 직접 확인하기

중첩 반복을 만들어 제어가 이동하는 위치를 확인하세요.

---

[전체 목차](../README.md) · [이전](../07.%20loop/README.md) · [다음](../09.%20continue/README.md)
