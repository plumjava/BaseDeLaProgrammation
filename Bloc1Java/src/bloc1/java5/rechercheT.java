package bloc1.java5;

import plum.console.Clavier;
import plum.tableau.Tableau;

public class rechercheT {

    public static void main(String[] args) {
        int tVal[] = new int[100];
        Tableau.initInteger(tVal, 0, 100);
        int nb = Clavier.lireInt("Entrez un nombre à chercher : ");
        System.out.println("Résultat : " + rechercherT(tVal, nb));
    }

    static int rechercherT(int t[], int nb) {
        int finder = -1;
        for (int i = 0; i < t.length; i++) {
            if (t[i] == nb) {
                finder = nb;
            }
        }
        return finder;
    }

}
//GARLASCHI Lucas