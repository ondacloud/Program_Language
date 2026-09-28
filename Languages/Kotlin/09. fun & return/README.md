# fun & return

## 개념과 사용 시점

fun으로 함수를 정의합니다. 기본 인자·이름 있는 인자로 호출 의도를 드러낼 수 있습니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Kotlin 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
python run.py "09. fun & return/Main.kt"
```

## 코드 읽기

```kotlin
fun greet(name: String, prefix: String = "Hi"): String = "$prefix, $name"
fun main() {
    println(greet(name = "Mina"))
}
```

[실행 파일](Main.kt)

## 예상 결과

Hi, Mina

## 주의사항

식 본문 함수는 반환 타입을 추론할 수 있습니다. 공개 API에서는 타입을 명시하면 계약을 읽기 쉽습니다.

## 연습

prefix 값을 바꿔 호출하세요.

[과정 목차](../README.md)
