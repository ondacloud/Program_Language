# 배열·튜플·상수·블록 스코프

## 핵심 개념

배열은 동일 타입의 고정 길이 값, 튜플은 서로 다른 타입을 묶는 값입니다. 블록은 이름의 접근 범위를 정합니다.

## 실행 방법

Rust 1.90 이상을 준비하고 Rust 루트 폴더에서 `cargo run --example arrays-tuples-constants`를 실행합니다. 또는 이 폴더에서 `rustc --edition=2024 example.rs -o app`으로 컴파일하고 Windows는 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다.

[실습 파일](example.rs)

## 실행 예제

```rust
const LIMIT: usize = 3;
fn main() {
    let values: [i32; LIMIT] = [10, 20, 30];
    let pair = ("Kim", 20);
    let (name, age) = pair;
    println!("{} {name} {age}", values[1]);
    println!("{}", values.get(3).is_none());
    let x = 1;
    { let x = 2; println!("{x}"); }
    println!("{x}");
}
```

## 예상 결과

```text
20 Kim 20
true
2
1
```

## 동작 원리와 주의사항

const에는 타입을 명시하고 컴파일 시 평가 가능한 값을 사용합니다. 배열의 길이는 타입의 일부입니다. 범위를 벗어난 [] 접근은 panic할 수 있지만 get은 Option을 반환합니다. 같은 이름의 let은 shadowing이며 기존 값을 수정하는 mut과 다릅니다.



## 직접 확인하기

[0; 5] 반복 초기화와 튜플 인덱스 .0·.1을 사용해 보세요. 배열 길이가 다른 값을 대입하면 왜 안 되는지 설명하세요.

---

---

---

[전체 목차](../README.md) · [이전](../10.%20fn%20%26%20return/README.md) · [다음](../12.%20let%20%26%20mut/README.md)
