package Module4.Lecture3;

public class EqualsMain {
    public static void main(String[] args) {
        SuperHero p = new SuperHero(
                "Superman",
                "flight"
        );
        SecretHero c1 = new SecretHero(
                "Superman",
                "flight",
                "Clark"
        );
        SecretHero c2 = new SecretHero(
                "Superman",
                "flight",
                "Clark"
        );
        SecretHero c3 = new SecretHero(
                "Batman",
                "money",
                "Bruce"
        );

        // Comparisons between the same type should always behave as expected
        IO.println(c1.equals(c2));
        IO.println(c1.equals(c3));

        // Varies based on implementation
        IO.println(c1.equals(p));
        IO.println(p.equals(c1));
    }
}
