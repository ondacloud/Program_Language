package course.lessons;

import java.util.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lessons/18")
public class Lesson18 {

  @Bean
  CommandLineRunner courseRunner() {
    return args -> System.out.println("course runner ready");
  }

  @GetMapping
  public Map<String, String> show() {
    return Map.of("startup", "see server log");
  }
}
