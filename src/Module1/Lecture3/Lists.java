package Module1.Lecture3;

// Imports
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        // Empty List/Instantiation
        ArrayList<Integer> al = new ArrayList<>();

        // Common Methods
        al.add(100);
        al.add(200);
        al.add(300);

        System.out.println(al.size()); // 2
        al.remove(1);
        System.out.println(al.get(1)); // 300

        // Printing
        System.out.println(al); // [100, 300]

        // Traditional for loop iteration
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
        }

        // Enhanced for loop iteration
        for (int x : al) {
            System.out.println(x);
        }

        // Instantiation with known elements
        LinkedList<Double> ll = new LinkedList<>(List.of(1.0, 2.0, 3.0));

        // List super type reference variable can be assigned any child instance
        List<String> ls1 = new ArrayList<>();
        List<String> ls2 = new LinkedList<>();
    }
}
