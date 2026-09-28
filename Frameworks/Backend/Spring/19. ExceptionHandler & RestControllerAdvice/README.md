# ExceptionHandler & RestControllerAdvice

## 개념과 사용 시점

컨트롤러의 오류를 공통 응답으로 변환합니다. 업무 예외와 HTTP 표현을 분리할 때 사용합니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Spring 과정 루트**입니다.

```powershell
python run.py "19. ExceptionHandler & RestControllerAdvice/Main.java"
```

콘솔 예제는 결과를 출력하고 종료합니다. MVC 장은 MockMvc로 HTTP 처리를 같은 프로세스에서 검증하며 실제 포트를 열지 않습니다.

## 코드 읽기

```java
package course.l19;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.bind.annotation.*;

public class Main {
  @RestController
  public static class Controller {
    @GetMapping("/")
    public String fail() {
      throw new IllegalArgumentException("internal detail");
    }
  }

  @RestControllerAdvice
  public static class Errors {
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> invalid() {
      return ResponseEntity.badRequest().body("invalid input");
    }
  }

  public static void main(String[] args) throws Exception {
    var mvc =
        MockMvcBuilders.standaloneSetup(new Controller()).setControllerAdvice(new Errors()).build();
    var response = mvc.perform(get("/")).andReturn().getResponse();
    System.out.println(response.getStatus());
    System.out.println(response.getContentAsString());
  }
}
```

[실행 파일](Main.java)

## 요청·예상 결과

400, invalid input

## 주의사항

모든 예외를 동일한 400으로 덮으면 서버 결함을 숨길 수 있습니다. 필요한 타입만 처리하세요.

## 연습

예외별 상태 코드와 공개 메시지를 설계하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
