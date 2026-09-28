public class Main {
    public static void main(String[] args) {
        int[] first = {1, 2};
        int[] alias = first;
        alias[0] = 9;
        System.out.println(first[0]);
        alias = null;
        System.out.println(first.length);
    }
}
