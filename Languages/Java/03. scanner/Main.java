import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int age = sc.nextInt();
            sc.nextLine(); // 남아 있는 줄바꿈 소비
            String name = sc.nextLine();
            System.out.printf("%s: %d%n", name, age);
        }
    }
}
