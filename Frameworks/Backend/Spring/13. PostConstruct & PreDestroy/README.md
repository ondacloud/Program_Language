# PostConstruct & PreDestroy

## 개념과 사용 시점

생성·의존성 주입 이후 초기화와 컨테이너 종료 시 정리를 콜백으로 연결합니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Spring 과정 루트**입니다.

```powershell
python run.py "13. PostConstruct & PreDestroy/Main.java"
```

콘솔 예제는 결과를 출력하고 종료합니다. MVC 장은 MockMvc로 HTTP 처리를 같은 프로세스에서 검증하며 실제 포트를 열지 않습니다.

## 코드 읽기

```java
package course.l13;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;

public class Main {
  static class Resource {
    @PostConstruct
    public void start() {
      System.out.println("start");
    }

    @PreDestroy
    public void stop() {
      System.out.println("stop");
    }
  }

  @Configuration
  static class Config {
    @Bean
    Resource resource() {
      return new Resource();
    }
  }

  public static void main(String[] args) throws Exception {
    try (var context = new AnnotationConfigApplicationContext(Config.class)) {
      System.out.println("using");
    }
  }
}
```

[실행 파일](Main.java)

## 요청·예상 결과

start, using, stop

## 주의사항

애너테이션은 jakarta.annotation 패키지입니다. 강제 프로세스 종료에서 정리 콜백 실행을 보장할 수는 없습니다.

## 연습

자원 close를 destroyMethod로 연결해 보세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
