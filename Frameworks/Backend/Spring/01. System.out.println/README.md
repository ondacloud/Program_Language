# System.out.println

## 개념과 사용 시점

콘솔 출력은 진단·학습 결과 확인용입니다. 웹의 HTTP 응답과 다른 출력 경로입니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Spring 과정 루트**입니다.

```powershell
python run.py "01. System.out.println/Main.java"
```

콘솔 예제는 결과를 출력하고 종료합니다. MVC 장은 MockMvc로 HTTP 처리를 같은 프로세스에서 검증하며 실제 포트를 열지 않습니다.

## 코드 읽기

```java
package course.l01;

import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;

public class Main {

  public static void main(String[] args) throws Exception {
    System.out.println("Hello, Spring");
  }
}
```

[실행 파일](Main.java)

## 요청·예상 결과

Hello, Spring

## 주의사항

실제 서버 로그에는 로깅 도구를 사용하고 비밀값을 남기지 마세요.

## 연습

이름과 점수를 format해 출력하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
