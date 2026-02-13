package Module5.Lecture1;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaFunctionMain {
    public static void main(String[] args) {
        // Function<A, B>
        // A is the input type
        // B is the output type
        Function<Integer, Double> f = x -> 2.0 * x;
        IO.println(f.apply(10));

        // Predicate<A>
        // A is the input type
        // boolean is the output type
        Predicate<Character> p = x -> x >= 'A' && x <= 'Z';
        IO.println(p.test('Q'));
        IO.println(p.test('q'));

        // Other built-in functional interfaces follow a similar structure
        // See media/Module5/lecture1/built_in_functional_interfaces.svg

        // Consumer<A>
        // A is the input type
        // Return "type" is void
        Consumer<String> c = x -> System.out.println(x);
        c.accept("hello");

        // Method Reference
        // Existing methods can be used in place of a lambda function
        c = System.out::println;
        c.accept("goodbye");
    }
}
