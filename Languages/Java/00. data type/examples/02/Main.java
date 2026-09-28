public class Main {
    public static void main(String[] args) throws Exception {
        int a = 10;
        double b = a;       // widening: 자동 변환

        double c = 10.7;
        int d = (int) c;    // narrowing: 명시적 변환, d == 10
    }
}
