package Module4.Lecture2;

public class SuperHero {
    private String name;
    private String power;

    public SuperHero(String name, String power) {
        this.name = name;
        this.power = power;
    }

    public String getName() {
        // Static type is SuperHero here, so returns SuperHero.name
        return name;
    }

    public String getPower() {
        return power;
    }

    public void doAction() {
        System.out.printf("%s uses their %s%n", this.getName(), getPower());
    }
}
