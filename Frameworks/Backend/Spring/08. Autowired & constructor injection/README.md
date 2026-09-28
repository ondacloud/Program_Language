# Autowired & constructor injection

## 개념과 사용 시점

생성자 주입은 객체 생성 시 필요한 의존성을 명확하게 합니다. 생성자가 하나면 Autowired를 생략할 수 있습니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Spring 과정 루트**입니다.

```powershell
python run.py "08. Autowired & constructor injection/Main.java"
```

콘솔 예제는 결과를 출력하고 종료합니다. MVC 장은 MockMvc로 HTTP 처리를 같은 프로세스에서 검증하며 실제 포트를 열지 않습니다.

## 코드 읽기

```java
package course.l08;

import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;

public class Main {
  static class Greeter {
    private final String name;

    @Autowired
    Greeter(String name) {
      this.name = name;
    }

    String message() {
      return "Hi, " + name;
    }
  }

  @Configuration
  @Import(Greeter.class)
  static class Config {
    @Bean
    String name() {
      return "Mina";
    }
  }

  public static void main(String[] args) throws Exception {
    try (var context = new AnnotationConfigApplicationContext(Config.class)) {
      System.out.println(context.getBean(Greeter.class).message());
    }
  }
}
```

[실행 파일](Main.java)

## 요청·예상 결과

Hi, Mina

## 주의사항

직접 new로 만든 객체는 자동으로 컨테이너 주입을 받지 않습니다. 필수 의존성은 final 필드와 생성자로 표현하세요.

## 연습

다른 이름 제공자를 주입하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
