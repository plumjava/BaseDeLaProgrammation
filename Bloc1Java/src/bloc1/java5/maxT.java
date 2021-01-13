package bloc1.java5;

import java.util.Arrays;
import plum.tableau.Tableau;

public class maxT {

    public static void main(String[] args) {
        int tVal[] = new int[100];
        Tableau.initInteger(tVal, 0, 100);
        System.out.println(Arrays.toString(tVal));
        int max = maxT(tVal);
        System.out.println("la valeur maximal du tableau est : " + max);
    }

    static int maxT(int t[]) {
        int maximum = t[0];
        for (int i = 0; i < t.length; i++) {
            maximum = max(maximum, t[i]);
        }
        return maximum;
    }

    static int max(int val1, int val2) {
        if (val1 > val2) {
            return val1;
        } else {
            return val2;
        }
    }

}
//GARLASCHI Lucas