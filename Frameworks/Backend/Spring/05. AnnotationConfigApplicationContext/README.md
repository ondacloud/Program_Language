# AnnotationConfigApplicationContext

## 개념과 사용 시점

ApplicationContext는 등록된 빈의 생성·의존성·수명을 관리하는 컨테이너입니다. 일반 객체 생성과 역할이 다릅니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Spring 과정 루트**입니다.

```powershell
python run.py "05. AnnotationConfigApplicationContext/Main.java"
```

콘솔 예제는 결과를 출력하고 종료합니다. MVC 장은 MockMvc로 HTTP 처리를 같은 프로세스에서 검증하며 실제 포트를 열지 않습니다.

## 코드 읽기

```java
package course.l05;

import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;

public class Main {
  @Configuration
  static class Config {
    @Bean
    String greeting() {
      return "hello bean";
    }
  }

  public static void main(String[] args) throws Exception {
    try (var context = new AnnotationConfigApplicationContext(Config.class)) {
      System.out.println(context.getBean(String.class));
    }
  }
}
```

[실행 파일](Main.java)

## 요청·예상 결과

hello bean

## 주의사항

컨텍스트를 닫아 종료 콜백과 자원을 정리합니다. 요청마다 전체 컨텍스트를 새로 만드는 구조는 피하세요.

## 연습

등록하지 않은 타입을 조회하면 어떤 오류가 나는지 확인하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
