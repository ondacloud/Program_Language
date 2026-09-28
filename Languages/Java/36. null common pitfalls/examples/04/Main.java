import java.math.BigDecimal;
public class Main {
    public static void main(String[] args) throws Exception {
        BigDecimal a = new BigDecimal("0.1");
        BigDecimal b = new BigDecimal("0.2");
        System.out.println(a.add(b)); // 0.3
    }
}
