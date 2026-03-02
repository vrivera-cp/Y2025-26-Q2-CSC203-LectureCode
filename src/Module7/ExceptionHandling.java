package Module7;

import java.security.spec.InvalidKeySpecException;
import java.util.List;
import java.util.stream.Stream;

public class ExceptionHandling {
    public static void main(String[] args) {
        // Try tracing with the following values:
        // - "mochi"
        // - "harvest"
        // - "pearl"
        // - "skip"
        outer(null);
    }

    public static void outer(String value) {
        IO.println("Start of inner");
        try {
            // "safeguard" block for NullPointerExceptions
            if (!value.equals("skip")) {
                IO.println(inner(value));
            }
        } catch (NullPointerException e) {
            // Executes if a NullPointerException is thrown in "try"
            IO.println("NullPointer");
        } finally {
            // Finally always occurs, even when returned or an exception is uncaught
            IO.println("finally");
        }
        IO.println("End of outer");
    }

    public static int inner(String value) {
        IO.println("\tStart of inner");
        int number = 0;
        try {
            switch (value) {
                case "mochi":
                    throw new IllegalStateException();
                    // number = 100 / 0;
                case "harvest":
                    List<Integer> numbers = List.of(1, 2, 3);
                    number = numbers.get(100) / 0; // ArrayIndexOutOfBounds Exception Thrown
                    break;
                case "pearl":
                    return 100;
            }
        } catch (NullPointerException | ArithmeticException e) {
            IO.println("\tNullPointer or ArithmeticException");
        } finally {
            IO.println("\tfinally");
        }
        IO.println("\tEnd of inner");
        return number;
    }
}
