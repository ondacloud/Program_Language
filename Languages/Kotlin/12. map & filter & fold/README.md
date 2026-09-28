# map & filter & fold

## 개념과 사용 시점

컬렉션 변환·선택·누적 연산을 람다로 표현합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Kotlin 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
python run.py "12. map & filter & fold/Main.kt"
```

## 코드 읽기

```kotlin
fun main() {
    val scores = listOf(60, 80, 90)
    println(scores.filter { it >= 70 }.map { it + 1 })
    println(scores.fold(0) { total, score -> total + score })
}
```

[실행 파일](Main.kt)

## 예상 결과

[81, 91], 230

## 주의사항

중간 컬렉션 비용이 중요하면 sequence를 검토하되 측정 없이 항상 빠르다고 가정하지 마세요.

## 연습

평균 점수와 합격자 수를 계산하세요.

[과정 목차](../README.md)
