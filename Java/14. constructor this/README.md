# 생성자와 this

> Java 17 기준. `public class Main`을 포함한 블록은 Main.java로 저장합니다. 그 외는 부분 예제입니다. import는 파일 맨 위, 타입·메서드 선언은 해당 선언 위치, 실행 문장은 main 안에 두세요. 각 블록의 변수명은 독립 예제 기준입니다.
생성자는 객체 생성 시 초기화를 담당하며 클래스 이름과 동일하고 반환 타입을 작성하지 않습니다.

```java
class Person {
    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Person(String name) {
        this(name, 0); // 다른 생성자 호출, 반드시 첫 문장
    }
}
```

`this`는 현재 객체를 가리킵니다. `this()`는 같은 클래스의 다른 생성자를 호출합니다.

## 동작 원리와 주의사항

Java 17 기준에서 this(...) 또는 super(...) 호출은 생성자 첫 문장이어야 합니다. 생성자를 하나라도 직접 정의하면 인수 없는 기본 생성자가 자동 생성되지 않습니다. this.name은 필드, name은 같은 이름의 매개변수입니다.

## 직접 확인하기

new Person()이 실패하는 이유를 설명하고 필요하면 명시적인 기본 생성자를 추가하세요.

---

[언어 목차](../README.md) · [이전](../13.%20class%20object/README.md) · [다음](../15.%20access%20modifier%20encapsulation/README.md)

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
