# 클래스와 객체

> Java 17 기준. `public class Main`을 포함한 블록은 Main.java로 저장합니다. 그 외는 부분 예제입니다. import는 파일 맨 위, 타입·메서드 선언은 해당 선언 위치, 실행 문장은 main 안에 두세요. 각 블록의 변수명은 독립 예제 기준입니다.
클래스는 객체의 상태(field)와 동작(method)을 정의하는 설계도이고, 객체는 클래스로부터 생성된 인스턴스입니다.

```java
class Person {
    String name;
    int age;

    void introduce() {
        System.out.printf("%s, %d%n", name, age);
    }
}

public class Main {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "Alice";
        p.age = 20;
        p.introduce();
    }
}
```

## 동작 원리와 주의사항

클래스는 타입이고 new는 인스턴스를 만듭니다. 인스턴스 필드는 객체마다 별개입니다. 예제의 직접 필드 접근은 동작 설명용이며 유효성 검사가 필요하면 필드를 private으로 감추고 동작을 공개하세요.

## 직접 확인하기

두 Person 객체를 만들고 한쪽의 age만 바꿔 다른 객체와 독립적인지 확인하세요.

---

[언어 목차](../README.md) · [이전](../12.%20string/README.md) · [다음](../14.%20constructor%20this/README.md)

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
