# Primary & Qualifier

## 개념과 사용 시점

같은 타입의 빈이 여러 개일 때 Primary는 기본 후보, Qualifier는 특정 후보를 선택합니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Spring 과정 루트**입니다.

```powershell
python run.py "09. Primary & Qualifier/Main.java"
```

콘솔 예제는 결과를 출력하고 종료합니다. MVC 장은 MockMvc로 HTTP 처리를 같은 프로세스에서 검증하며 실제 포트를 열지 않습니다.

## 코드 읽기

```java
package course.l09;

import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;

public class Main {
  record Greeter(String name) {}

  @Configuration
  static class Config {
    @Bean
    @Primary
    String mainName() {
      return "Mina";
    }

    @Bean
    String otherName() {
      return "Jin";
    }

    @Bean
    Greeter greeter(@Qualifier("otherName") String name) {
      return new Greeter(name);
    }
  }

  public static void main(String[] args) throws Exception {
    try (var context = new AnnotationConfigApplicationContext(Config.class)) {
      System.out.println(context.getBean(String.class));
      System.out.println(context.getBean(Greeter.class).name());
    }
  }
}
```

[실행 파일](Main.java)

## 요청·예상 결과

Mina, Jin

## 주의사항

빈 이름에 과도하게 의존하면 리팩터링이 어려워집니다. 후보 선택을 명시적으로 설계하세요.

## 연습

Primary를 제거했을 때 타입 조회 오류를 확인하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
