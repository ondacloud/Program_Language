# operator

## 개념과 사용 시점

산술·비교·논리 연산자를 사용합니다. Int 나눗셈은 소수 부분을 버립니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Kotlin 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
python run.py "00. operator/Main.kt"
```

## 코드 읽기

```kotlin
fun main() {
    println(7 / 2)
    println(7.0 / 2)
    println(7 % 2)
    println(3 > 2 && 2 != 0)
}
```

[실행 파일](Main.kt)

## 예상 결과

3, 3.5, 1, true

## 주의사항

==는 내용의 동등성, ===는 참조 동일성입니다. 숫자 비교에 무심코 ===를 사용하지 마세요.

## 연습

Double과 Int의 나눗셈을 비교하세요.

[과정 목차](../README.md)
