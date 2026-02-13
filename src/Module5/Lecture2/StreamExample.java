package Module5.Lecture2;

import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        // Data
        List<Integer> values = List.of(1, 2, 3, 40000, 5);

        double average = values.stream() // Stream Initialization
                .filter(x -> x < 1000) // Intermediate Operation
                .reduce(0, (a, b) -> a + b); // Terminal Operation

        average /= values.stream() // Stream Initialization
                .filter(x -> x < 1000) // Intermediate Operation
                .count(); // Terminal Operation

        IO.println(average);
    }
}
