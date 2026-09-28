# EventListener & publishEvent

## 개념과 사용 시점

애플리케이션 내부 이벤트로 발행자와 후속 처리를 분리합니다. 기본 이벤트 전달은 동기적입니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Spring 과정 루트**입니다.

```powershell
python run.py "14. EventListener & publishEvent/Main.java"
```

콘솔 예제는 결과를 출력하고 종료합니다. MVC 장은 MockMvc로 HTTP 처리를 같은 프로세스에서 검증하며 실제 포트를 열지 않습니다.

## 코드 읽기

```java
package course.l14;

import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;
import org.springframework.context.event.EventListener;

public class Main {
  record StudentCreated(String name) {}

  static class Listener {
    @EventListener
    public void on(StudentCreated event) {
      System.out.println("created " + event.name());
    }
  }

  @Configuration
  static class Config {
    @Bean
    Listener listener() {
      return new Listener();
    }
  }

  public static void main(String[] args) throws Exception {
    try (var context = new AnnotationConfigApplicationContext(Config.class)) {
      context.publishEvent(new StudentCreated("Mina"));
    }
  }
}
```

[실행 파일](Main.java)

## 요청·예상 결과

created Mina

## 주의사항

프로세스 내부 이벤트는 내구성 있는 메시지 큐가 아닙니다. 재시작·실패·트랜잭션 경계 정책을 따로 설계하세요.

## 연습

리스너 두 개를 등록하고 실행 순서를 검토하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
