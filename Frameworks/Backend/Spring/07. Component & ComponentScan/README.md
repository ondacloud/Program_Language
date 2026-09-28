# Component & ComponentScan

## 개념과 사용 시점

ComponentScan은 지정 패키지의 컴포넌트를 찾아 등록합니다. Service·Repository도 역할을 나타내는 컴포넌트 애너테이션입니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Spring 과정 루트**입니다.

```powershell
python run.py "07. Component & ComponentScan/Main.java"
```

콘솔 예제는 결과를 출력하고 종료합니다. MVC 장은 MockMvc로 HTTP 처리를 같은 프로세스에서 검증하며 실제 포트를 열지 않습니다.

## 코드 읽기

```java
package course.l07;

import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

public class Main {
  @Component
  public static class Greeter {
    public String message() {
      return "hello component";
    }
  }

  @Configuration
  @ComponentScan(basePackageClasses = Main.class)
  static class Config {}

  public static void main(String[] args) throws Exception {
    try (var context = new AnnotationConfigApplicationContext(Config.class)) {
      System.out.println(context.getBean(Greeter.class).message());
    }
  }
}
```

[실행 파일](Main.java)

## 요청·예상 결과

hello component

## 주의사항

스캔 범위를 너무 넓히면 의도하지 않은 빈이 등록될 수 있습니다. 이 장의 패키지 안만 스캔합니다.

## 연습

Service와 Component의 역할 표현 차이를 설명하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
