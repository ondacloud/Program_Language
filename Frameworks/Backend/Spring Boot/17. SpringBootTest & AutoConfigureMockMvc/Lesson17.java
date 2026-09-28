package course.lessons;

import java.util.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lessons/17")
public class Lesson17 {

  @GetMapping
  public Map<String, String> show() {
    return Map.of("message", "testable");
  }
}
