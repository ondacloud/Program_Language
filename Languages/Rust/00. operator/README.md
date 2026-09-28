# 산술·대입·비교·논리 연산자

## 핵심 개념

Rust 연산은 피연산자의 타입을 기준으로 합니다. 정수 나눗셈과 실수 나눗셈을 구분합니다.

## 실행 방법

Rust 1.90 이상을 준비하고 Rust 루트 폴더에서 `cargo run --example arithmetic-operators`를 실행합니다. 또는 이 폴더에서 `rustc --edition=2024 example.rs -o app`으로 컴파일하고 Windows는 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다.

[실습 파일](example.rs)

## 실행 예제

```rust
fn main() {
    let mut n = 7;
    println!("{} {} {} {} {}", n+2, n-2, n*2, n/2, n%2);
    n += 3;
    println!("{n} {}", 7.0_f64 / 2.0);
    println!("{} {} {}", n == 10, n != 10, n >= 0 && n < 20);
    println!("{} {}", !(n < 0), n < 0 || n == 10);
    println!("{}", 2 + 3 * 4);
}
```

## 예상 결과

```text
9 5 14 3 1
10 3.5
true false true
true true
14
```

## 동작 원리와 주의사항

Rust에는 ++·--나 C 방식 삼항 연산자가 없습니다. n += 1과 if 표현식을 사용합니다. &&·||는 bool에 사용하며 단락 평가합니다. 정수 0 나눗셈은 실패하고 오버플로 동작을 안전한 입력 검사 대신 이용하면 안 됩니다.

## 문법 한눈에 보기

| 분류 | 문법 |
|---|---|
| 산술 | `+ - * / %` |
| 대입 | `= += -= *= /= %=` |
| 비교 | `== != > >= < <=` |
| 논리 | `&& || !` |

## 직접 확인하기

7/2와 -7/2를 비교하고 checked_add·checked_div로 경계값을 처리하세요.

---

---

---

[전체 목차](../README.md) · [다음](../01.%20print%21%20%26%20println%21/README.md)
