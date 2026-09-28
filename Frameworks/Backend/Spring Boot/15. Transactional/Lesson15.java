package course.lessons;

import java.util.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/lessons/15")
public class Lesson15 {
  private final Writer service;
  private final JdbcTemplate jdbc;

  public Lesson15(Writer service, JdbcTemplate jdbc) {
    this.service = service;
    this.jdbc = jdbc;
  }

  @PostMapping
  public Map<String, Integer> create() {
    try {
      service.create();
    } catch (IllegalStateException expected) {
      /* exercise: rollback */
    }
    return Map.of("rows", jdbc.queryForObject("SELECT COUNT(*) FROM tx_students", Integer.class));
  }

  @Service
  public static class Writer {
    private final JdbcTemplate jdbc;

    public Writer(JdbcTemplate jdbc) {
      this.jdbc = jdbc;
    }

    @Transactional
    public void create() {
      jdbc.update("INSERT INTO tx_students(name) VALUES (?)", "Mina");
      throw new IllegalStateException("rollback demo");
    }
  }
}
