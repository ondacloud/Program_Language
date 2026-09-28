import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("sample.txt");

        Files.writeString(path, "Hello Java\n");
        String content = Files.readString(path);
        System.out.println(content);
    }
}
