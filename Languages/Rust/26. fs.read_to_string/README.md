# 파일 읽기와 자원 수명

## 핵심 개념

표준 라이브러리의 파일 API는 Result를 반환합니다. 파일 핸들은 소유자가 정리될 때 닫힙니다.

## 실행 방법

Rust 루트 폴더에서 `cargo run --example files`로 실행합니다. 이 장은 Cargo 환경 변수를 사용합니다.

[실습 파일](example.rs)

## 실행 예제

```rust
use std::{fs, path::PathBuf};
fn main() -> Result<(), Box<dyn std::error::Error>> {
    let path = PathBuf::from(env!("CARGO_MANIFEST_DIR")).join("Cargo.toml");
    let text = fs::read_to_string(path)?;
    println!("{}", text.contains("[package]"));
    Ok(())
}
```

## 예상 결과

```text
true
```

## 동작 원리와 주의사항

이 장은 Cargo가 제공하는 컴파일 시 환경 변수 CARGO_MANIFEST_DIR을 사용하므로 cargo run --example files로 실행하세요. read_to_string은 전체 파일을 읽고 UTF-8이 아니면 오류입니다. 큰 파일은 BufReader와 BufRead::lines 등으로 처리하세요. 파일 쓰기는 대상의 덮어쓰기 여부를 먼저 설계하세요.



## 직접 확인하기

없는 파일로 바꾸어 오류를 확인하고 std::env::args_os로 경로 인수를 받도록 확장하세요.

---

---

---

[전체 목차](../README.md) · [이전](../25.%20mod%20%26%20pub%20%26%20use/README.md) · [다음](../27.%20test%20%26%20assert_eq%21/README.md)
