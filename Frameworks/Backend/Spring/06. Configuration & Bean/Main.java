package course.l06;

import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;

public class Main {
  record Greeter(String name) {
    String message() {
      return "Hi, " + name;
    }
  }

  @Configuration
  static class Config {
    @Bean
    String name() {
      return "Mina";
    }

    @Bean
    Greeter greeter(String name) {
      return new Greeter(name);
    }
  }

  public static void main(String[] args) throws Exception {
    try (var context = new AnnotationConfigApplicationContext(Config.class)) {
      System.out.println(context.getBean(Greeter.class).message());
    }
  }
}
