# JdbcTemplate & queryForObject

## 개념과 사용 시점

JdbcTemplate은 JDBC 자원 처리와 예외 변환을 돕습니다. 값은 placeholder로 바인딩합니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Spring 과정 루트**입니다.

```powershell
python run.py "15. JdbcTemplate & queryForObject/Main.java"
```

콘솔 예제는 결과를 출력하고 종료합니다. MVC 장은 MockMvc로 HTTP 처리를 같은 프로세스에서 검증하며 실제 포트를 열지 않습니다.

## 코드 읽기

```java
package course.l15;

import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;

public class Main {

  public static void main(String[] args) throws Exception {
    var ds =
        new org.springframework.jdbc.datasource.DriverManagerDataSource(
            "jdbc:h2:mem:course;DB_CLOSE_DELAY=-1", "sa", "");
    var jdbc = new org.springframework.jdbc.core.JdbcTemplate(ds);
    jdbc.execute("CREATE TABLE students (id INT PRIMARY KEY, name VARCHAR(30))");
    jdbc.update("INSERT INTO students VALUES (?, ?)", 1, "Mina");
    System.out.println(
        jdbc.queryForObject("SELECT name FROM students WHERE id = ?", String.class, 1));
  }
}
```

[실행 파일](Main.java)

## 요청·예상 결과

Mina

## 주의사항

실습은 프로세스 수명의 H2 메모리 DB입니다. 운영 연결 풀이나 영속 DB 설정과 다릅니다.

## 연습

작은따옴표가 포함된 이름을 저장하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
