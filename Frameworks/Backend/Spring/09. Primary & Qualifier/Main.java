package course.l09;

import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;

public class Main {
  record Greeter(String name) {}

  @Configuration
  static class Config {
    @Bean
    @Primary
    String mainName() {
      return "Mina";
    }

    @Bean
    String otherName() {
      return "Jin";
    }

    @Bean
    Greeter greeter(@Qualifier("otherName") String name) {
      return new Greeter(name);
    }
  }

  public static void main(String[] args) throws Exception {
    try (var context = new AnnotationConfigApplicationContext(Config.class)) {
      System.out.println(context.getBean(String.class));
      System.out.println(context.getBean(Greeter.class).name());
    }
  }
}
