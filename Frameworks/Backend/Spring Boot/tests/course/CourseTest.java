package course;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class CourseTest {
  @Autowired MockMvc mvc;

  @Test
  void allGetLessons() throws Exception {
    for (int i = 0; i < 20; i++) {
      if (i == 7 || i == 8 || i == 11 || i == 15) continue;
      mvc.perform(get(String.format("/lessons/%02d", i))).andExpect(status().isOk());
    }
  }

  @Test
  void queryAndPath() throws Exception {
    mvc.perform(get("/lessons/02").param("name", "Mina"))
        .andExpect(jsonPath("$.name").value("Mina"));
    mvc.perform(get("/lessons/07/3")).andExpect(jsonPath("$.id").value(3));
    mvc.perform(get("/lessons/07/abc")).andExpect(status().isBadRequest());
    mvc.perform(get("/lessons/03").param("score", "101")).andExpect(status().isBadRequest());
  }

  @Test
  void bodyValidation() throws Exception {
    mvc.perform(
            post("/lessons/08")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"name\":\"Mina\",\"score\":80}"))
        .andExpect(status().isCreated())
        .andExpect(jsonPath("$.name").value("Mina"));
    mvc.perform(
            post("/lessons/08")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"name\":\"\",\"score\":101}"))
        .andExpect(status().isBadRequest());
  }

  @Test
  void errorsAndDatabase() throws Exception {
    mvc.perform(get("/lessons/11"))
        .andExpect(status().isNotFound())
        .andExpect(jsonPath("$.error").value("student_not_found"));
    mvc.perform(get("/lessons/14")).andExpect(jsonPath("$.name").value("Mina"));
    mvc.perform(get("/lessons/14").param("id", "999")).andExpect(status().isNotFound());
    mvc.perform(post("/lessons/15")).andExpect(jsonPath("$.rows").value(0));
  }

  @Test
  void headersAndHealth() throws Exception {
    mvc.perform(get("/lessons/10")).andExpect(header().string("X-Course", "SpringBoot"));
    mvc.perform(get("/actuator/health"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.status").value("UP"));
  }
}
