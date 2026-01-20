package Module2.Lecture2;

public class Cat {
    // Instance Variables
    private String name = "STRAY"; // forced default value; otherwise null
    private int age; // zero default value

    // Static, shared, variable
    public static int population = 0;

    // Constructor
    public Cat(String name, int age) {
        // In a constructor, "this" refers to the instance being created
        this.name = name;
        this.age = age;
    }

    // Constructor Overload
    public Cat(int age) {
        this.age = age;
    }

    // Explicit default constructor
    public Cat() {}

    // Getter
    public String getName() {
        return this.name;
    }

    // Setter
    public void setName(String name) {
        this.name = name;
    }

    // Getter
    public int getAge() {
        return this.age;
    }

    // Instance Method
    public void haveBirthday() {
        this.age++;
    }

    // Instance method version of a static method
    public void pet(int times) {
        System.out.printf("You pet %s %d times", this.name, times);
    }

    // Static method version of an instance method
    public static void pet(Cat cat, int times) {
        System.out.printf("You pet %s %d times", cat.name, times);
    }
}
