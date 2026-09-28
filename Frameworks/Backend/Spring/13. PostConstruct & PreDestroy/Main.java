package course.l13;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;

public class Main {
  static class Resource {
    @PostConstruct
    public void start() {
      System.out.println("start");
    }

    @PreDestroy
    public void stop() {
      System.out.println("stop");
    }
  }

  @Configuration
  static class Config {
    @Bean
    Resource resource() {
      return new Resource();
    }
  }

  public static void main(String[] args) throws Exception {
    try (var context = new AnnotationConfigApplicationContext(Config.class)) {
      System.out.println("using");
    }
  }
}
