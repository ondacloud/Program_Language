package course.l19;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.bind.annotation.*;

public class Main {
  @RestController
  public static class Controller {
    @GetMapping("/")
    public String fail() {
      throw new IllegalArgumentException("internal detail");
    }
  }

  @RestControllerAdvice
  public static class Errors {
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<String> invalid() {
      return ResponseEntity.badRequest().body("invalid input");
    }
  }

  public static void main(String[] args) throws Exception {
    var mvc =
        MockMvcBuilders.standaloneSetup(new Controller()).setControllerAdvice(new Errors()).build();
    var response = mvc.perform(get("/")).andReturn().getResponse();
    System.out.println(response.getStatus());
    System.out.println(response.getContentAsString());
  }
}
