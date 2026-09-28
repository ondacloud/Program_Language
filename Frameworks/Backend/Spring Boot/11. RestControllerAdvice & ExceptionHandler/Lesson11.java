package course.lessons;

import java.util.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lessons/11")
public class Lesson11 {

  @GetMapping
  public String fail() {
    throw new MissingStudent();
  }

  static class MissingStudent extends RuntimeException {}

  @RestControllerAdvice(assignableTypes = Lesson11.class)
  public static class Errors {
    @ExceptionHandler(MissingStudent.class)
    public ResponseEntity<Map<String, String>> missing() {
      return ResponseEntity.status(404).body(Map.of("error", "student_not_found"));
    }
  }
}
