package bloc1.java5;

import java.util.Arrays;
import plum.console.Clavier;
import plum.tableau.Tableau;

public class echangeT {

    public static void main(String[] args) {
        int tVal[] = new int[5];
        Tableau.initInteger(tVal, 0, 100);
        System.out.println(Arrays.toString(tVal));
        int val1 = Clavier.lireInt("Entrer un premier chiffre a échanger : ");
        int val2 = Clavier.lireInt("Entrer un deuxième chiffre à échanger :");
        echangeT(tVal, val1, val2);
        System.out.println(Arrays.toString(tVal));
    }

    static void echangeT(int t[], int nb1, int nb2) {
        int valt1 = t[nb1 - 1];
        int valt2 = t[nb2 - 1];
        t[nb1 - 1] = valt2;
        t[nb2 - 1] = valt1;
    }

}
//GARLASCHI Lucas