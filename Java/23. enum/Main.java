enum OrderStatus {
    CREATED,
    PAID,
    SHIPPED,
    CANCELLED
}

public class Main {
    public static void main(String[] args) {
        OrderStatus status = OrderStatus.PAID;

        switch (status) {
            case PAID -> System.out.println("Payment completed");
            case SHIPPED -> System.out.println("Shipping");
            default -> System.out.println(status);
        }
    }
}
