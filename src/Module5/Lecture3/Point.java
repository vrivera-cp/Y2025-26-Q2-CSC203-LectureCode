package Module5.Lecture3;

public class Point {
    public final int x;
    public final int y;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static double distanceBetween(Point a, Point b) {
        int dx = b.x - a.x;
        int dy = b.y - a.y;
        return Math.sqrt(dx * dx + dy * dy);
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
