# class & init

## 개념과 사용 시점

클래스의 주 생성자와 init 블록으로 인스턴스 초기 상태를 검사합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Kotlin 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
python run.py "16. class & init/Main.kt"
```

## 코드 읽기

```kotlin
class Account(val balance: Int) { init { require(balance >= 0) { "negative balance" } } }
fun main() {
    println(Account(10).balance)
}
```

[실행 파일](Main.kt)

## 예상 결과

10

## 주의사항

검증 실패는 예외입니다. 외부 입력 오류를 호출 측에서 처리하세요.

## 연습

음수 잔액을 전달하고 오류 메시지를 확인하세요.

[과정 목차](../README.md)
