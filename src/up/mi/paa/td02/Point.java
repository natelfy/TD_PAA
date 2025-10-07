package up.mi.paa.td02;

import java.util.Vector;

public final class Point {
    private final double abs;
    private final double ord;

    public Point(double x, double y) {
        this.abs = x;
        this.ord = y;
    }
    public double getX() { return abs; }
    public double getY() { return ord; }

    public double distance(Point a) {
        return Math.hypot(a.abs - this.abs, a.ord - this.ord);
    }
}
