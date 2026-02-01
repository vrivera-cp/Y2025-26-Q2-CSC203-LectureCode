package Module4.Lecture2;

public class SuperVillain extends SuperHero implements Villain {
    public SuperHero nemesis;

    public SuperVillain(String name, String power, SuperHero nemesis) {
        super(name, power);
        this.nemesis = nemesis;
    }
}
