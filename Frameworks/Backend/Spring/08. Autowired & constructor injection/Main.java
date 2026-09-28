package course.l08;

import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;

public class Main {
  static class Greeter {
    private final String name;

    @Autowired
    Greeter(String name) {
      this.name = name;
    }

    String message() {
      return "Hi, " + name;
    }
  }

  @Configuration
  @Import(Greeter.class)
  static class Config {
    @Bean
    String name() {
      return "Mina";
    }
  }

  public static void main(String[] args) throws Exception {
    try (var context = new AnnotationConfigApplicationContext(Config.class)) {
      System.out.println(context.getBean(Greeter.class).message());
    }
  }
}
