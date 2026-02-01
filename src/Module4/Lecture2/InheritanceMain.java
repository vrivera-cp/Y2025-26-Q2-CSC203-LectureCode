package Module4.Lecture2;

public class InheritanceMain {
    public static void main(String[] args) {
        SecretHero secretHero = new SecretHero(
                "Superman",
                "flight",
                "Clark"
        );
        SuperHero superHero = secretHero;

        // Getters
        IO.println(secretHero.getName()); // Dynamic type's preferred -> SecretHero.getName()
        IO.println(superHero.getName()); // Dynamic type's preferred -> SecretHero.getName()

        IO.println(secretHero.getPower()); // Dynamic type's preferred; doesn't exist, so finds closest inherited version -> SuperHero.getPower()
        IO.println(superHero.getPower()); // Dynamic type's preferred; doesn't exist, so finds closest inherited version -> SuperHero.getPower()

        // Overrides
        secretHero.doAction(); // Dynamic type's preferred -> SecretHero.doAction()
        superHero.doAction(); // Dynamic type's preferred -> SecretHero.doAction()

        // Method containing super
        secretHero.doSuperAction(); // Dynamic type's preferred -> SecretHero.doSuperAction()
        // superHero.doSuperAction(); // Doesn't compile, method does not exist in static type
    }
}
