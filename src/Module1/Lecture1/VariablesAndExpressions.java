package Module1.Lecture1;

public class VariablesAndExpressions {
    public static void main(String[] args) {
        // Variables are statically-typed
        int first = 1;
        double second = 2.0;

        // Boolean literal values are lowercase
        boolean truth = false;

        // Characters utilize single quotation marks
        char letter = 'A';

        // Strings utilize double quotation marks
        String another_letter = "B";

        // Valid numerical types are automatically promoted
        double third = 1; // int -> double

        // Type casts where you lose information must be explicit
        int fourth = (int) 3.56; // double -> int, assigned 3

        // Integers perform integer division
        System.out.print(1 / 2); // 0

        // Values are promoted when multiple types appear in an expression
        System.out.print(1.0 / 2); // 0.5

        // Short-circuit evaluation; this doesn't error
        if (1 == 1 || 1 / 0 > 0) {
            System.out.println("Hi");
        }
    }
}
