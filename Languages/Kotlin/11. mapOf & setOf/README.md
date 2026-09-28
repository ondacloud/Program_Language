# mapOf & setOf

## 개념과 사용 시점

Map은 키와 값의 연결, Set은 중복 없는 원소 집합입니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Kotlin 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
python run.py "11. mapOf & setOf/Main.kt"
```

## 코드 읽기

```kotlin
fun main() {
    val scores = mapOf("Mina" to 80, "Jin" to 60)
    println(scores["Mina"])
    println(setOf("A", "A", "B").size)
}
```

[실행 파일](Main.kt)

## 예상 결과

80, 2

## 주의사항

Map의 없는 키 조회는 null입니다. getValue는 없는 키에 예외를 던집니다.

## 연습

없는 이름에 기본값 0을 반환하세요.

[과정 목차](../README.md)
