/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloc1.b1sio1.java4;

import plum.console.Menu;
import plum.tableau.*;
import java.util.Arrays;
import plum.console.Clavier;
/**
 *
 * @author Nathanael
 */
public class WhileInscriptionEnfant {
    public static void main(String[] args){
        String[] tEnfant;
        tEnfant = new String[130];
        
        int temp = 0;
        char menu;
        do{
            String[] smenu = {"Initialiser le tableau Enfant",
            "Resultat"};
            menu = Menu.show("WhileInscriptionEnfant", smenu);
            switch(menu){
                case 'a':
                    Tableau.initStringSansDoublon(tEnfant, Tableau.TNAME);
                    System.out.println(Arrays.toString(tEnfant));
                    break;
                case 'b':
                    for (int i = 0; i < tEnfant.length; i++) {
                        String nom = Clavier.lireTexte("Nom ? : ");
                        if(tEnfant[i].equals(nom)){
                             temp++;
                        }
                    }
                    if(temp !=0){
                        System.out.println("Enfant Inscrit");
                        }else{
                            System.out.println("Enfant non-inscrit");
                        }
                    temp = 0;
                    break;

                    }
        }while(menu != 'Q');
    }
}
