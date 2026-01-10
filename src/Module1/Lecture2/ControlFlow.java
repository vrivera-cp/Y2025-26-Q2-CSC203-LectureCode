package Module1.Lecture2;

import java.util.ArrayList;
import java.util.List;

public class ControlFlow {
    public static void main(String[] args) {
        // Conditional
        int x = 33;
        if (x > 100) {
            System.out.println("if");
        } else if (x > 10) {
            System.out.println("else if");
        } else {
            System.out.println("else");
        }

        // Ternary operator
        String message = x > 33 ? "x is greater than 33" : "x is less than or equal to 33";
        System.out.println(message);

        // Switch statement
        int y = 2;
        switch(y) {
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("one");
                break;
            default:
                System.out.println("an integer");
        }

        // While loop
        int i = 0;
        while (i < 3) {
            System.out.print(i); // Note: NOT println
            i++; // Increment i
        }

        // Do while loop
        do {
            System.out.println(i);
        } while (i < 3);

        // Traditional for loop
        for (int j = 3; j >= 0; j--) {
            System.out.println(j);
        }

        // Array instantiation
        char[] word = {'m', 'o', 'c', 'h', 'i'};

        // Enhanced for loop
        for (char letter : word) {
            System.out.print(letter);
        }
        System.out.println();
    }
}
