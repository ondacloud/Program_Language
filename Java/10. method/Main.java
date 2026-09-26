public class Main {
    public static int add(int a, int b) {
        return a + b;
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        int result = add(10, 20);
        printMessage("result=" + result);
    }
}
