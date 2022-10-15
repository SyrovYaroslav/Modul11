import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public List<String> oddIndexName (List<String> names) {
        List<String> result = names.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        return result;

    }
}
