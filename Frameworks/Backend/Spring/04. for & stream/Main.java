package course.l04;

import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;

public class Main {

  public static void main(String[] args) throws Exception {
    var scores = List.of(60, 80, 90);
    System.out.println(scores.stream().filter(score -> score >= 70).toList());
  }
}
