package course.lessons;

import java.util.*;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lessons/09")
public class Lesson09 {
  private final Greeter service;

  public Lesson09(Greeter service) {
    this.service = service;
  }

  @GetMapping
  public Map<String, String> show() {
    return Map.of("message", service.greet());
  }

  @Service
  public static class Greeter {
    public String greet() {
      return "Hello, Mina";
    }
  }
}
