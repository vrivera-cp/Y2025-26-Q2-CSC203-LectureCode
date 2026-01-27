package Module3.Lecture3;

public class Lion implements Carnivore {
    @Override
    public void hunt() {
        IO.println(getClass().getSimpleName() + " stalks its prey.");
    }
}
