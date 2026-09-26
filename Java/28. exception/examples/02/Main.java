public class Main {
static void validateAge(int age) {
    if (age < 0) {
        throw new IllegalArgumentException("age must be >= 0");
    }
}
public static void main(String[] args) { try { validateAge(-1); } catch (IllegalArgumentException e) { System.out.println(e.getMessage()); } }
}
