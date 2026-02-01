package Module4.Lecture2;

public class TypeCastsMain {
    public static void main(String[] args) {
        // Instantiation
        SuperHero superHero = new SuperHero("Captain America", "super strength");
        SecretHero secretHero = new SecretHero("Superman", "flight", "Clark");

        // Up Casts
        // From child to any parent along the inheritance line
        // Automatic
        SuperHero childToParent = secretHero;
        Object childToGrandParent = secretHero;

        // Down Casts
        // From parent to any child along the inheritance line
        // Explicit cast
        SecretHero grandParentToGrandChild = (SecretHero) childToGrandParent;
        SecretHero parentToChild = (SecretHero) childToParent;

        SecretHero parentInstanceToChildType = (SecretHero) superHero; // Will error!

        // Class casts
        // Cannot cast after divergence to inconvertible types
        // Explicit cast
        SuperVillain superVillian = new SuperVillain("Thanos", "infinity stones", null); // Child of Super Hero

        // Compilation error
        // SecretHero toInconvertibleType = (SecretHero) superVillian;

        // Interface casts
        // Non-final types can generally compile casts to unrelated interfaces
        // Explicit cast
        Villain villain = (Villain) secretHero; // Won't run with our current classes
    }
}
