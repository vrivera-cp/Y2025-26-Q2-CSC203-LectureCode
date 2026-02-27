package Module5.Lecture3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ComparatorMain {
    public static void main(String[] args) {
        // Generate a list of 8 random integers
        Random random = new Random();
        List<Integer> numbers = new ArrayList<>(random.ints(8, 0, 100).boxed().toList());

        // Before sorting
        System.out.println(numbers);

        // Sort by ascending value
        numbers.sort(
                (a, b) -> {
                    if (a < b) return -543; // Any negative integer
                    if (a > b) return 123; // Any positive integer
                    return 0;
                }
        );

        // After sorting
        System.out.println(numbers);

        // Create list of points from the random numbers
        List<Point> points = new ArrayList<>(
                numbers.stream()
                .map(x -> new Point(x, 0))
                .toList()
        );

        // Before sorting
        System.out.println(points);

        // Sort by descending x value
        points.sort(
                (a, b) -> b.x - a.x
        );

        // After sorting
        System.out.println(points);
    }
}
