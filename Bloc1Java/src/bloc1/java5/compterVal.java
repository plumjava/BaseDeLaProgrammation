package bloc1.java5;

import java.util.Arrays;
import plum.console.Clavier;
import plum.tableau.Tableau;

public class compterVal {

    public static void main(String[] args) {
        int tVal[] = new int[100];
        Tableau.initInteger(tVal, 0, 10);
        System.out.println(Arrays.toString(tVal));
        int nb = Clavier.lireInt("Entrez un nombre à chercher : ");
        System.out.println("nombre de " + nb + " : " + compterVal(tVal, nb));
    }

    static int compterVal(int t[], int val) {
        int compteur = 0;
        for (int i = 0; i < t.length; i++) {
            if (t[i] == val) {
                compteur++;
            }
        }

        return compteur;
    }

}
//GARLASCHI Lucas