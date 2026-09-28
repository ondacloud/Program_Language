# SpringBootApplication & SpringApplication.run

## 개념과 사용 시점

SpringBootApplication은 구성·자동 설정·컴포넌트 스캔을 묶는 시작점입니다. 실제 시작 코드는 app/course/Application.java에 있습니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Spring Boot 과정 루트**입니다.

```powershell
mvn spring-boot:run
```

서버 실행 후 다른 터미널에서 확인합니다. 요청 본문이 필요한 장은 아래 예제를 따르세요.

```powershell
curl.exe -i "http://127.0.0.1:8080/lessons/05"
```

## 코드 읽기

```java
package course.lessons;

import java.util.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lessons/05")
public class Lesson05 {

  @GetMapping
  public Map<String, String> show() {
    return Map.of("framework", "Spring Boot", "entry", "course.Application");
  }
}
```

[실행 파일](Lesson05.java)

## 요청·예상 결과

공통 내장 서버에서 framework와 entry를 반환합니다.

## 주의사항

시작 클래스는 스캔할 패키지의 상위에 두세요. 이 장의 컨트롤러가 앱을 다시 시작하지는 않습니다.

## 연습

Application의 main에서 실행 인자가 전달되는 흐름을 확인하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
