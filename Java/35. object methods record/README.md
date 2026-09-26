# Object 메서드와 record — 동등성과 복사

## 핵심 개념

record는 컴포넌트를 바탕으로 생성자, 접근자, equals, hashCode, toString을 제공합니다.

## 실행 예제

```java
import java.util.List;
import java.util.ArrayList;

record User(String name, List<String> roles) {
    User {
        roles = List.copyOf(roles);
    }
}

public class Main {
    public static void main(String[] args) {
        List<String> source = new ArrayList<>(List.of("reader"));
        User first = new User("Alice", source);
        source.add("admin");
        User second = new User("Alice", List.of("reader"));
        System.out.println(first.roles());
        System.out.println(first.equals(second));
        System.out.println(first.hashCode() == second.hashCode());
    }
}
```

## 실행 결과

```text
[reader]
true
true
```

## 동작 원리와 주의사항

record 컴포넌트 필드는 final이지만 참조한 리스트까지 깊은 불변이 되지는 않습니다. 필요하면 생성자에서 List.copyOf로 방어적 복사를 하세요. equals가 같은 객체는 같은 hashCode여야 하며 반대는 성립하지 않습니다. 위에서는 수정 불가능한 목록으로 복사하고 원소도 불변 String이므로 외부 목록 변경이 전달되지 않습니다. List.copyOf가 원소 객체 자체를 복제하는 것은 아닙니다. record 접근자는 getName()이 아니라 name()입니다.

## 직접 확인하기

동일 컴포넌트의 record 두 개가 equals로 같은지 확인하세요.

---

[언어 목차](../README.md) · [이전](../34.%20jvm%20memory/README.md) · [다음](../36.%20null%20common%20pitfalls/README.md)

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
