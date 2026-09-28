# 변수·타입·가변성

## 핵심 개념

let 바인딩은 기본적으로 불변입니다. mut으로 재대입을 허용하고 타입은 추론하거나 명시합니다.

## 실행 방법

Rust 1.90 이상을 준비하고 Rust 루트 폴더에서 `cargo run --example variables`를 실행합니다. 또는 이 폴더에서 `rustc --edition=2024 example.rs -o app`으로 컴파일하고 Windows는 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다.

[실습 파일](example.rs)

## 실행 예제

```rust
fn main() {
    let mut count: i32 = 2;
    count += 1;
    let count = count.to_string();
    let pair: (bool, usize) = (true, count.len());
    println!("{} {} {}", count, pair.0, pair.1);
}
```

## 예상 결과

```text
3 true 1
```

## 동작 원리와 주의사항

두 번째 let은 shadowing이며 새로운 타입의 바인딩을 만듭니다. mut 재대입은 타입을 바꾸지 못합니다. usize는 플랫폼의 포인터 크기에 맞는 정수입니다. 정수 오버플로 동작에 의존하지 말고 checked_add 같은 명시적 연산을 사용하세요.



## 직접 확인하기

mut을 제거했을 때 컴파일 오류가 나는 위치를 확인하고 checked_add로 경계값을 실험하세요.

---

---

---

[전체 목차](../README.md) · [이전](../11.%20array%20%26%20tuple/README.md) · [다음](../13.%20i32%20%26%20f64%20%26%20bool%20%26%20char/README.md)
