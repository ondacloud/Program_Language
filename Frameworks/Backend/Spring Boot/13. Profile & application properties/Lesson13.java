package course.lessons;

import java.util.*;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.*;

@Profile("demo")
@RestController
@RequestMapping("/lessons/13")
public class Lesson13 {

  @GetMapping
  public Map<String, String> show() {
    return Map.of("profile", "demo");
  }
}
