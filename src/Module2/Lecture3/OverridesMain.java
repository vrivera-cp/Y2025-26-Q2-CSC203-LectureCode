package Module2.Lecture3;

import java.util.ArrayList;
import java.util.List;

public class OverridesMain {
    public void main(String[] args) {
        // Instantiation
        Cat cat1 = new Cat("Mochi", 6);
        Cat cat2 = new Cat("Mochi", 6);
        Cat cat3 = new Cat(null, 6);
        Cat cat4 = new Cat(null, 6);

        // toString()
        System.out.println(cat1.toString()); // Explicit call
        System.out.println(cat1); // Automatic call
        System.out.println(cat1 + " " + cat2); // Automatic calls

        // Equals()
        System.out.println(cat1 == cat2); // Memory addresses
        System.out.println(cat1.equals(cat2)); // Override
        System.out.println(cat3.equals(cat4)); // null values are checked

        // hashCode()
        System.out.println(cat1);
        System.out.println(cat2); // Same as cat1
        System.out.println(cat3); // different from cat1
        System.out.println(cat4); // Same as cat3
    }
}
