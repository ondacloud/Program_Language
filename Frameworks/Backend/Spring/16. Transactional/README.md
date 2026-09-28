# Transactional

## 개념과 사용 시점

Transactional은 프록시를 통한 메서드 호출에 트랜잭션 경계를 적용합니다. 실패 시 어떤 예외를 롤백할지 이해해야 합니다.

## 준비와 실행

[과정 README](../README.md)의 설치를 먼저 완료합니다. 작업 폴더는 **Spring 과정 루트**입니다.

```powershell
python run.py "16. Transactional/Main.java"
```

콘솔 예제는 결과를 출력하고 종료합니다. MVC 장은 MockMvc로 HTTP 처리를 같은 프로세스에서 검증하며 실제 포트를 열지 않습니다.

## 코드 읽기

```java
package course.l16;

import java.util.*;
import javax.sql.DataSource;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.*;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.*;

public class Main {
  public static class StudentService {
    private final JdbcTemplate jdbc;

    StudentService(JdbcTemplate jdbc) {
      this.jdbc = jdbc;
    }

    @Transactional
    public void create() {
      jdbc.update("INSERT INTO students VALUES (?)", 1);
      throw new IllegalStateException("demo failure");
    }
  }

  @Configuration
  @EnableTransactionManagement
  static class Config {
    @Bean
    DataSource dataSource() {
      return new DriverManagerDataSource("jdbc:h2:mem:tx;DB_CLOSE_DELAY=-1", "sa", "");
    }

    @Bean
    JdbcTemplate jdbc(DataSource ds) {
      return new JdbcTemplate(ds);
    }

    @Bean
    PlatformTransactionManager transactionManager(DataSource ds) {
      return new DataSourceTransactionManager(ds);
    }

    @Bean
    StudentService service(JdbcTemplate jdbc) {
      return new StudentService(jdbc);
    }
  }

  public static void main(String[] args) throws Exception {
    try (var context = new AnnotationConfigApplicationContext(Config.class)) {
      var jdbc = context.getBean(JdbcTemplate.class);
      jdbc.execute("CREATE TABLE students (id INT PRIMARY KEY)");
      try {
        context.getBean(StudentService.class).create();
      } catch (IllegalStateException expected) {
        System.out.println("rolled back");
      }
      System.out.println(jdbc.queryForObject("SELECT COUNT(*) FROM students", Integer.class));
    }
  }
}
```

[실행 파일](Main.java)

## 요청·예상 결과

rolled back, 0

## 주의사항

기본적으로 RuntimeException·Error에서 롤백합니다. 같은 객체 내부의 자기 호출은 기본 프록시 경계를 통과하지 않습니다.

## 연습

예외 없이 저장했을 때 행 수 1을 확인하세요.

[과정 목차](../README.md) · [Backend 목차](../../README.md)
