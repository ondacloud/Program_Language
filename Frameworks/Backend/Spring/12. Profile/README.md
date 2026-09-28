# Profile

## 개념과 사용 시점

프로필은 환경이나 목적에 따라 빈 등록 조건을 나눕니다. 활성 프로필은 refresh 전에 지정합니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Spring 과정 루트**입니다.

```powershell
python run.py "12. Profile/Main.java"
```

콘솔 예제는 결과를 출력하고 종료합니다. MVC 장은 MockMvc로 HTTP 처리를 같은 프로세스에서 검증하며 실제 포트를 열지 않습니다.

## 코드 읽기

```java
package course.l12;

import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;

public class Main {
  @Configuration
  static class Config {
    @Bean
    @Profile("demo")
    String label() {
      return "demo bean";
    }
  }

  public static void main(String[] args) throws Exception {
    try (var context = new AnnotationConfigApplicationContext()) {
      context.getEnvironment().setActiveProfiles("demo");
      context.register(Config.class);
      context.refresh();
      System.out.println(context.getBean(String.class));
    }
  }
}
```

[실행 파일](Main.java)

## 요청·예상 결과

demo bean

## 주의사항

프로필을 비밀 관리 대신 사용하지 마세요. 설정 조합이 늘면 테스트할 경우도 늘어납니다.

## 연습

프로필을 빼고 등록 여부를 확인하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
