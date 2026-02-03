package Module4.Lecture3;

public abstract class Instrument {
    private String tuning;

    public Instrument(String tuning) {
        this.tuning = tuning;
    }

    public void getTuning(double getTuning) {
        this.tuning = tuning;
    }

    public void setTuning(double setTuning) {
        this.tuning = tuning;
    }

    public abstract void play();
}
