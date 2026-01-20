package Module2.Lecture2;

public class CatMain {
    public static void main(String[] args) {
        // Instantiation
        Cat cat = new Cat("Mochi", -100);

        // Setter Usage
        cat.setName("Harvest");

        // Getter Usage
        System.out.println(cat.getName().equals("Harvest"));

        // Instance method usage
        cat.haveBirthday();
        System.out.println(cat.getAge());

        // Instance Method Call
        cat.pet(100);

        // Static Method Call
        Cat.pet(cat, 100);
    }
}
