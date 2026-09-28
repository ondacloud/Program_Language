package course.l02;

import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.context.annotation.*;

public class Main {

  public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in);
    String name = input.hasNextLine() ? input.nextLine().trim() : "";
    System.out.println("Hello, " + (name.isEmpty() ? "guest" : name));
  }
}
