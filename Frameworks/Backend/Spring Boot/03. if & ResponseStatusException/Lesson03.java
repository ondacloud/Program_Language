package course.lessons;

import java.util.*;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

@RestController
@RequestMapping("/lessons/03")
public class Lesson03 {

  @GetMapping
  public Map<String, String> show(@RequestParam(name = "score", defaultValue = "80") int score) {
    if (score < 0 || score > 100)
      throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "score must be 0..100");
    return Map.of("result", score >= 70 ? "pass" : "retry");
  }
}
