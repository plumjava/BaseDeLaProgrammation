package bloc1.java5;

import java.util.Arrays;
import plum.console.Clavier;
import plum.tableau.Tableau;

public class HelloCompterVal {

    public static void main(String[] args) {
        int tVal[] = {10,20,10,25,100,50,30,20};
        int c=compterVal(tVal,20);
        System.out.println(c);
           
        System.out.println(compterVal(tVal,55));
        
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