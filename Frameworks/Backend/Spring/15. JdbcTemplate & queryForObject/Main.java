package course.l15;

import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;

public class Main {

  public static void main(String[] args) throws Exception {
    var ds =
        new org.springframework.jdbc.datasource.DriverManagerDataSource(
            "jdbc:h2:mem:course;DB_CLOSE_DELAY=-1", "sa", "");
    var jdbc = new org.springframework.jdbc.core.JdbcTemplate(ds);
    jdbc.execute("CREATE TABLE students (id INT PRIMARY KEY, name VARCHAR(30))");
    jdbc.update("INSERT INTO students VALUES (?, ?)", 1, "Mina");
    System.out.println(
        jdbc.queryForObject("SELECT name FROM students WHERE id = ?", String.class, 1));
  }
}
