# break & continue

## 개념과 사용 시점

break는 반복 종료, continue는 다음 회차 진행입니다.

## 실행

[과정 준비 안내](../README.md)를 먼저 완료하세요. 터미널의 작업 폴더는 **Kotlin 과정 루트**입니다. 경로의 공백과 `&`를 보호하도록 따옴표를 유지하세요.

```powershell
python run.py "07. break & continue/Main.kt"
```

## 코드 읽기

```kotlin
fun main() {
    for (n in 1..5) {
        if (n == 2) continue
        if (n == 4) break
        println(n)
    }
}
```

[실행 파일](Main.kt)

## 예상 결과

1, 3

## 주의사항

중첩 반복의 대상은 레이블을 써서 지정할 수 있지만 과도한 레이블은 읽기 어렵습니다.

## 연습

짝수만 건너뛰도록 바꾸세요.

[과정 목차](../README.md)
