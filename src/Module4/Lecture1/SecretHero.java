package Module4.Lecture1;

public class SecretHero extends SuperHero {
    public String name;

    public SecretHero(String superHeroName, String superHeroPower, String name) {
        super(superHeroName, superHeroPower); // Calls parent constructor
        this.name = name;
    }
}
