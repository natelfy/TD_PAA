package up.mi.paa.td02;

import up.mi.jgm.maths.Rationnel; // présent dans maths.jar (TD)
import up.mi.jgm.maths.Complexe;

public final class Sanity {
    public static void main(String[] args) {
        System.out.println("Java runtime = " + System.getProperty("java.runtime.version"));
        Rationnel deux = new Rationnel(2L);        // constructeur entier (TD)
        Rationnel demi  = new Rationnel(1L, 2L);   // constructeur num/den (TD)
        Rationnel somme = deux.addition(demi);
        Complexe z = new Complexe(1.0, 2.0);
        System.out.println("Rationnel ok: " + somme);
        System.out.println("Complexe ok: " + z.getPartieReelle() + " + i" + z.getPartieImaginaire());
    }
}
