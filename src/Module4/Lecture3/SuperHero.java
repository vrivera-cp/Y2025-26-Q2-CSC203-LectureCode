package Module4.Lecture3;

import java.util.Objects;

public class SuperHero {
    private String name;
    private String power;

    public SuperHero(String name, String power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        return name;
    }

    // Final methods can't be overridden
    public final String getPower() {
        return power;
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof SuperHero) { // follows Liskov substitution
            // if (getClass() == other.getClass()) // doesn't follow Liskov substitution
            SuperHero superHero = (SuperHero) other;
            return (name == null ? superHero.name == null : name.equals(superHero.name))
                    && (power == null ? superHero.power == null : power.equals(superHero.power));
        }
        return false;
    }
}
