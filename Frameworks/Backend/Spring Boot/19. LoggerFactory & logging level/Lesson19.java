package course.lessons;

import java.util.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lessons/19")
public class Lesson19 {
  private static final Logger log = LoggerFactory.getLogger(Lesson19.class);

  @GetMapping
  public Map<String, String> show() {
    log.info("course request handled");
    return Map.of("message", "logged");
  }
}
