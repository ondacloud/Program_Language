# 출력 — print!·println!·eprintln!

## 핵심 개념

Rust 출력 매크로는 형식 문자열과 값을 컴파일 시 검사합니다. println!은 줄바꿈을 추가합니다.

## 실행 방법

Rust 1.90 이상을 준비하고 Rust 루트 폴더에서 `cargo run --example formatted-output`를 실행합니다. 또는 이 폴더에서 `rustc --edition=2024 example.rs -o app`으로 컴파일하고 Windows는 `.\app.exe`, Linux/macOS는 `./app`으로 실행합니다.

[실습 파일](example.rs)

## 실행 예제

```rust
fn main() {
    let name = "Alice";
    let count = 3;
    print!("Hello ");
    println!("{name}");
    println!("count={count:02}");
    println!("{:?}", [1, 2, 3]);
}
```

## 예상 결과

```text
Hello Alice
count=03
[1, 2, 3]
```

## 동작 원리와 주의사항

{}는 Display, {:?}는 Debug 형식을 사용합니다. eprintln!은 stderr로 출력합니다. print!에는 줄바꿈이 없어 입력 프롬프트에 쓸 때 stdout의 flush가 필요할 수 있습니다. 매크로 호출의 !는 논리 부정 연산자 위치와 구별하세요.



## 직접 확인하기

실수의 소수 자릿수 형식을 사용해 보고, 배열을 {}로 출력할 때 어떤 오류가 나는지 확인하세요.

---

---

[전체 목차](../README.md) · [이전](../00.%20operator/README.md) · [다음](../02.%20stdin%20%26%20read_line/README.md)
