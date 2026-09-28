package course.l07;

import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;

public class Main {
  @Component
  public static class Greeter {
    public String message() {
      return "hello component";
    }
  }

  @Configuration
  @ComponentScan(basePackageClasses = Main.class)
  static class Config {}

  public static void main(String[] args) throws Exception {
    try (var context = new AnnotationConfigApplicationContext(Config.class)) {
      System.out.println(context.getBean(Greeter.class).message());
    }
  }
}
