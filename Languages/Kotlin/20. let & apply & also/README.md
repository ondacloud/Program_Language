# let & apply & also

## 개념과 사용 시점

스코프 함수는 객체를 짧은 블록에서 처리합니다. let은 블록 결과, apply·also는 원래 객체를 반환합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Kotlin 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
python run.py "20. let & apply & also/Main.kt"
```

## 코드 읽기

```kotlin
fun main() {
    val names = mutableListOf<String>().apply { add("Mina") }.also { println(it.size) }
    println(names.firstOrNull()?.let { it.uppercase() })
}
```

[실행 파일](Main.kt)

## 예상 결과

1, MINA

## 주의사항

this와 it, 반환값 차이를 구분하세요. 중첩 스코프 함수는 가독성을 떨어뜨릴 수 있습니다.

## 연습

run과 with의 반환값을 비교하세요.

[과정 목차](../README.md)
