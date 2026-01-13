package Module1.Lecture3;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {
    public static void main(String[] args) {
        // Parent type reference variable and child type instantion
        Map<String, Integer> ages = new HashMap<>();

        // Common methods
        ages.put("Mochi", 6);
        ages.put("Harvest", 5);

        ages.remove("Harvest");

        System.out.println(ages.get("Mochi"));

        // Non-existent values produce `null`
        System.out.println(ages.get("Pearl"));

        // Specifying a default non-existent value
        System.out.println(ages.getOrDefault("Pearl", 0));

        // Key type must have a valid hashCode() method
        // This method returns a unique integer based on the object's data
        System.out.println("Mochi".hashCode());
        System.out.println("Harvest".hashCode());
        System.out.println("Pearl".hashCode());
    }
}
