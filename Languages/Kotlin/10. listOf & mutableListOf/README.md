# listOf & mutableListOf

## 개념과 사용 시점

읽기 전용 List 인터페이스와 변경 가능한 MutableList를 구분합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Kotlin 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
python run.py "10. listOf & mutableListOf/Main.kt"
```

## 코드 읽기

```kotlin
fun main() {
    val names = listOf("Mina", "Jin")
    val scores = mutableListOf(80, 60)
    scores.add(90)
    println(names.joinToString(","))
    println(scores.sum())
}
```

[실행 파일](Main.kt)

## 예상 결과

Mina,Jin 및 230

## 주의사항

읽기 전용 인터페이스가 다른 참조를 통한 변경까지 막는 깊은 불변성을 뜻하지는 않습니다.

## 연습

getOrNull로 범위를 벗어난 인덱스를 처리하세요.

[과정 목차](../README.md)
