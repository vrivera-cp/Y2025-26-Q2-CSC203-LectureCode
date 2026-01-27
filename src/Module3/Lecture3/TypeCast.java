package Module3.Lecture3;

import java.util.ArrayList;
import java.util.List;

public class TypeCast {
    public static void main(String[] args) {
        // Kind: Up Cast
        // Compiles: Yes
        // Runs: Yes
        // Notes: Java will automatically perform upcasts
        Carnivore carnivoreUp = new Lion();
        Herbivore herbivoreUp = (Herbivore) new Tortoise(); // Explicit, unneeded, type cast

        // Kind: Down Cast
        // Compiles: Yes
        // Runs: May or may not
        // Notes: Must be performed with an explicit type cast operation
        Herbivore herbivoreDown = new Tortoise(); // Up cast

        Tortoise tortoiseDown = (Tortoise) herbivoreDown; // Down cast

        Human humanDown = (Human) herbivoreDown; // Down cast, Will throw a castCastException!

        // Kind: Class to unrelated class
        // Compiles: No
        // Runs: No
        // Human human = (Human) new Lion();

        // Kind: To unrelated class
        // Compiles: Yes* (will not compile if class is final)
        // Runs: May or may not
        // Notes: Must be performed with an explicit type cast operation
        Carnivore carnivoreUnrelated = (Carnivore) new Tortoise();
    }
}
