package up.mi.paa.td02;

import up.mi.jgm.maths.Rationnel;
import up.mi.jgm.maths.Complexe;

public final class MathsUtils {
    public static Rationnel puissance(Rationnel r, int n) {
        if (r == null) {
            throw new NullPointerException("r");
        }
        if (n < 0) {
            throw new IllegalArgumentException("n < 0");
        }
        Rationnel res = new Rationnel(1L);
        for (int i = 1; i < n; i++) {
            res = res.multiplication(r);
        }
        return res;
    }

    public static Complexe somme(Complexe c1, Complexe c2) {
        if (c1 == null || c2 == null) {
            throw new NullPointerException();
        }
        double reel = c1.getPartieReelle() + c2.getPartieReelle();
        double im = c1.getPartieImaginaire() + c2.getPartieImaginaire();

        return new Complexe(reel,im);
    }

    public static Complexe multiplication(Complexe c1, Complexe c2) {
        if (c1 == null || c2 == null) {
            throw new NullPointerException();
        }
        double re = c1.getPartieReelle() * c2.getPartieReelle();
        double im = c1.getPartieImaginaire() + c2.getPartieImaginaire();
        double ri = c1.getPartieReelle() * c2.getPartieImaginaire();
        double ie = c1.getPartieImaginaire() * c2.getPartieReelle();

        return new Complexe((re - im), (ri + ie));
    }
}
