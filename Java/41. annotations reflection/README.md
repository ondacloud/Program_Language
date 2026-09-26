# 애너테이션과 리플렉션

## 핵심 개념

애너테이션은 코드에 메타데이터를 붙입니다. 런타임에 읽으려면 RUNTIME 보존 정책을 사용합니다.

## 실행 예제

```java
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Label {
    String value();
}

@Label("study")
class Example {}

public class Main {
    public static void main(String[] args) {
        Label label = Example.class.getAnnotation(Label.class);
        System.out.println(label.value());
    }
}
```

## 실행 결과

```text
study
```

## 동작 원리와 주의사항

애너테이션만으로 동작이 자동 실행되는 것은 아닙니다. 컴파일러·프레임워크·사용자 코드가 해석해야 합니다. 리플렉션은 런타임 타입·멤버를 조사하지만 캡슐화·모듈 접근 제한과 실패 가능성을 고려해야 합니다. 가능하면 직접 호출로 표현하고 메타데이터가 필요한 곳에만 사용하세요.

## 직접 확인하기

보존 정책을 CLASS로 바꾸면 getAnnotation 결과가 null이 되는지 확인하고 null을 처리하세요.

---

[언어 목차](../README.md) · [이전](../40.%20immutability/README.md)

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
