package Module4.Lecture3;

public class SecretHero extends SuperHero {
    public String name;

    public SecretHero(String superHeroName, String superHeroPower, String name) {
        super(superHeroName, superHeroPower);
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof SuperHero) { // follows Liskov substitution
            // if (getClass() == other.getClass()) // doesn't follow Liskov substitution
            SecretHero secretHero = (SecretHero) other;
            return (name == null ? secretHero.name == null : name.equals(secretHero.name))
                    && super.equals(secretHero); // Checks parent name and power
        }
        return false;
    }
}
