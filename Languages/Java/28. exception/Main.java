public class Main {
    public static void main(String[] args) throws Exception {
        try {
            int value = Integer.parseInt("abc");
            System.out.println(value);
        } catch (NumberFormatException e) {
            System.out.println("숫자 형식이 아닙니다.");
        } finally {
            System.out.println("정리 단계");
        }
    }
}
