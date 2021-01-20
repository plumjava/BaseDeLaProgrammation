package bloc1.java5;

import static bloc1.java5.HelloCompterVal.compterVal;
import plum.console.Clavier;
import plum.tableau.Tableau;

public class HelloRechercheT {

    public static void main(String[] args) {
        int tVal[] = {10,20,10,25,100,50,30,20};
        int i=rechercheT(tVal,20);
        System.out.println(i);
           
        System.out.println(rechercheT(tVal,56));
    }

    static int rechercheT(int t[], int nb) {
        int finder = -1;
        
        int i=0;
        while ( i<t.length & finder == -1) {
            if (t[i] == nb) {
                finder = i;
            }else{
                i++;
            }
        }
        return finder;
    }

}
//GARLASCHI Lucas