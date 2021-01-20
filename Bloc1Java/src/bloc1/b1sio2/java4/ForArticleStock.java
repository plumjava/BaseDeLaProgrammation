/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloc1.b1sio1.java4;

import java.util.Arrays;
import plum.console.Clavier;
import plum.console.Menu;
import plum.tableau.Tableau;

/**
 *
 * @author bogusz.thierry
 */
public class ForArticleStock {

    public static void main(String[] args) {

        // Déclarer le tableau tFormateur
        String[] tPiece = new String[100];
        int[] tStock = new int[100];

        //tPiece[0] -> tStock[0]
        // Menu
        char menu;
        do {

            String[] smenu = {"Initialiser les tableaux",
                "Afficher le contenu du tableau",
                "Rechercher un nom(comptage"};

            menu = Menu.show("ForCompteurFormateurs", smenu);
            switch (menu) {

                case 'a':
                    String tval[] = {"moniteur", "clavier", "souris", "carte mémoire", 
                        "disque dur"};
                    Tableau.initStringAvecDoublon(tPiece, tval);
                    Tableau.initInteger(tStock,1,1000);
                    break;

                case 'b':
                    System.out.println(Arrays.toString(tPiece));
                    System.out.println(Arrays.toString(tStock));
                    break;

                case 'c':
                    String nom = Clavier.lireTexte("nom de la pièce?");
                    int c = 0;
                    int stock = 0;
                    for (int i = 0; i < tPiece.length; i++) {
                       if(tPiece[i].equals(nom)){
                           c++;
                           stock = stock + tStock[i];
                       }
                        
                    }
                    System.out.println("Nombre de livraisons : " + c);
                    System.out.println("Stock : " + stock);
                    
            }

        } while (menu != 'Q');

    }
}
