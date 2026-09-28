package course.l12;

import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;

public class Main {
  @Configuration
  static class Config {
    @Bean
    @Profile("demo")
    String label() {
      return "demo bean";
    }
  }

  public static void main(String[] args) throws Exception {
    try (var context = new AnnotationConfigApplicationContext()) {
      context.getEnvironment().setActiveProfiles("demo");
      context.register(Config.class);
      context.refresh();
      System.out.println(context.getBean(String.class));
    }
  }
}
