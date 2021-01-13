package bloc1.java5;

import java.util.Arrays;
import plum.tableau.Tableau;

public class triABulle {

    public static void main(String[] args) {
        int tVal[] = new int[100];
        Tableau.initInteger(tVal, 0, 100);
        triABulle(tVal);
        System.out.println(Arrays.toString(tVal));
    }

    static void triABulle(int t[]) {
        boolean permut = false;
        do {
            int n = t.length - 1;
            permut = false;
            for (int i = 0; i < n; i++) {
                if (t[i] > t[i + 1]) {
                    echangeT(t, i, i + 1);
                    permut = true;
                }
            }
        } while (permut == true);

    }

    static void echangeT(int t[], int nb1, int nb2) {
        int valt1 = t[nb1];
        int valt2 = t[nb2];
        t[nb1] = valt2;
        t[nb2] = valt1;
    }

}
//GARLASCHI Lucas
