# PathVariable

## 개념과 사용 시점

경로 변수는 리소스 식별자를 표현합니다. URL 문자열을 원하는 타입으로 바인딩합니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Spring Boot 과정 루트**입니다.

```powershell
mvn spring-boot:run
```

서버 실행 후 다른 터미널에서 확인합니다. 요청 본문이 필요한 장은 아래 예제를 따르세요.

```powershell
curl.exe -i "http://127.0.0.1:8080/lessons/07/3"
```

## 코드 읽기

```java
package course.lessons;

import java.util.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lessons/07")
public class Lesson07 {

  @GetMapping("/{id}")
  public Map<String, Integer> show(@PathVariable("id") int id) {
    return Map.of("id", id);
  }
}
```

[실행 파일](Lesson07.java)

## 요청·예상 결과

/lessons/07/3은 id=3, abc는 타입 변환 오류 400

## 주의사항

숫자로 변환된 ID라도 존재하지 않는 리소스일 수 있습니다.

## 연습

양수가 아닌 ID를 거절하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
