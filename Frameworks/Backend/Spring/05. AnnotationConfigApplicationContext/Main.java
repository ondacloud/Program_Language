package course.l05;

import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;

public class Main {
  @Configuration
  static class Config {
    @Bean
    String greeting() {
      return "hello bean";
    }
  }

  public static void main(String[] args) throws Exception {
    try (var context = new AnnotationConfigApplicationContext(Config.class)) {
      System.out.println(context.getBean(String.class));
    }
  }
}
