# 반복자와 클로저

## 핵심 개념

반복자는 값을 순차 처리합니다. map과 filter는 지연 실행되며 collect나 sum 같은 소비 연산이 작업을 수행합니다.

## 실행 방법

Rust 1.90 이상을 준비하고 Rust 루트 폴더에서 `cargo run --example iterators`를 실행합니다. 또는 이 폴더에서 `rustc --edition=2024 example.rs -o app`으로 컴파일하고 Windows는 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다.

[실습 파일](example.rs)

## 실행 예제

```rust
fn main() {
    let values = vec![1, 2, 3, 4];
    let limit = 2;
    let doubled: Vec<_> = values.iter().copied().filter(|n| *n > limit).map(|n| n * 2).collect();
    println!("{doubled:?}");
    println!("{}", values.len());
}
```

## 예상 결과

```text
[6, 8]
4
```

## 동작 원리와 주의사항

iter는 빌리고 iter_mut는 수정 가능하게 빌리며 into_iter는 컬렉션 종류에 따라 소유 값을 소비합니다. 이 Vec에서 into_iter를 호출하면 Vec 소유권을 넘깁니다. 클로저는 주변 변수를 빌리거나 이동으로 캡처할 수 있습니다.



## 직접 확인하기

into_iter로 바꾼 뒤 values.len() 사용 가능 여부를 확인하고 sum으로 합계를 구하세요.

---

---

---

[전체 목차](../README.md) · [이전](../22.%20lifetime/README.md) · [다음](../24.%20Result%20%26%20Ok%20%26%20Err/README.md)
