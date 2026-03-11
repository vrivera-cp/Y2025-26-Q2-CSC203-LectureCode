package ModuleF;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReference {
    public static void main(String[] args) {
        Fish fish = new Fish("Carassius Auratus", "Goldfish", 1);

        Function<Integer, Integer> instanceReference1 = fish::getUpdatedStatus;
        IO.println(instanceReference1.apply(100));

        BiFunction<Fish, Integer, Integer> classReference1 = Fish::getUpdatedStatus;
        IO.println(classReference1.apply(fish, 100));

        // Types: Nothing/No Arguments -> Integer
        Supplier<Integer> instanceReference2 = fish::getConservationStatus;
        IO.println(instanceReference2.get());

        Function<Fish, Integer> classReference2 = Fish::getConservationStatus;
        IO.println(classReference2.apply(fish));
    }
}
