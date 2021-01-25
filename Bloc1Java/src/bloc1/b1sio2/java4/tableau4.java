package bloc1.b1sio1.java4;

import java.text.MessageFormat;
import java.util.Arrays;
import plum.console.*;
import plum.tableau.*;
import plum.console.Menu;
public class tableau4 {
public static void main(String[] args) {
 
        // Déclarer le tableau tFormateur
        int[] tTirage = new int[100];
        
        // Variable
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        int c4 = 0;
        int c5 = 0;
        int c6 = 0;
        // Menu
        char menu;
        do {
 
            String[] smenu = {"Tirer les dés",
                "Afficher les résultats",};
 
            menu = Menu.show("ForCompteurFormateurs", smenu);
            switch (menu) {
 
                case 'a':
                    Tableau.initInteger(tTirage, 1, 6);
                    System.out.println("Les dés sont tirés !");
                    break;
 
                case 'b':
                    int total = 0;
                    System.out.println("Résultat du tirage :");
                    for(int z = 1; z < 7; z++){
                        total = 0;
                        for(int i = 0; i < tTirage.length; i++){
                            if(tTirage[i] == z){
                                total++;
                            }
                        }
                        System.out.println(z +" : "+ total);
                    }
                    
                    
//                    for(int i = 1; i < 7; i++){
//                        String cx = MessageFormat.format("c{0}", i);
//                        System.out.println(i+" : "+cx);
//                    }
                    
            }
 
        } while (menu != 'Q');
 
    }
}