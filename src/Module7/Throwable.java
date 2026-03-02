package Module7;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Throwable {
    public static void main(String[] args) {
        IO.println("Main");
        methodA();
    }

    public static void methodA() {
        IO.println("A");
        methodB();
    }

    public static void methodB() {
        IO.println("B");
        int x = 100 / 0; // Produces a stack trace
        methodC();
    }

    public static void methodC() {
        IO.println("C");
    }
}
