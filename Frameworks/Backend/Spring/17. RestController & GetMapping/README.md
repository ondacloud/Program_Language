# RestController & GetMapping

## 개념과 사용 시점

Spring MVC의 RestController는 반환값을 응답 본문으로 처리합니다. GetMapping은 GET 요청 경로를 연결합니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Spring 과정 루트**입니다.

```powershell
python run.py "17. RestController & GetMapping/Main.java"
```

콘솔 예제는 결과를 출력하고 종료합니다. MVC 장은 MockMvc로 HTTP 처리를 같은 프로세스에서 검증하며 실제 포트를 열지 않습니다.

## 코드 읽기

```java
package course.l17;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.bind.annotation.*;

public class Main {
  @RestController
  public static class Controller {
    @GetMapping("/")
    public String hello() {
      return "hello MVC";
    }
  }

  public static void main(String[] args) throws Exception {
    var mvc = MockMvcBuilders.standaloneSetup(new Controller()).build();
    var response = mvc.perform(get("/")).andReturn().getResponse();
    System.out.println(response.getStatus());
    System.out.println(response.getContentAsString());
  }
}
```

[실행 파일](Main.java)

## 요청·예상 결과

200, hello MVC

## 주의사항

이 예제는 MockMvc로 DispatcherServlet 흐름을 시뮬레이션합니다. 실제 HTTP 서버 실행은 Spring Boot 과정에서 다룹니다.

## 연습

반환값을 DTO로 변경하고 JSON을 확인하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
