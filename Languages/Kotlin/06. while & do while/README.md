# while & do while

## 개념과 사용 시점

while은 조건을 먼저 확인하고 do while은 최소 한 번 실행합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Kotlin 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
python run.py "06. while & do while/Main.kt"
```

## 코드 읽기

```kotlin
fun main() {
    var n = 2
    while (n > 0) { println(n); n-- }
    do { println("once") } while (false)
}
```

[실행 파일](Main.kt)

## 예상 결과

2, 1, once

## 주의사항

반복 종료를 보장하는 상태 변경을 확인하세요.

## 연습

n을 0으로 시작해 비교하세요.

[과정 목차](../README.md)
