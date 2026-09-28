# if & else

## 개념과 사용 시점

if는 분기문이면서 값을 반환하는 식으로도 사용할 수 있습니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Kotlin 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
python run.py "03. if & else/Main.kt"
```

## 코드 읽기

```kotlin
fun main() {
    val score = 80
    val result = if (score >= 70) "pass" else "retry"
    println(result)
}
```

[실행 파일](Main.kt)

## 예상 결과

pass

## 주의사항

식으로 쓸 때는 필요한 모든 분기에 값을 제공해야 합니다.

## 연습

90점 이상 excellent를 추가하세요.

[과정 목차](../README.md)
