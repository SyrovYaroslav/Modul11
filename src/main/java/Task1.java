import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task1 {
    public String oddIndexName (List<String> names) {

        List<String> numericList = names.stream()
                .map(name -> names.indexOf(name) + 1 + ". " + name)
                .collect(Collectors.toList());

        List<String> oddList = IntStream
                .range(0, numericList.size())
                .filter(i -> (i + 1) % 2 == 1)
                .mapToObj(i -> numericList.get(i))
                .collect(Collectors.toList());


        String result = oddList.stream()
                .collect(Collectors.joining(", "));

        return result;
    }
}
