package Module2.Lecture3;

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

    // Object.toString() override
    @Override
    public String toString() {
        return this.name + " " + this.age;
    }

    // Object.equals() override
    @Override
    public boolean equals(Object other) {
        if (other instanceof Cat cat) { // Type check AND down cast
            // Cat cat = (Cat) other; <- this is an explicit down cast
            return this.age == cat.age // Checking a primitive
                    && (this.name == null ? cat.name == null : this.name.equals(cat.name)); // Checking a non-primitive
        }
        return false;
    }

    // Object.hashCode() override
    @Override
    public int hashCode() {
        int hash = 0;

        // Incorporating an integer primitive
        hash = hash * 31 + age;

        // Incorporating a reference variable
        hash = hash * 31 + (name == null ? 0 : name.hashCode());

        // Note: for non-integer primitvies, use the following:
        // hash = hash * 31 + Double.hashCode(value);
        // Where "Double" is replaced with the appropriate wrapper type

        return hash;
    }
}
