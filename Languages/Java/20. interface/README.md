# 인터페이스

> Java 17 기준. `public class Main`을 포함한 블록은 Main.java로 저장합니다. 그 외는 부분 예제입니다. import는 파일 맨 위, 타입·메서드 선언은 해당 선언 위치, 실행 문장은 main 안에 두세요. 각 블록의 변수명은 독립 예제 기준입니다.
인터페이스는 구현 클래스가 따라야 할 동작의 계약을 표현합니다. 클래스는 여러 인터페이스를 구현할 수 있습니다.

```java
interface Flyable {
    int MAX_SPEED = 100; // public static final

    void fly();          // public abstract

    default void land() {
        System.out.println("Landing");
    }

    static void info() {
        System.out.println("Flyable");
    }
}

class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Bird flies");
    }
}
```

인터페이스 메서드는 `default`, `static`, private helper method 등을 가질 수 있으므로 단순히 "메서드 선언만 가진 설계도"라고만 설명하는 것은 부족합니다.

## 동작 원리와 주의사항

인터페이스 필드는 암묵적으로 public static final입니다. 추상 메서드 구현은 public이어야 합니다. 여러 인터페이스의 같은 default 메서드를 상속하면 충돌을 직접 해결해야 할 수 있습니다.

## 직접 확인하기

Bird 객체를 Flyable 변수로 받아 fly와 land를 호출하세요.

---

[언어 목차](../README.md) · [이전](../19.%20abstract/README.md) · [다음](../21.%20static%20final/README.md)

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
