/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloc1.b1sio2.java4;

import java.util.Arrays;
import plum.console.Clavier;
import plum.console.Menu;
import plum.tableau.Tableau;

/**
 *
 * @author mdebe
 */
public class ForWhileSalaireDM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String tNomSal[] = new String[100];
        int tSalaire[] = new int[100];

        int i;
        char menu = 0;
        do {
            String[] smenu = {"Initialiser les tableaux",
                "Afficher le salaire d'un employé après avoir saisi son nom et les salariés",
                "Afficher le salaire maximum et minimum des salariés",
                "Afficher la moyenne des salaires"};

            menu = Menu.show("ForWhileSalaire", smenu);

            switch (menu) {
                case 'a':
                    Tableau.initStringSansDoublon(tNomSal, Tableau.TNAME);
                    System.out.println(Arrays.toString(tNomSal));
                    Tableau.initInteger(tSalaire, 1500, 6500);
                    break;

                case 'b':
                    String nom = Clavier.lireTexte("nom du salarié ? ");
                    i = 0;
                    while (i < tNomSal.length && !nom.equals(tNomSal[i])) {
                        i++;
                    }
                    if (i < 100) {
                        System.out.println("Salaire de " + nom + ":" + tSalaire[i]);
                    } else {
                        System.out.println("Pas trouvé !!");
                    }
                    break;

                case 'c':
                    int min = tSalaire[0];
                    int max = tSalaire[0];
                    for (i = 0; i < tSalaire.length; i++) {
                        if (tSalaire[i] < min) {
                            min = tSalaire[i];
                        }
                        if (tSalaire[i] > max) {
                            max = tSalaire[i];
                        }
                    }
                    System.out.println("Le salaire minimum est : " + min + ". Le salaire maximum est : ." + max);
                    break;

                case 'd':
                    int somme = 0;
                    min = tSalaire[0];//Integer.MAX_VALUE
                    max = tSalaire[0];
                    for (i = 0; i < tSalaire.length; i++) {
                        somme = somme + tSalaire[i];
                        if (tSalaire[i] > max) {
                            max = tSalaire[i];
                        }
                        if (tSalaire[i] < min) {
                            min = tSalaire[i];
                        }

                    }
                    double moyenne = somme / tSalaire.length;
                    System.out.println("La moyenne des salaires est de : " + moyenne);
                    
                    System.out.println("min=" + min);
                    System.out.println("max=" + max);
            }
        } while (menu != 'Q');
    }
}
