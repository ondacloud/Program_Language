# 정수·실수·bool·char와 타입 변환

## 핵심 개념

Rust는 정적으로 타입을 검사합니다. 정수 폭과 부호, 문자열과 문자, 숫자 변환의 실패 가능성을 구분하세요.

## 실행 방법

Rust 1.90 이상을 준비하고 Rust 루트 폴더에서 `cargo run --example scalar-types`를 실행합니다. 또는 이 폴더에서 `rustc --edition=2024 example.rs -o app`으로 컴파일하고 Windows는 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다.

[실습 파일](example.rs)

## 실행 예제

```rust
fn main() {
    let count: u8 = 255;
    let price: f64 = 2.5;
    let letter: char = '가';
    println!("{count} {price} {} {letter}", true);
    println!("{}", i32::from(count));
    println!("{}", u8::try_from(300).is_err());
    println!("{}", "12".parse::<i32>().unwrap_or(0));
}
```

## 예상 결과

```text
255 2.5 true 가
255
true
12
```

## 동작 원리와 주의사항

i8~i128·u8~u128은 폭이 정해진 정수이고 isize·usize는 대상 플랫폼의 포인터 크기에 맞습니다. char는 Unicode scalar value 하나이며 UTF-8 바이트 하나와 다릅니다. as는 범위를 검사해 Result를 주는 변환이 아니므로 좁은 정수 변환에는 TryFrom을 검토하세요.



## 직접 확인하기

문자열 bad와 300을 u8로 변환하고 실패를 match로 처리하세요. char와 &str의 따옴표 차이를 확인하세요.

---

---

---

[전체 목차](../README.md) · [이전](../12.%20let%20%26%20mut/README.md) · [다음](../14.%20bitwise%20operator%20%26%20checked_add/README.md)
