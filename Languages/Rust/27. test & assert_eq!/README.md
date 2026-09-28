# 단위 테스트와 경계값

## 핵심 개념

#[test] 함수는 cargo test에서 실행됩니다. assert_eq!로 실제 결과와 기대 결과를 비교합니다.

## 실행 방법

Rust 1.90 이상을 준비하고 Rust 루트 폴더에서 `cargo run --example tests`를 실행합니다. 또는 이 폴더에서 `rustc --edition=2024 example.rs -o app`으로 컴파일하고 Windows는 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다.

[실습 파일](example.rs)

## 실행 예제

```rust
fn average(values: &[f64]) -> Option<f64> {
    if values.is_empty() { None } else { Some(values.iter().sum::<f64>() / values.len() as f64) }
}
fn main() { println!("{:?}", average(&[2.0, 4.0])); }
#[cfg(test)]
mod tests {
    use super::average;
    #[test] fn empty() { assert_eq!(average(&[]), None); }
    #[test] fn ordinary() { assert_eq!(average(&[2.0, 4.0]), Some(3.0)); }
}
```

## 예상 결과

```text
Some(3.0)
```

## 동작 원리와 주의사항

이 프로젝트에서 cargo test --example tests는 이 예제의 테스트를 실행합니다. 일반 src/lib.rs의 단위 테스트와 tests/ 통합 테스트는 cargo test로 실행합니다. 부동소수점 계산은 값에 따라 허용 오차 비교가 필요합니다.



## 직접 확인하기

음수 값, 단일 값 테스트를 추가하고 실패하는 기대값이 어떤 메시지를 만드는지 확인하세요.

---

---

---

[전체 목차](../README.md) · [이전](../26.%20fs.read_to_string/README.md) · [다음](../28.%20thread.spawn%20%26%20mpsc/README.md)
