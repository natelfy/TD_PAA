package up.mi.paa.td02;

public final class Vecteur {
    private final Point a;
    private final Point b;

    public Vecteur(Point a, Point b) {
        this.a = a;
        this.b = b;
    }
    public Point getA() { return a; }
    public Point getB() { return b; }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vecteur)) return false;
        Vecteur v = (Vecteur) o;
        double dx1 = b.getX() - a.getX(), dy1 = b.getY() - a.getY();
        double dx2 = v.b.getX() - v.a.getX(), dy2 = v.b.getY() - v.a.getY();
        double exp = 1e-12;
        return Math.abs(dx1 - dx2) <= exp && Math.abs(dy1 - dy2) <= exp;
    }
}
