import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
public class Main {
    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        try {
            Future<Integer> first = executor.submit(() -> 10 + 20);
            Future<Integer> second = executor.submit(() -> 2 * 3);
            System.out.println(first.get() + second.get());
        } finally {
            executor.shutdown();
        }
    }
}
