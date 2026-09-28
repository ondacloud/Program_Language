# 구조체와 메서드

## 핵심 개념

struct는 관련 데이터를 묶고 impl은 생성 함수와 메서드를 정의합니다.

## 실행 방법

Rust 1.90 이상을 준비하고 Rust 루트 폴더에서 `cargo run --example structs`를 실행합니다. 또는 이 폴더에서 `rustc --edition=2024 example.rs -o app`으로 컴파일하고 Windows는 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다.

[실습 파일](example.rs)

## 실행 예제

```rust
struct Rectangle { width: u32, height: u32 }
impl Rectangle {
    fn new(width: u32, height: u32) -> Self { Self { width, height } }
    fn area(&self) -> u32 { self.width * self.height }
}
fn main() {
    let rect = Rectangle::new(3, 4);
    println!("{}", rect.area());
}
```

## 예상 결과

```text
12
```

## 동작 원리와 주의사항

&self 메서드는 인스턴스를 빌립니다. self는 소유권을 받고 &mut self는 수정 가능한 참조를 받습니다. new는 관례적인 연관 함수 이름이며 특별한 생성자 문법이 아닙니다.



## 직접 확인하기

둘레 메서드를 추가하고 크기 변경 메서드는 어떤 self 형태가 필요한지 판단하세요.

---

---

---

[전체 목차](../README.md) · [이전](../17.%20String%20%26%20str/README.md) · [다음](../19.%20enum%20%26%20Option/README.md)
