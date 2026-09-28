# ResponseEntity

## 개념과 사용 시점

ResponseEntity는 상태 코드·헤더·본문을 함께 제어합니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Spring Boot 과정 루트**입니다.

```powershell
mvn spring-boot:run
```

서버 실행 후 다른 터미널에서 확인합니다. 요청 본문이 필요한 장은 아래 예제를 따르세요.

```powershell
curl.exe -i "http://127.0.0.1:8080/lessons/10"
```

## 코드 읽기

```java
package course.lessons;

import java.util.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lessons/10")
public class Lesson10 {

  @GetMapping
  public ResponseEntity<Map<String, String>> show() {
    return ResponseEntity.ok().header("X-Course", "SpringBoot").body(Map.of("message", "hello"));
  }
}
```

[실행 파일](Lesson10.java)

## 요청·예상 결과

200, X-Course: SpringBoot, message=hello

## 주의사항

일반 정상 응답 모두에 ResponseEntity가 필요한 것은 아닙니다. 제어해야 할 응답 정보가 있을 때 사용하세요.

## 연습

생성 API에 Location 헤더를 추가하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
