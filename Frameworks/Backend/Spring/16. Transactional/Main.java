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
