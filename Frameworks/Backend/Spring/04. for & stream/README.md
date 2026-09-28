# for & stream

## 개념과 사용 시점

반복문과 stream으로 컬렉션을 선택·변환합니다. 결과를 서비스 반환값으로 사용할 수 있습니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Spring 과정 루트**입니다.

```powershell
python run.py "04. for & stream/Main.java"
```

콘솔 예제는 결과를 출력하고 종료합니다. MVC 장은 MockMvc로 HTTP 처리를 같은 프로세스에서 검증하며 실제 포트를 열지 않습니다.

## 코드 읽기

```java
package course.l04;

import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;

public class Main {

  public static void main(String[] args) throws Exception {
    var scores = List.of(60, 80, 90);
    System.out.println(scores.stream().filter(score -> score >= 70).toList());
  }
}
```

[실행 파일](Main.java)

## 요청·예상 결과

[80, 90]

## 주의사항

대량 DB 데이터를 모두 메모리로 읽기 전에 DB 필터·페이징을 검토하세요.

## 연습

합계와 평균을 계산하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
