# when

## 개념과 사용 시점

when은 값·범위·타입 등에 따라 분기합니다. switch처럼 case마다 break를 넣지 않습니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Kotlin 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
python run.py "04. when/Main.kt"
```

## 코드 읽기

```kotlin
fun main() {
    val score = 80
    val grade = when (score) {
        in 90..100 -> "A"
        in 70..89 -> "B"
        else -> "C"
    }
    println(grade)
}
```

[실행 파일](Main.kt)

## 예상 결과

B

## 주의사항

범위 끝은 포함됩니다. sealed 타입이나 enum을 다루면 모든 경우 처리 여부를 검사할 수 있습니다.

## 연습

음수·100 초과를 invalid로 처리하세요.

[과정 목차](../README.md)
