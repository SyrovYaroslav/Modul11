import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Tack3 {
    public static void main(String[] args) {
        String[] innerArr = {"1, 2, 0", "4, 5"};


        String result = Arrays.stream(innerArr)
                .map(s -> s.split(", "))
                .flatMap(Stream::of)
                .sorted()
                .collect(Collectors.joining(", ","\"","\""));

        System.out.println(result);
    }
}
