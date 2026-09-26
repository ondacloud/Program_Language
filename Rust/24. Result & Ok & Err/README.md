# Result와 ? 오류 전파

## 핵심 개념

Result<T, E>는 성공값 또는 오류를 표현합니다. ?는 성공값을 꺼내고 오류이면 호출자에게 조기 반환합니다.

## 실행 방법

Rust 1.90 이상을 준비하고 Rust 루트 폴더에서 `cargo run --example errors`를 실행합니다. 또는 이 폴더에서 `rustc --edition=2024 example.rs -o app`으로 컴파일하고 Windows는 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다.

[실습 파일](example.rs)

## 실행 예제

```rust
fn double(text: &str) -> Result<i32, std::num::ParseIntError> {
    let n: i32 = text.parse()?;
    Ok(n * 2)
}
fn main() {
    for text in ["12", "bad"] {
        match double(text) { Ok(n) => println!("{n}"), Err(_) => println!("invalid integer") }
    }
}
```

## 예상 결과

```text
24
invalid integer
```

## 동작 원리와 주의사항

?를 쓰는 함수의 반환 타입은 오류 전파를 지원해야 합니다. 일반 입력 오류는 Result로 다루고 복구 불가능한 내부 가정 위반은 panic과 구분하세요. 이 예제의 곱셈은 작은 입력을 가정합니다. 전체 i32 범위를 받는 실제 API라면 checked_mul과 오류 타입을 추가해야 합니다.



## 직접 확인하기

빈 문자열, 음수, i32 범위를 넘는 입력을 넣어 보고 오버플로도 오류로 처리하도록 확장하세요.

---

---

---

[전체 목차](../README.md) · [이전](../23.%20iter%20%26%20map%20%26%20filter/README.md) · [다음](../25.%20mod%20%26%20pub%20%26%20use/README.md)
