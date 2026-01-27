package Module3.Lecture3;

public class Tortoise implements Herbivore {
    @Override
    public void gather() {
        IO.println(getClass().getSimpleName() + " searches for lettuce.");
    }
}
