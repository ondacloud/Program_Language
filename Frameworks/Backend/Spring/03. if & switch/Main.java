package course.l03;

import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;

public class Main {

  public static void main(String[] args) throws Exception {
    int score = 80;
    String grade = score >= 70 ? "pass" : "retry";
    System.out.println(
        switch (grade) {
          case "pass" -> "accepted";
          default -> "again";
        });
  }
}
