# interface & override

## 개념과 사용 시점

interface는 동작 계약을 정의합니다. 구현 클래스는 override로 구현을 표시합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Kotlin 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
python run.py "17. interface & override/Main.kt"
```

## 코드 읽기

```kotlin
interface Speaker { fun speak(): String }
class Greeter : Speaker { override fun speak() = "hello" }
fun main() {
    val speaker: Speaker = Greeter()
    println(speaker.speak())
}
```

[실행 파일](Main.kt)

## 예상 결과

hello

## 주의사항

Kotlin 클래스는 기본적으로 final입니다. 상속을 열려면 open 또는 적절한 추상 타입을 사용합니다.

## 연습

다른 인사말을 반환하는 구현을 추가하세요.

[과정 목차](../README.md)
