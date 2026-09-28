package course.lessons;

import java.util.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lessons/16")
public class Lesson16 {

  @GetMapping
  public Map<String, String> show() {
    return Map.of("health", "/actuator/health");
  }
}
