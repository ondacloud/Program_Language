package course.lessons;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lessons/08")
public class Lesson08 {

  public record Student(@NotBlank @Size(max = 30) String name, @Min(0) @Max(100) int score) {}

  @PostMapping
  public ResponseEntity<Student> create(@Valid @RequestBody Student student) {
    return ResponseEntity.status(201).body(student);
  }
}
