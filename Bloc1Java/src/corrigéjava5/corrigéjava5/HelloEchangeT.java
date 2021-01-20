package bloc1.java5;

import java.util.Arrays;
import plum.console.Clavier;
import plum.tableau.Tableau;

public class HelloEchangeT {

    public static void main(String[] args) {
        int tVal[] = new int[10];
        Tableau.initInteger(tVal, 0, 100);
        System.out.println(Arrays.toString(tVal));
        
        int val1 = Clavier.lireInt("Entrer un premier chiffre a échanger : ");
        int val2 = Clavier.lireInt("Entrer un deuxième chiffre à échanger :");
        
        echangeT(tVal, val1, val2);
        
        System.out.println(Arrays.toString(tVal));
    }

    static void echangeT(int t[], int i, int j) {
        int valti = t[i];
        int valtj = t[j];
        t[i] = valtj;
        t[j] = valti;
    }

}
//GARLASCHI Lucas