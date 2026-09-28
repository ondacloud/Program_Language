# 추상 클래스

> Java 17 기준. `public class Main`을 포함한 블록은 Main.java로 저장합니다. 그 외는 부분 예제입니다. import는 파일 맨 위, 타입·메서드 선언은 해당 선언 위치, 실행 문장은 main 안에 두세요. 각 블록의 변수명은 독립 예제 기준입니다.
추상 클래스는 `abstract`로 선언하며 직접 인스턴스를 생성할 수 없습니다. 일반 field/method, 생성자, 추상 메서드를 모두 가질 수 있습니다.

```java
abstract class Animal {
    private final String name;

    Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void sound();
}

class Dog extends Animal {
    Dog(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.println("Woof");
    }
}
```

## 동작 원리와 주의사항

추상 클래스는 공통 상태·구현·생성자를 가질 수 있습니다. 추상 메서드를 구현하지 않은 하위 클래스도 abstract여야 합니다. 공통 상태가 필요 없는 역할 계약은 interface가 적합할 수 있습니다.

## 직접 확인하기

이름은 공통으로 보관하고 sound만 다른 Cat 클래스를 구현하세요.

---

[언어 목차](../README.md) · [이전](../18.%20overriding%20polymorphism/README.md) · [다음](../20.%20interface/README.md)

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
