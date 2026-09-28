# Value & Environment

## 개념과 사용 시점

Value로 설정값을 주입하고 기본값을 지정할 수 있습니다. 설정 조회는 하드코딩된 업무 값과 구분합니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Spring 과정 루트**입니다.

```powershell
python run.py "11. Value & Environment/Main.java"
```

콘솔 예제는 결과를 출력하고 종료합니다. MVC 장은 MockMvc로 HTTP 처리를 같은 프로세스에서 검증하며 실제 포트를 열지 않습니다.

## 코드 읽기

```java
package course.l11;

import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;

public class Main {
  record Greeter(String name) {}

  @Configuration
  static class Config {
    @Bean
    Greeter greeter(@Value("${course.name:guest}") String name) {
      return new Greeter(name);
    }
  }

  public static void main(String[] args) throws Exception {
    try (var context = new AnnotationConfigApplicationContext(Config.class)) {
      System.out.println(context.getBean(Greeter.class).name());
    }
  }
}
```

[실행 파일](Main.java)

## 요청·예상 결과

설정이 없으면 guest

## 주의사항

이 예제는 ${course.name:guest} 기본값을 사용합니다. 비밀값을 소스나 로그에 넣지 마세요.

## 연습

시스템 속성 course.name을 지정해 결과를 바꾸세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
