package course.lessons;

import java.util.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.web.bind.annotation.*;

@EnableConfigurationProperties(Lesson12.Settings.class)
@RestController
@RequestMapping("/lessons/12")
public class Lesson12 {
  private final Settings settings;

  public Lesson12(Settings settings) {
    this.settings = settings;
  }

  @GetMapping
  public Map<String, String> show() {
    return Map.of("label", settings.label());
  }

  @ConfigurationProperties(prefix = "course")
  public record Settings(String label) {}
}
