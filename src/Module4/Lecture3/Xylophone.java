package Module4.Lecture3;

public class Xylophone extends Instrument {
    public Xylophone() {
        super("A4");
    }

    public void setTuning(String string) {
        // Evidence that this design isn't the best!
        throw new RuntimeException();
    }

    public void play() {
        IO.println("The " + getClass().getSimpleName() + " is struck with a mallet");
    }
}
