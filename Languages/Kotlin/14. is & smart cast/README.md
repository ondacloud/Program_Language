# is & smart cast

## 개념과 사용 시점

is로 타입을 확인하면 조건 안에서 해당 타입으로 사용할 수 있습니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Kotlin 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
python run.py "14. is & smart cast/Main.kt"
```

## 코드 읽기

```kotlin
fun main() {
    val value: Any = "hello"
    if (value is String) println(value.uppercase())
}
```

[실행 파일](Main.kt)

## 예상 결과

HELLO

## 주의사항

변경 가능한 속성은 검사 후 값이 바뀔 수 있어 smart cast가 제한될 수 있습니다.

## 연습

Int 값은 두 배로 출력하세요.

[과정 목차](../README.md)
