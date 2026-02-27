package Module5.Lecture3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(400);
        list.add(5);

        int output = list.stream()
                .filter(x -> x < 100)
                .reduce(0, (a, b) -> a + b);

        System.out.println(list);
        System.out.println(output);
    }
}
