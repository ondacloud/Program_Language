package course.lessons;

import java.util.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lessons/07")
public class Lesson07 {

  @GetMapping("/{id}")
  public Map<String, Integer> show(@PathVariable("id") int id) {
    return Map.of("id", id);
  }
}
