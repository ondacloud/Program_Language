public class Main {
    public static void main(String[] args) throws Exception {
        int menu = 2;

        switch (menu) {
            case 1:
                System.out.println("Create");
                break;
            case 2:
                System.out.println("Read");
                break;
            default:
                System.out.println("Unknown");
        }
    }
}
