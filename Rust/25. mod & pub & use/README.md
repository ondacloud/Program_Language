# 모듈·가시성·crate

## 핵심 개념

모듈은 코드를 이름 공간으로 나누고 pub은 외부 접근을 허용합니다. crate는 컴파일 단위입니다.

## 실행 방법

Rust 1.90 이상을 준비하고 Rust 루트 폴더에서 `cargo run --example modules`를 실행합니다. 또는 이 폴더에서 `rustc --edition=2024 example.rs -o app`으로 컴파일하고 Windows는 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다.

[실습 파일](example.rs)

## 실행 예제

```rust
mod math {
    fn twice(n: i32) -> i32 { n * 2 }
    pub fn score(n: i32) -> i32 { twice(n) + 1 }
}
use crate::math::score;
fn main() { println!("{}", score(3)); }
```

## 예상 결과

```text
7
```

## 동작 원리와 주의사항

twice는 모듈 내부 구현이고 score는 공개 함수입니다. 파일을 분리할 때 mod math;와 math.rs를 사용할 수 있습니다. use는 경로에 이름을 붙이는 것이며 모듈을 다운로드하지 않습니다. 외부 crate 의존성은 Cargo.toml에 선언합니다.



## 직접 확인하기

math를 별도 파일로 옮겨 컴파일하고 pub을 제거했을 때 오류를 확인하세요.

---

---

---

[전체 목차](../README.md) · [이전](../24.%20Result%20%26%20Ok%20%26%20Err/README.md) · [다음](../26.%20fs.read_to_string/README.md)
