# if & switch

## 개념과 사용 시점

조건 분기와 switch 식은 업무 규칙을 표현합니다. 웹 계층과 분리하면 테스트하기 쉽습니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Spring 과정 루트**입니다.

```powershell
python run.py "03. if & switch/Main.java"
```

콘솔 예제는 결과를 출력하고 종료합니다. MVC 장은 MockMvc로 HTTP 처리를 같은 프로세스에서 검증하며 실제 포트를 열지 않습니다.

## 코드 읽기

```java
package course.l03;

import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;

public class Main {

  public static void main(String[] args) throws Exception {
    int score = 80;
    String grade = score >= 70 ? "pass" : "retry";
    System.out.println(
        switch (grade) {
          case "pass" -> "accepted";
          default -> "again";
        });
  }
}
```

[실행 파일](Main.java)

## 요청·예상 결과

accepted

## 주의사항

등급 정책을 컨트롤러 여러 곳에 복사하지 말고 서비스에 모으세요.

## 연습

90점 이상 등급을 추가하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
