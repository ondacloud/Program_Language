# for & in

## 개념과 사용 시점

for는 범위나 컬렉션의 원소를 순회합니다. step과 downTo로 진행 방향과 간격을 정합니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Kotlin 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
python run.py "05. for & in/Main.kt"
```

## 코드 읽기

```kotlin
fun main() {
    for (n in 1..5 step 2) println(n)
}
```

[실행 파일](Main.kt)

## 예상 결과

1, 3, 5

## 주의사항

1..5는 5를 포함하고 1 until 5는 5를 제외합니다.

## 연습

5부터 1까지 역순 출력하세요.

[과정 목차](../README.md)
