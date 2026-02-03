package Module4.Lecture3;

public class Piano extends Instrument {
    private final int keys;

    public Piano(String tuning, int keys) {
        super(tuning);
        this.keys = keys;
    }

    public int getKeys() {
        return keys;
    }

    @Override
    public void play() {
        IO.println("The " + getClass().getSimpleName() + "'s keys were struck.");
    }
}
