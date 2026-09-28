# Scanner & nextLine

## 개념과 사용 시점

콘솔 입력을 Scanner로 읽습니다. 이 장은 Java 기초 확인용이며 웹 요청 입력은 뒤의 RequestParam에서 다룹니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Spring 과정 루트**입니다.

```powershell
python run.py "02. Scanner & nextLine/Main.java"
```

콘솔 예제는 결과를 출력하고 종료합니다. MVC 장은 MockMvc로 HTTP 처리를 같은 프로세스에서 검증하며 실제 포트를 열지 않습니다.

## 코드 읽기

```java
package course.l02;

import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in);
    String name = input.hasNextLine() ? input.nextLine().trim() : "";
    System.out.println("Hello, " + (name.isEmpty() ? "guest" : name));
  }
}
```

[실행 파일](Main.java)

## 요청·예상 결과

Mina 입력 시 Hello, Mina

## 주의사항

서버 요청마다 System.in으로 사용자 입력을 기다리면 안 됩니다. HTTP 요청 데이터를 바인딩하세요.

## 연습

숫자 입력의 변환 실패를 처리하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
