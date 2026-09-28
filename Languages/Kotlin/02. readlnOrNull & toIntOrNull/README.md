# readlnOrNull & toIntOrNull

## 개념과 사용 시점

한 줄 입력을 받아 안전하게 숫자로 변환합니다. EOF는 null이고 숫자가 아니면 변환도 null입니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Kotlin 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
python run.py "02. readlnOrNull & toIntOrNull/Main.kt"
```

## 코드 읽기

```kotlin
fun main() {
    print("Score: ")
    val score = readlnOrNull()?.toIntOrNull()
    println(score?.let { it + 1 } ?: "invalid")
}
```

[실행 파일](Main.kt)

## 예상 결과

80 입력 시 81, abc 또는 입력 종료 시 invalid

## 주의사항

toInt는 잘못된 입력에서 예외를 던집니다. null 처리와 허용 범위 검사를 함께 설계하세요.

## 연습

0부터 100 사이만 허용하세요.

[과정 목차](../README.md)
