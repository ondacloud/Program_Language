# Vec와 HashMap

## 핵심 개념

Vec은 가변 길이 순서 컬렉션이고 HashMap은 키로 값을 찾는 컬렉션입니다.

## 실행 방법

Rust 1.90 이상을 준비하고 Rust 루트 폴더에서 `cargo run --example collections`를 실행합니다. 또는 이 폴더에서 `rustc --edition=2024 example.rs -o app`으로 컴파일하고 Windows는 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다.

[실습 파일](example.rs)

## 실행 예제

```rust
use std::collections::HashMap;
fn main() {
    let mut values = vec![3, 1];
    values.push(2); values.sort();
    let mut counts = HashMap::new();
    for word in ["a", "b", "a"] { *counts.entry(word).or_insert(0) += 1; }
    println!("{values:?}");
    println!("{}", counts["a"]);
}
```

## 예상 결과

```text
[1, 2, 3]
2
```

## 동작 원리와 주의사항

entry는 조회와 기본값 삽입을 한 흐름으로 처리합니다. HashMap 순회 순서는 보장되지 않습니다. values[i]와 map[key]는 존재하지 않으면 panic하므로 외부 입력 인덱스에는 get을 사용하세요.



## 직접 확인하기

모든 단어 개수를 키 정렬 순서로 출력하고 중복을 제거하는 HashSet도 비교하세요.

---

---

---

[전체 목차](../README.md) · [이전](../19.%20enum%20%26%20Option/README.md) · [다음](../21.%20trait%20%26%20generic/README.md)
