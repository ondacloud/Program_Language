# 상속과 super

> Java 17 기준. `public class Main`을 포함한 블록은 Main.java로 저장합니다. 그 외는 부분 예제입니다. import는 파일 맨 위, 타입·메서드 선언은 해당 선언 위치, 실행 문장은 main 안에 두세요. 각 블록의 변수명은 독립 예제 기준입니다.
`extends`로 클래스를 상속할 수 있습니다. Java 클래스는 하나의 클래스만 직접 상속할 수 있습니다.

```java
class Animal {
    protected String name;

    Animal(String name) {
        this.name = name;
    }

    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name); // 부모 생성자 호출
    }

    @Override
    void sound() {
        super.sound();
        System.out.println("Woof");
    }
}
```

`super`는 부모 클래스의 field/method 접근 또는 부모 생성자 호출에 사용합니다.

## 동작 원리와 주의사항

super는 별도 부모 객체를 만든다는 뜻이 아니라 현재 인스턴스의 부모 클래스 구현을 선택하는 표현입니다. private 멤버를 직접 접근할 수 없고 생성자는 상속되지 않습니다. 단순 코드 재사용만 필요하면 상속보다 구성도 고려하세요.

## 직접 확인하기

Dog의 sound를 호출하면 Animal sound 다음 Woof가 출력되는지 확인하세요.

---

[언어 목차](../README.md) · [이전](../15.%20access%20modifier%20encapsulation/README.md) · [다음](../17.%20overloading/README.md)

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
