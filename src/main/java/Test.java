
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        List<String> result = Task5.zip(Stream.of("a", "b", "c", "d"),Stream.of("1", "2", "3"))
                .collect(Collectors.toList());
        System.out.println(result);

    }
}
