# Future와 비동기 실행 경계

## 핵심 개념

async 함수는 호출 즉시 본문을 완료하는 대신 Future를 반환합니다. Future를 진행하려면 실행기가 poll해야 합니다.

## 실행 방법

Rust 1.90 이상을 준비하고 Rust 루트 폴더에서 `cargo run --example async-boundaries`를 실행합니다. 또는 이 폴더에서 `rustc --edition=2024 example.rs -o app`으로 컴파일하고 Windows는 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다.

[실습 파일](example.rs)

## 실행 예제

```rust
async fn answer() -> u32 { 42 }
fn main() {
    let future = answer();
    drop(future);
    println!("future created, not executed");
}
```

## 예상 결과

```text
future created, not executed
```

## 동작 원리와 주의사항

이 예제는 Future를 만들고 버리므로 async 본문을 실행하지 않습니다. 표준 라이브러리는 범용 비동기 런타임을 제공하지 않습니다. 실제 I/O 앱은 런타임 선택과 버전 고정이 필요합니다. await는 async 문맥에서 결과를 기다리며 OS 스레드를 자동 생성하지 않습니다. CPU 작업과 블로킹 I/O를 실행기 스레드에 오래 올려두면 다른 작업이 지연될 수 있습니다.



## 직접 확인하기

answer 본문에 println!을 넣어도 출력되지 않는지 확인하세요. 다음 학습에서 런타임의 취소·타임아웃·블로킹 작업 API를 공식 문서로 비교하세요.

---

---

---

[전체 목차](../README.md) · [이전](../29.%20Box%20%26%20Rc%20%26%20RefCell%20%26%20Arc/README.md) · [다음](../31.%20cargo%20%26%20fn%20main/README.md)
