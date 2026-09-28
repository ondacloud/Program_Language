package course.lessons;

import java.util.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lessons/14")
public class Lesson14 {
  private final JdbcTemplate jdbc;

  public Lesson14(JdbcTemplate jdbc) {
    this.jdbc = jdbc;
  }

  @GetMapping
  public Map<String, String> show(@RequestParam(name = "id", defaultValue = "1") int id) {
    var names =
        jdbc.query("SELECT name FROM students WHERE id = ?", (rs, row) -> rs.getString("name"), id);
    if (names.isEmpty())
      throw new org.springframework.web.server.ResponseStatusException(
          org.springframework.http.HttpStatus.NOT_FOUND);
    return Map.of("name", names.get(0));
  }
}
