public class Main {
    public static void main(String[] args) throws Exception {
        String grade = "A";
        int point = switch (grade) {
            case "A" -> 100;
            case "B" -> 80;
            case "C" -> 60;
            default -> 0;
        };
    }
}
