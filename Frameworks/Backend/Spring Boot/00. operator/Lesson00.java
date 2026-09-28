package course.lessons;

import java.util.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lessons/00")
public class Lesson00 {

  @GetMapping
  public Map<String, Object> show() {
    return Map.of("sum", 7 + 2, "division", 7.0 / 2, "passed", 80 >= 70);
  }
}
