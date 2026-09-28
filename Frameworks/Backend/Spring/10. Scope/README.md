# Scope

## 개념과 사용 시점

기본 singleton은 컨테이너 안에서 한 빈 인스턴스를 공유합니다. prototype은 요청할 때 새 인스턴스를 만듭니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Spring 과정 루트**입니다.

```powershell
python run.py "10. Scope/Main.java"
```

콘솔 예제는 결과를 출력하고 종료합니다. MVC 장은 MockMvc로 HTTP 처리를 같은 프로세스에서 검증하며 실제 포트를 열지 않습니다.

## 코드 읽기

```java
package course.l10;

import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;

public class Main {
  @Configuration
  static class Config {
    @Bean
    @Scope("prototype")
    Object item() {
      return new Object();
    }
  }

  public static void main(String[] args) throws Exception {
    try (var context = new AnnotationConfigApplicationContext(Config.class)) {
      System.out.println(context.getBean("item") == context.getBean("item"));
    }
  }
}
```

[실행 파일](Main.java)

## 요청·예상 결과

false

## 주의사항

singleton 서비스의 가변 필드는 여러 요청에 공유됩니다. prototype을 singleton에 한 번 주입하면 매 호출마다 새로 생기지 않습니다.

## 연습

Scope를 제거하고 결과를 비교하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
