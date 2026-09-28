package course.lessons;

import java.util.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lessons/02")
public class Lesson02 {

  @GetMapping
  public Map<String, String> show(
      @RequestParam(name = "name", defaultValue = "guest") String name) {
    return Map.of("name", name);
  }
}
