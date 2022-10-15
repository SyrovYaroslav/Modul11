import java.util.stream.Stream;

public class Task4 {
    public Stream<Long> linearCongruentGenerator(long a, int c, long m, long seed){
        Stream<Long> result = Stream
                .iterate(seed, x -> (a * x + c) % m)
                .limit(10);
        return result;
    }
}
