# println & print

## 개념과 사용 시점

print는 이어 쓰고 println은 줄바꿈을 추가합니다. $name 또는 ${식}으로 문자열 템플릿을 만듭니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Kotlin 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
python run.py "01. println & print/Main.kt"
```

## 코드 읽기

```kotlin
fun main() {
    val name = "Mina"
    print("Hello, ")
    println(name)
}
```

[실행 파일](Main.kt)

## 예상 결과

Hello, Mina

## 주의사항

출력 함수의 반환 타입은 Unit입니다.

## 연습

점수를 문자열 템플릿으로 출력하세요.

[과정 목차](../README.md)
