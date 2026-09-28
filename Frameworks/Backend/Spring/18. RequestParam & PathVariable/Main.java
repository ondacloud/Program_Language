package course.l18;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.bind.annotation.*;

public class Main {
  @RestController
  public static class Controller {
    @GetMapping("/students/{id}")
    public String hello(
        @PathVariable("id") int id,
        @RequestParam(name = "name", defaultValue = "guest") String name) {
      return id + ":" + name;
    }
  }

  public static void main(String[] args) throws Exception {
    var mvc = MockMvcBuilders.standaloneSetup(new Controller()).build();
    System.out.println(
        mvc.perform(get("/students/3").param("name", "Mina"))
            .andReturn()
            .getResponse()
            .getContentAsString());
  }
}
