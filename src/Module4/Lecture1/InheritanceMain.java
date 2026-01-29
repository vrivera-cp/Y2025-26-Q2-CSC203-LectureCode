package Module4.Lecture1;

public class InheritanceMain {
    public static void main(String[] args) {
        // Child instance and up casts
        Child child = new Child();
        Parent parent = child;
        Object object = child;

        // Field/variable inheritance
        SecretHero secretHero = new SecretHero("Superman", "Flight", "Clark");

        System.out.println(secretHero.power); // Inherited from SuperHero
        System.out.println(secretHero.name); // Defined in SecretHero

        // Field hiding
        System.out.println(secretHero.name); // Can't access SuperHero.name with SecretHero static type; accesses SecretHero.name
        System.out.println(((SuperHero) secretHero).name); // Variable access prefers static type's version
    }
}
