# 접근 제어와 캡슐화

> Java 17 기준. `public class Main`을 포함한 블록은 Main.java로 저장합니다. 그 외는 부분 예제입니다. import는 파일 맨 위, 타입·메서드 선언은 해당 선언 위치, 실행 문장은 main 안에 두세요. 각 블록의 변수명은 독립 예제 기준입니다.
|Modifier|Same Class|Same Package|Subclass (different package)|Everywhere|
|---|---|---|---|---|
|`private`|O|X|X|X|
|default(package-private)|O|O|X|X|
|`protected`|O|O|O*|X|
|`public`|O|O|O|O|

캡슐화에서는 일반적으로 field를 `private`으로 감추고 필요한 동작을 메서드로 제공합니다.

```java
class Person {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) throw new IllegalArgumentException("age must be >= 0");
        this.age = age;
    }
}
```

> Getter/Setter를 무조건 만드는 것이 캡슐화는 아닙니다. 객체가 유효한 상태를 유지하도록 필요한 연산만 공개하는 것이 핵심입니다.

## 동작 원리와 주의사항

표의 protected 별표: 다른 패키지의 하위 클래스에서는 상속 관계를 통한 접근이 가능하지만 임의의 부모 객체 참조로 보호 멤버를 읽을 수 있는 것은 아닙니다. default 접근 수준은 키워드가 없는 package-private이며 인터페이스의 default 메서드와 다릅니다.

## 직접 확인하기

setAge(-1)이 객체를 잘못된 상태로 바꾸기 전에 예외를 발생시키는지 확인하세요.

---

[언어 목차](../README.md) · [이전](../14.%20constructor%20this/README.md) · [다음](../16.%20inheritance%20super/README.md)

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
