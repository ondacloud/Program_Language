package course.l10;

import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;

public class Main {
  @Configuration
  static class Config {
    @Bean
    @Scope("prototype")
    Object item() {
      return new Object();
    }
  }

  public static void main(String[] args) throws Exception {
    try (var context = new AnnotationConfigApplicationContext(Config.class)) {
      System.out.println(context.getBean("item") == context.getBean("item"));
    }
  }
}
