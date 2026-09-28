# val & var

## 개념과 사용 시점

val은 재할당 불가, var는 재할당 가능입니다. 타입 추론과 명시적 타입을 함께 사용할 수 있습니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Kotlin 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
python run.py "08. val & var/Main.kt"
```

## 코드 읽기

```kotlin
fun main() {
    val name: String = "Mina"
    var score = 80
    score += 5
    println("$name: $score")
}
```

[실행 파일](Main.kt)

## 예상 결과

Mina: 85

## 주의사항

val로 참조한 mutableList의 내용은 바뀔 수 있습니다. 불변 객체를 보장하는 키워드는 아닙니다.

## 연습

score를 val로 바꾸어 컴파일 오류를 확인하세요.

[과정 목차](../README.md)
