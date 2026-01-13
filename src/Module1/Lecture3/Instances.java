package Module1.Lecture3;

import java.util.ArrayList;

public class Instances {
    public static void main(String[] args) {
        // Java treats String instances differently from other objects
        // Identical strings literals refer to the same instance
        String a = "Mochi";
        String b = "Mochi"; // Same String instance in memory

        System.out.println(a == b); // Checks memory address; true
        System.out.println(a.equals(b)); // Checks data; true

        // Forcing a string to be instantiated
        String c = new String("Mochi");

        System.out.println(a == c); // false
        System.out.println(a.equals(c)); // true

        // Aliasing
        ArrayList<Integer> ls = new ArrayList<>();
        ArrayList<Integer> alias = ls;

        ls.add(100);

        System.out.println(ls);
        System.out.println(alias);

        System.out.println(ls == alias); // true
        System.out.println(ls.equals(alias)); // true
    }
}
