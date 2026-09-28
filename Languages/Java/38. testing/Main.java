public class Main {
    static double average(int[] values) {
        if (values.length == 0) {
            throw new IllegalArgumentException("empty values");
        }
        long total = 0;
        for (int value : values) total += value;
        return (double) total / values.length;
    }
    static void check(boolean condition, String name) {
        if (!condition) throw new AssertionError(name);
    }
    public static void main(String[] args) {
        check(average(new int[]{2, 4}) == 3.0, "average");
        check(average(new int[]{5}) == 5.0, "single");
        try {
            average(new int[]{});
            throw new AssertionError("expected IllegalArgumentException");
        } catch (IllegalArgumentException expected) {
            System.out.println("all checks passed");
        }
    }
}
