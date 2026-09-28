# sealed interface & when

## 개념과 사용 시점

sealed 계층은 가능한 구현 종류를 제한하고 when의 완전한 분기 검사를 돕습니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Kotlin 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
python run.py "18. sealed interface & when/Main.kt"
```

## 코드 읽기

```kotlin
sealed interface Result
data class Success(val score: Int) : Result
data object Missing : Result
fun main() {
    val result: Result = Success(80)
    println(when (result) { is Success -> result.score.toString(); Missing -> "missing" })
}
```

[실행 파일](Main.kt)

## 예상 결과

80

## 주의사항

상태를 문자열 여러 개로 표현하는 것보다 각 상태에 필요한 데이터를 명확하게 묶을 수 있습니다.

## 연습

실패 사유가 있는 상태를 추가하세요.

[과정 목차](../README.md)
