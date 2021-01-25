/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloc1.b1sio1.java4;

import java.util.Arrays;
import plum.console.*;
import plum.tableau.*;
import plum.console.Menu;

/**
 *
 * @author bogusz.thierry
 */
public class ForCompterFormateur {

    public static void main(String[] args) {

        // Déclarer le tableau tFormateur
        String[] tFormateur = new String[35];

        // Menu
        char menu;
        do {

            String[] smenu = {"Initialiser le tableau",
                "Afficher le contenu du tableau",
                "Rechercher un nom(comptage"};

            menu = Menu.show("ForCompteurFormateurs", smenu);
            switch (menu) {

                case 'a':
                    String[] t = {"Brigitte", "Victor", "Fiacre"};
                    Tableau.initStringAvecDoublon(tFormateur, t);
                    break;

                case 'b':
                    System.out.println(Arrays.toString(tFormateur));
                    break;

                case 'c':
                    String nom = Clavier.lireTexte("nom?");
                    int c = 0;
                    for (int i=0;i<tFormateur.length;i++){
                        if ( tFormateur[i].equals(nom)){
                            c++;
                        }
                    }
                    System.out.println("Nombre de " + nom +" :" + c);
            }

        } while (menu != 'Q');

    }
}
