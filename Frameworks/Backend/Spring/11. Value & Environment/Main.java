package course.l11;

import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;

public class Main {
  record Greeter(String name) {}

  @Configuration
  static class Config {
    @Bean
    Greeter greeter(@Value("${course.name:guest}") String name) {
      return new Greeter(name);
    }
  }

  public static void main(String[] args) throws Exception {
    try (var context = new AnnotationConfigApplicationContext(Config.class)) {
      System.out.println(context.getBean(Greeter.class).name());
    }
  }
}
