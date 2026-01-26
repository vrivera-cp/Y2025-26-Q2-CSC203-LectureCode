package Module3.Lecture2;

public class MagnitudeVector implements Vector {
    private final double magnitude;
    private final double direction; // Radians

    public MagnitudeVector(double magnitude, double direction) {
        this.magnitude = magnitude;
        this.direction = direction;
    }

    @Override
    public double getMagnitude() {
        return magnitude;
    }

    @Override
    public double getDirectionInDegrees() {
        return direction / Vector.radiansPerDegree;
    }

    @Override
    public double getDirectionInRadians() {
        return direction;
    }

    @Override
    public String toString() {
        double x = getMagnitude() * Math.cos(getDirectionInRadians());
        double y = getMagnitude() * Math.sin(getDirectionInRadians());
        return String.format("(%.2f, %.2f)", x, y);
    }
}
