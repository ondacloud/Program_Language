import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface Label {
    String value();
}

@Label("study")
class Example {}

public class Main {
    public static void main(String[] args) {
        Label label = Example.class.getAnnotation(Label.class);
        System.out.println(label.value());
    }
}
