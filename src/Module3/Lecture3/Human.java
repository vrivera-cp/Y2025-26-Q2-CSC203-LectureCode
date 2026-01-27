package Module3.Lecture3;

public class Human implements Carnivore, Herbivore {
    @Override
    public void hunt() {
        IO.println(getClass().getSimpleName() + " hunts its prey.");
    }

    @Override
    public void gather() {
        IO.println(getClass().getSimpleName() + " searches for edible flora.");
    }
}
