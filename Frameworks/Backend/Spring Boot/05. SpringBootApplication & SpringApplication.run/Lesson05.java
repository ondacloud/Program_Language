package course.lessons;

import java.util.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lessons/05")
public class Lesson05 {

  @GetMapping
  public Map<String, String> show() {
    return Map.of("framework", "Spring Boot", "entry", "course.Application");
  }
}
