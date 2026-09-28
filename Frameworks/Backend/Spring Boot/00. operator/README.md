# operator

## 개념과 사용 시점

Spring Boot의 업무 로직도 Java 연산자를 사용합니다. 반환 Map은 HTTP JSON 응답으로 변환됩니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Spring Boot 과정 루트**입니다.

```powershell
mvn spring-boot:run
```

서버 실행 후 다른 터미널에서 확인합니다. 요청 본문이 필요한 장은 아래 예제를 따르세요.

```powershell
curl.exe -i "http://127.0.0.1:8080/lessons/00"
```

## 코드 읽기

```java
package course.lessons;

import java.util.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lessons/00")
public class Lesson00 {

  @GetMapping
  public Map<String, Object> show() {
    return Map.of("sum", 7 + 2, "division", 7.0 / 2, "passed", 80 >= 70);
  }
}
```

[실행 파일](Lesson00.java)

## 요청·예상 결과

sum=9, division=3.5, passed=true

## 주의사항

Boot는 실행·설정 구성을 도와주며 Java 계산 규칙을 바꾸지 않습니다.

## 연습

나머지 연산을 추가하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
