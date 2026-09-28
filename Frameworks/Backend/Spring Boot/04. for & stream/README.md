# for & stream

## 개념과 사용 시점

컬렉션 처리에는 Java 반복·stream을 사용합니다. 컨트롤러는 입력·응답에 집중하고 복잡한 규칙은 서비스로 옮깁니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Spring Boot 과정 루트**입니다.

```powershell
mvn spring-boot:run
```

서버 실행 후 다른 터미널에서 확인합니다. 요청 본문이 필요한 장은 아래 예제를 따르세요.

```powershell
curl.exe -i "http://127.0.0.1:8080/lessons/04"
```

## 코드 읽기

```java
package course.lessons;

import java.util.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lessons/04")
public class Lesson04 {

  @GetMapping
  public Map<String, List<Integer>> show() {
    return Map.of("passed", List.of(60, 80, 90).stream().filter(s -> s >= 70).toList());
  }
}
```

[실행 파일](Lesson04.java)

## 요청·예상 결과

passed=[80,90]

## 주의사항

대량 목록은 DB에서 필터·정렬·페이징을 적용하세요.

## 연습

합격자 수와 총점을 계산하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
