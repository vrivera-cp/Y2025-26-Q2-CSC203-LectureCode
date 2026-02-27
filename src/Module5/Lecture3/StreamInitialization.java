package Module5.Lecture3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamInitialization {
    public static void main(String[] args) {
        // Stream.of()
        Stream<Integer> s1 = Stream.of(1, 2, 3);

        // List.stream()
        List<Double> ls = new ArrayList<>();
        ls.add(1.0);
        ls.add(2.0);
        ls.add(3.0);

        Stream<Double> s2 = ls.stream();

        // Stream Builder
        Stream.Builder<Character> builder = Stream.builder();
        builder.add('1');
        builder.add('2');
        builder.add('3');

        Stream<Character> s3 = builder.build();
    }
}
