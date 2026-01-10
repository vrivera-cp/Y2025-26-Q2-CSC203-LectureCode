package Module1.Lecture2;

public class Strings {
    public static void main(String[] args) {
        // String reference variable
        String name = "Mochi";

        // Strings are instances with methods
        System.out.println(name.toUpperCase());

        // Strings are immutable; name itself didn't change
        System.out.println(name);

        // String concatenation
        String message = "Hello, " + name;
        System.out.println(message);

        // Any type of value can be added to a string
        System.out.println(name + 100 + true + args + System.out);

        // Formatted printing
        System.out.printf("String: %s%nInteger: %d%nDouble: %.2f", name, 65535, 123.456);

        // Formatted string creation
        String s = String.format("String: %s%nInteger: %d%nDouble: %.2f", name, 65535, 123.456);
        System.out.printf(s);

        // String equality
        String a = "Mochi";
        String b = "Mochi";
        String c = new String("Mochi");

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        System.out.println(a == a);
        System.out.println(a == b);
        System.out.println(a == c);

        System.out.println(a.equals(a));
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
    }
}
