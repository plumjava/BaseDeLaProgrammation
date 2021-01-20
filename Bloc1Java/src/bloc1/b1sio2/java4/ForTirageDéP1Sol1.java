package bloc1.b1sio1.java4;

import java.util.Arrays;
import plum.console.*;
import plum.tableau.*;
import plum.console.Menu;
public class ForTirageDéP1Sol1 {
    public static void main(String[] args) {

        int[] tTirage;
        tTirage = new int[100];
        
        char menu;
        do {

            String[] smenu = {"Initialiser le tableau",
                "Afficher les résultats du tirage",};

            menu = Menu.show("Tirage", smenu);
            switch (menu) {

                case 'a':
                    Tableau.initInteger(tTirage, 1, 6);
                    break;

                case 'b':
                    
                    for (int z = 1; z < 7; z++) { 
                        int e=0;
                        for (int i = 0; i < tTirage.length; i++) {
                           if (z==tTirage[i]) {
                               e=e+1;                 
                           }
                        }
                        System.out.println(z+" : "+e);
                        
                    }
                    break;
            }
        } while (menu != 'Q');

    }
}
