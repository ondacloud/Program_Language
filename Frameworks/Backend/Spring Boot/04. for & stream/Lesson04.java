package course.lessons;

import java.util.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lessons/04")
public class Lesson04 {

  @GetMapping
  public Map<String, List<Integer>> show() {
    return Map.of("passed", List.of(60, 80, 90).stream().filter(s -> s >= 70).toList());
  }
}
