package Module3.Lecture2;

public class ComponentVector implements Vector {
    private final double x;
    private final double y;

    public ComponentVector(double x, double y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public double getMagnitude() {
        return Math.sqrt(x * x + y * y);
    }

    @Override
    public double getDirectionInDegrees() {
        return Math.atan2(y, x) / Vector.radiansPerDegree;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public String toString() {
        return String.format("(%.2f, %.2f)", x, y);
    }
}
