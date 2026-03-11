package ModuleF;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;

public class Sorting {
    public static void display(List<?> list) {
        IntStream.range(0, list.size())
                .forEach(i -> System.out.printf("%3d: %s%n", i, list.get(i)));
    }

    public static void main(String[] args) {
        List<Fish> fishes = new ArrayList<>();
        fishes.add(new Fish("Carassius Auratus", "Goldfish", 1));
        fishes.add(new Fish("Pristis Pristis", "Sawfish", 6));
        fishes.add(new Fish("Latimeria Chalumnae", "Coelecanth", 6));

        fishes.sort(
                Comparator.comparingInt(Fish::getConservationStatus)
                        .reversed()
                        .thenComparing(Fish::getScientificName)
        );

        display(fishes);
    }
}

