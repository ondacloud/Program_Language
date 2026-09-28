public class Main {
    public static void main(String[] args) throws Exception {
        String a = new String("Java");
        String b = new String("Java");
        System.out.println(a == b);      // false
        System.out.println(a.equals(b)); // true
    }
}
