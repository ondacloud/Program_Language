package course.lessons;

import java.util.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lessons/01")
public class Lesson01 {

  record Student(String name, int score) {}

  @GetMapping
  public Student show() {
    return new Student("Mina", 80);
  }
}
