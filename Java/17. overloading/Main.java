class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator(); System.out.println(c.add(1, 2)); System.out.println(c.add(1.0, 2.0)); System.out.println(c.add(1, 2, 3));
    }
}
