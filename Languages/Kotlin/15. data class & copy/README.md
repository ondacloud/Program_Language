# data class & copy

## 개념과 사용 시점

data class는 값 전달에 필요한 equals·toString·copy 등의 기능을 생성합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Kotlin 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
python run.py "15. data class & copy/Main.kt"
```

## 코드 읽기

```kotlin
data class Student(val name: String, val score: Int)
fun main() {
    val original = Student("Mina", 80)
    println(original.copy(score = 90))
}
```

[실행 파일](Main.kt)

## 예상 결과

Student(name=Mina, score=90)

## 주의사항

copy는 얕은 복사입니다. 내부에 가변 객체가 있으면 공유될 수 있습니다.

## 연습

원본 score가 그대로 80인지 확인하세요.

[과정 목차](../README.md)
