# 입력 — stdin().read_line과 parse

## 핵심 개념

표준 입력을 String에 읽은 뒤 줄 끝 문자를 제거하고 필요한 타입으로 변환합니다.

## 실행 방법

Rust 1.90 이상을 준비하고 Rust 루트 폴더에서 `cargo run --example stdin-input`를 실행합니다. 또는 이 폴더에서 `rustc --edition=2024 example.rs -o app`으로 컴파일하고 Windows는 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다.

[실습 파일](example.rs)

## 실행 예제

```rust
use std::io;
fn main() -> Result<(), Box<dyn std::error::Error>> {
    let mut input = String::new();
    if io::stdin().read_line(&mut input)? == 0 {
        return Err("no input".into());
    }
    let value: i32 = input.trim().parse()?;
    println!("value={value}");
    Ok(())
}
```

## 예상 결과

```text
value=12
```

## 동작 원리와 주의사항

실행 후 12와 Enter를 입력하세요. read_line은 읽은 바이트 수를 반환하며 버퍼에 내용을 추가합니다. 반복 입력에서는 clear를 호출하거나 새 버퍼를 만드세요. trim은 양쪽 공백과 줄바꿈을 제거합니다. parse 실패는 Result로 전달되며 숫자가 아닌 입력을 정상값으로 취급하지 않습니다.



## 직접 확인하기

음수·공백·문자·입력 종료를 확인하세요. 반복해서 읽을 때 이전 문자열이 누적되지 않도록 수정하세요.

---

---

[전체 목차](../README.md) · [이전](../01.%20print%21%20%26%20println%21/README.md) · [다음](../03.%20if%20%26%20else/README.md)
