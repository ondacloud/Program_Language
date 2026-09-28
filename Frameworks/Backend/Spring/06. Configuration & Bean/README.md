# Configuration & Bean

## 개념과 사용 시점

Configuration은 빈 정의를 모으고 Bean 메서드는 관리할 객체를 반환합니다. 의존 빈은 매개변수로 전달받을 수 있습니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Spring 과정 루트**입니다.

```powershell
python run.py "06. Configuration & Bean/Main.java"
```

콘솔 예제는 결과를 출력하고 종료합니다. MVC 장은 MockMvc로 HTTP 처리를 같은 프로세스에서 검증하며 실제 포트를 열지 않습니다.

## 코드 읽기

```java
package course.l06;

import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;

public class Main {
  record Greeter(String name) {
    String message() {
      return "Hi, " + name;
    }
  }

  @Configuration
  static class Config {
    @Bean
    String name() {
      return "Mina";
    }

    @Bean
    Greeter greeter(String name) {
      return new Greeter(name);
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

빈 생성 메서드에서 외부 자원 연결을 무조건 하드코딩하지 말고 설정·수명·실패 정책을 분리하세요.

## 연습

인사말 prefix 빈을 별도로 추가하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
