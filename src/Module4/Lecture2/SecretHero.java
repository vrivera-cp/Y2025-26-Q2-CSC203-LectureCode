package Module4.Lecture2;

public class SecretHero extends SuperHero {
    private String name;

    public SecretHero(
            String superHeroName,
            String superHeroPower,
            String name
    ) {
        super(superHeroName, superHeroPower);
        this.name = name;
    }

    @Override
    public String getName() {
        // Static type is SecretHero here, so returns SecretHero.name
        return this.name;
    }

    @Override
    public void doAction() {
        System.out.printf("%s does ordinary things.%n", getName());
    }

    public void doSuperAction() {
        // Call parent's version of doAction
        super.doAction();
    }
}
