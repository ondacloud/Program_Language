# try & catch & finally

## 개념과 사용 시점

try는 예외를 처리하고 식으로도 사용할 수 있습니다. finally는 정상·예외 흐름 뒤 정리를 수행합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Kotlin 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
python run.py "19. try & catch & finally/Main.kt"
```

## 코드 읽기

```kotlin
fun main() {
    val value = try { "abc".toInt() } catch (e: NumberFormatException) { -1 } finally { println("done") }
    println(value)
}
```

[실행 파일](Main.kt)

## 예상 결과

done, -1

## 주의사항

예상 가능한 입력 오류는 toIntOrNull로 표현할 수 있습니다. 잡을 오류의 범위를 구체적으로 정하세요.

## 연습

정상 숫자 문자열로 바꿔 보세요.

[과정 목차](../README.md)
