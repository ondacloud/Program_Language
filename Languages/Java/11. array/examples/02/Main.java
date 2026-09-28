public class Main {
    public static void main(String[] args) throws Exception {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6}
        };

        for (int[] row : matrix) {
            for (int value : row) {
                System.out.println(value);
            }
        }
    }
}
