package course.lessons;

import java.util.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lessons/06")
public class Lesson06 {

  @GetMapping
  public Map<String, String> show() {
    return Map.of("method", "GET");
  }

  @PostMapping
  public Map<String, String> create() {
    return Map.of("method", "POST");
  }
}
