# generic & extension

## 개념과 사용 시점

제네릭은 타입 관계를 보존하고 확장 함수는 기존 타입에 호출 문법을 추가합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Kotlin 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
python run.py "21. generic & extension/Main.kt"
```

## 코드 읽기

```kotlin
fun <T> first(items: List<T>): T? = items.firstOrNull()
fun String.greet(): String = "Hi, $this"
fun main() {
    println(first(listOf(10, 20)))
    println("Mina".greet())
}
```

[실행 파일](Main.kt)

## 예상 결과

10, Hi, Mina

## 주의사항

확장 함수는 실제 클래스에 멤버를 추가하지 않으며 수신 타입에 따라 정적으로 선택됩니다.

## 연습

빈 리스트를 전달해 null을 확인하세요.

[과정 목차](../README.md)
