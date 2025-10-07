package up.mi.paa.td02;

public final class Disque {
    private final Point centre;
    private final double rayon;

    public Disque(Point centre, double rayon) {
        this.centre = centre;
        this.rayon = rayon;
    }
    public Point getCentre() { return centre; }
    public double getRayon() { return rayon; }

    public boolean contient(Point a) {
        return centre.distance(a) <= rayon + 1e-12;
    }

    public boolean intersection(Disque r) {
        double d = this.centre.distance(r.centre);
        return d <= (this.rayon + r.rayon) + 1e-12;
    }
}
