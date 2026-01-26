package Module3.Lecture2;

public class VectorUtil {
    public static Vector add(Vector v1, Vector v2) {
        double x1 = v1.getMagnitude() * Math.cos(v1.getDirectionInRadians());
        double x2 = v2.getMagnitude() * Math.cos(v2.getDirectionInRadians());

        double y1 = v1.getMagnitude() * Math.sin(v1.getDirectionInRadians());
        double y2 = v2.getMagnitude() * Math.sin(v2.getDirectionInRadians());

        return new ComponentVector(x1 + x2, y1 + y2);
    }

    public static Vector add(ComponentVector cv1, ComponentVector cv2) {
        double x = cv1.getX() + cv2.getX();
        double y = cv1.getY() + cv2.getY();

        return new ComponentVector(x, y);
    }
}
