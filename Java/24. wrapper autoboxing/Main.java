public class Main {
    public static void main(String[] args) throws Exception {
        int primitive = 10;
        Integer boxed = primitive; // autoboxing
        int value = boxed;         // unboxing

        int parsed = Integer.parseInt("123");
        String text = Integer.toString(123);
    }
}
