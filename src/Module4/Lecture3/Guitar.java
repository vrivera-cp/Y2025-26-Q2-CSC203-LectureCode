package Module4.Lecture3;

public class Guitar extends StringedInstrument {
    public Guitar(String tuning) {
        super(tuning, 6);
    }

    @Override
    public void play() {
        IO.print(getClass().getSimpleName() + " is strummed");
    }
}
