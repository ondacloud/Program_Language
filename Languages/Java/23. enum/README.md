# 열거형 enum

> Java 17 기준. `public class Main`을 포함한 블록은 Main.java로 저장합니다. 그 외는 부분 예제입니다. import는 파일 맨 위, 타입·메서드 선언은 해당 선언 위치, 실행 문장은 main 안에 두세요. 각 블록의 변수명은 독립 예제 기준입니다.
`enum`은 제한된 상수 집합을 타입 안전하게 표현합니다.

```java
enum OrderStatus {
    CREATED,
    PAID,
    SHIPPED,
    CANCELLED
}

OrderStatus status = OrderStatus.PAID;

switch (status) {
    case PAID -> System.out.println("Payment completed");
    case SHIPPED -> System.out.println("Shipping");
    default -> System.out.println(status);
}
```

Enum은 field, constructor, method도 가질 수 있습니다.

## 동작 원리와 주의사항

enum 상수는 ==로 비교해도 됩니다. ordinal은 선언 순서에 의존하므로 외부 저장용 식별자로 쓰지 마세요. valueOf는 상수 이름과 대소문자까지 같아야 하며 잘못된 이름은 IllegalArgumentException입니다.

## 직접 확인하기

상태별 표시 문자열 필드와 생성자를 추가하세요.

---

[언어 목차](../README.md) · [이전](../22.%20package%20import/README.md) · [다음](../24.%20wrapper%20autoboxing/README.md)

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
