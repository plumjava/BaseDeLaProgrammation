/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloc1.java4;

import java.util.Arrays;
import plum.console.Menu;
import plum.tableau.Tableau;

/**
 *
 * @author thbogusz
 */
public class ForCompteFormateur {

    public static void main(String[] args) {

        // Déclarer le tableau tFormateur
        char menu;
String tFormateur[]=new String[10];
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

            }

        } while (menu != 'Q');

    }
}
