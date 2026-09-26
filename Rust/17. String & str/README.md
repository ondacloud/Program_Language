# 슬라이스와 UTF-8 문자열

## 핵심 개념

슬라이스는 연속된 데이터의 일부를 빌립니다. String은 소유 문자열이고 &str은 UTF-8 문자열 슬라이스입니다.

## 실행 방법

Rust 1.90 이상을 준비하고 Rust 루트 폴더에서 `cargo run --example strings`를 실행합니다. 또는 이 폴더에서 `rustc --edition=2024 example.rs -o app`으로 컴파일하고 Windows는 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다.

[실습 파일](example.rs)

## 실행 예제

```rust
fn main() {
    let text = String::from("가A");
    println!("{} {}", text.len(), text.chars().count());
    println!("{}", &text[..3]);
    let numbers = [10, 20, 30];
    println!("{:?}", &numbers[1..]);
}
```

## 예상 결과

```text
4 2
가
[20, 30]
```

## 동작 원리와 주의사항

len은 바이트 수입니다. 문자열 바이트 인덱스가 UTF-8 경계를 자르면 panic이 발생합니다. chars는 Unicode scalar value를 순회하며 사용자에게 보이는 글자 묶음과 항상 같지는 않습니다. 안전한 범위 접근에는 get을 사용할 수 있습니다.



## 직접 확인하기

text.get(..1)의 결과를 확인하고 chars로 각 문자를 출력하세요.

---

---

---

[전체 목차](../README.md) · [이전](../16.%20reference%20%26%20mut%20reference/README.md) · [다음](../18.%20struct%20%26%20impl/README.md)
