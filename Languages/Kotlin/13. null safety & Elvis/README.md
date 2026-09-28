# null safety & Elvis

## 개념과 사용 시점

nullable 타입은 ?로 표시합니다. ?.는 안전한 호출, ?:는 null일 때의 대체값을 지정합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Kotlin 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
python run.py "13. null safety & Elvis/Main.kt"
```

## 코드 읽기

```kotlin
fun main() {
    val name: String? = null
    println(name?.length ?: 0)
}
```

[실행 파일](Main.kt)

## 예상 결과

0

## 주의사항

!!는 null일 때 예외를 발생시킵니다. 검사와 기본값을 우선 사용하세요.

## 연습

name을 Mina로 바꾸세요.

[과정 목차](../README.md)
