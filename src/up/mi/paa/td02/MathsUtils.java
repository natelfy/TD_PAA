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

    
}
