package Module4.Lecture3;

public class Violin extends StringedInstrument {
    public Violin(String tuning) {
        super(tuning, 4);
    }

    @Override
    public void play() {
        IO.print(getClass().getSimpleName() + "'s strings are bowed");
    }
}
