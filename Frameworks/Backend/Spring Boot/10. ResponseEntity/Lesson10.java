package course.lessons;

import java.util.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lessons/10")
public class Lesson10 {

  @GetMapping
  public ResponseEntity<Map<String, String>> show() {
    return ResponseEntity.ok().header("X-Course", "SpringBoot").body(Map.of("message", "hello"));
  }
}
