# operator

## 개념과 사용 시점

Spring 내부 업무 로직은 Java 문법입니다. 먼저 기본 연산을 확인한 뒤 컨테이너와 HTTP 계층으로 연결합니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Spring 과정 루트**입니다.

```powershell
python run.py "00. operator/Main.java"
```

콘솔 예제는 결과를 출력하고 종료합니다. MVC 장은 MockMvc로 HTTP 처리를 같은 프로세스에서 검증하며 실제 포트를 열지 않습니다.

## 코드 읽기

```java
package course.l00;

import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;

public class Main {

  public static void main(String[] args) throws Exception {
    System.out.println(7 / 2);
    System.out.println(7.0 / 2);
    System.out.println(80 >= 70);
  }
}
```

[실행 파일](Main.java)

## 요청·예상 결과

3, 3.5, true

## 주의사항

정수 나눗셈과 실수 나눗셈을 구분하세요. 프레임워크가 언어의 계산 규칙을 바꾸지 않습니다.

## 연습

나머지 연산 결과를 출력하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
