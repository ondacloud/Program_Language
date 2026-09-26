# 스레드·채널·소유권 전달

## 핵심 개념

스레드 간 메시지 전달은 데이터 공유 범위를 줄입니다. move 클로저는 캡처 값의 소유권을 가져옵니다.

## 실행 방법

Rust 1.90 이상을 준비하고 Rust 루트 폴더에서 `cargo run --example concurrency`를 실행합니다. 또는 이 폴더에서 `rustc --edition=2024 example.rs -o app`으로 컴파일하고 Windows는 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다.

[실습 파일](example.rs)

## 실행 예제

```rust
use std::{sync::mpsc, thread};
fn main() {
    let (tx, rx) = mpsc::channel();
    let handle = thread::spawn(move || { tx.send(String::from("done")).expect("receiver exists"); });
    println!("{}", rx.recv().expect("sender exists"));
    handle.join().expect("worker finished");
}
```

## 예상 결과

```text
done
```

## 동작 원리와 주의사항

send로 String을 전달하면 보낸 스레드는 그 값을 다시 소유하지 않습니다. recv는 메시지 또는 채널 종료까지 블록됩니다. 이 작은 예제는 expect로 구조적 가정을 표시하지만 서비스 코드는 채널 종료와 스레드 panic을 복구 정책에 맞게 처리해야 합니다. 실행 순서를 임의 sleep으로 맞추지 마세요.



## 직접 확인하기

여러 메시지를 보내고 송신자가 모두 사라졌을 때 수신 반복문이 종료되는지 확인하세요.

---

---

---

[전체 목차](../README.md) · [이전](../27.%20test%20%26%20assert_eq%21/README.md) · [다음](../29.%20Box%20%26%20Rc%20%26%20RefCell%20%26%20Arc/README.md)
