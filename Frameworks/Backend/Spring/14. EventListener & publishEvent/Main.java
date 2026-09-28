package course.l14;

import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;
import org.springframework.context.event.EventListener;

public class Main {
  record StudentCreated(String name) {}

  static class Listener {
    @EventListener
    public void on(StudentCreated event) {
      System.out.println("created " + event.name());
    }
  }

  @Configuration
  static class Config {
    @Bean
    Listener listener() {
      return new Listener();
    }
  }

  public static void main(String[] args) throws Exception {
    try (var context = new AnnotationConfigApplicationContext(Config.class)) {
      context.publishEvent(new StudentCreated("Mina"));
    }
  }
}
