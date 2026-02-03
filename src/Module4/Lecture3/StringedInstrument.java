package Module4.Lecture3;

public abstract class StringedInstrument extends Instrument {
    private final int strings;

    public StringedInstrument(String tuning, int strings) {
        super(tuning);
        this.strings = strings;
    }

    public int getStrings() {
        return strings;
    }

    // Doesn't need to override play() because this class is also abstract
}
