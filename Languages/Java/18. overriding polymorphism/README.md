# 오버라이딩과 다형성

> Java 17 기준. `public class Main`을 포함한 블록은 Main.java로 저장합니다. 그 외는 부분 예제입니다. import는 파일 맨 위, 타입·메서드 선언은 해당 선언 위치, 실행 문장은 main 안에 두세요. 각 블록의 변수명은 독립 예제 기준입니다.
**Overriding**은 자식 클래스가 부모 클래스의 메서드를 같은 시그니처로 재정의하는 것입니다. `@Override` 사용을 권장합니다.

```java
class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Woof");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Dog(); // Upcasting
        animal.sound();            // Dog.sound() 실행
    }
}
```

부모 타입 참조로 여러 자식 타입을 다루고 실제 객체의 overriding 메서드가 실행되는 것이 다형성의 핵심입니다.

## 동작 원리와 주의사항

동적 디스패치는 인스턴스 메서드에 적용됩니다. static 메서드는 오버라이딩이 아닌 숨김이며 필드도 메서드처럼 동적 선택되지 않습니다. 재정의 시 접근 범위를 더 좁힐 수 없고 검사 예외를 더 넓게 선언할 수 없습니다.

## 직접 확인하기

Animal 참조에 Dog를 넣었을 때 sound는 Dog 구현인데 정적 타입은 Animal인 이유를 설명하세요.

---

[언어 목차](../README.md) · [이전](../17.%20overloading/README.md) · [다음](../19.%20abstract/README.md)

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
