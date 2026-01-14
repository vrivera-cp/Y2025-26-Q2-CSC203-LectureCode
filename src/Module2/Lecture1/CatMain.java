package Module2.Lecture1;

public class CatMain {
    // Helper function
    public static void displayCat(Cat cat) {
        System.out.printf("%s %d%n", cat.name, cat.age);
    }

    public static void main(String[] args) {
        // Instantiation calls constructor
        Cat cat1 = new Cat("Mochi", 6);
        displayCat(cat1);

        // Instantiation calls other constructor
        Cat cat2 = new Cat(16);
        displayCat(cat2);

        // Assignment of instance variables
        cat2.name = "Harvest";
        displayCat(cat2);

        // Instantiation calls default constructor
        // IMPORTANT: also works if there are exactly NO constructors in the class
        Cat cat3 = new Cat();
        displayCat(cat3);

        // Static variables
        Cat.population = 0; // Preferred access
        cat1.population++;
        cat2.population++;
        cat3.population++;

        System.out.println(Cat.population); // Preferred access
        System.out.println(cat1.population);
        System.out.println(cat2.population);
        System.out.println(cat3.population);
    }
}
