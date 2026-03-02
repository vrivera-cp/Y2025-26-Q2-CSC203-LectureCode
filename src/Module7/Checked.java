package Module7;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Checked {
    public static void main() {
        // Java forces IOException causing code to exist within a try block
        // Try deleting try and catch then see what happens
        try {
            myMethod();
        } catch (IOException e) {
            // Code to execute when
            IO.println("CRISIS AVERTED!");
        }
    }

    // "throws" signifies that a method may cause an IOException when called
    public static void myMethod() throws FileNotFoundException {
        BufferedReader reader = new BufferedReader(new FileReader("my_file.txt"));
    }
}
