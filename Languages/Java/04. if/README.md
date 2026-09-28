# 조건문 — if

> Java 17 기준. `public class Main`을 포함한 블록은 Main.java로 저장합니다. 그 외는 부분 예제입니다. import는 파일 맨 위, 타입·메서드 선언은 해당 선언 위치, 실행 문장은 main 안에 두세요. 각 블록의 변수명은 독립 예제 기준입니다.
조건식은 반드시 `boolean` 결과여야 합니다.

```java
int score = 85;

if (score >= 90) {
    System.out.println("A");
} else if (score >= 80) {
    System.out.println("B");
} else {
    System.out.println("C");
}
```

> Java에서는 `if (a = 0)`처럼 대입한 정수를 조건으로 사용할 수 없습니다. 동등 비교는 `a == 0`을 사용합니다.

## 동작 원리와 주의사항

분기는 위에서 처음 참인 조건만 실행합니다. 독립적인 if를 여러 개 쓰는 경우와 다릅니다. boolean 변수에 대입한 결과도 boolean이므로 if (flag = true)는 컴파일될 수 있습니다. 비교와 대입을 구별하세요.

## 직접 확인하기

점수 79, 80, 89, 90의 분기를 예상하세요. 답: C, B, B, A.

---

[언어 목차](../README.md) · [이전](../03.%20scanner/README.md) · [다음](../05.%20switch/README.md)

## 동봉 실행 파일과 실행 방법

각 예제는 독립적으로 실행합니다. 추가 예제는 examples 하위 폴더에 분리했습니다. 소스 파일을 수정한 뒤 다시 실행하며, 컴파일 언어는 다시 빌드하세요.

### 예제 1

이 문서와 같은 폴더에서 실행합니다.

[Main.java](Main.java)

```sh
javac -encoding UTF-8 --release 17 -d . Main.java
java -Dfile.encoding=UTF-8 -cp . Main
```

JDK 17 이상이 필요합니다. 부분 예제에는 Main 진입점과 필요한 선언 위치를 보완했습니다.
