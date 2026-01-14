package Module2.Lecture1;

public class Cat {
    // Instance Variables
    public String name = "STRAY"; // forced default value; otherwise null
    public int age; // zero default value

    // Static, shared, variable
    public static int population = 0;

    // Constructor
    public Cat(String name, int age) {
        //
        this.name = name;
        this.age = age;
    }

    // Constructor Overload
    public Cat(int age) {
        this.age = age;
    }

    // Explicit default constructor
    public Cat() {}
}
