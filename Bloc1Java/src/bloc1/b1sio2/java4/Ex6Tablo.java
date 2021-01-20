package bloc1.b1sio1.java4;

import java.util.Arrays;
import plum.console.*;
import plum.tableau.*;
import plum.console.Menu;

public class Ex6Tablo {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {

        String[] tNomSal;
        tNomSal = new String[50];
        int[] tSalaire;
        tSalaire = new int[50];
        char menu;
        do {

            String[] smenu = {"Initialiser le tableau",
                "Afficher les résultats du tirage",
                "Connaitre les salaire d'un employé, le salaire min et max et le salaire moyen"};

            menu = Menu.show("Enfant Inscription", smenu);
            switch (menu) {

                case 'a':
                    Tableau.initInteger(tSalaire, 1500, 6500);
                    Tableau.initStringSansDoublon(tNomSal, Tableau.TNAME);
                    break;

                case 'b':
                    System.out.println(Arrays.toString(tSalaire));
                    System.out.println(Arrays.toString(tNomSal));
                    break;
                case 'c':
                    int smax = Integer.MIN_VALUE;
                    int smin = Integer.MAX_VALUE;
                    int stotal = 0;
                    int moy = 0;
                    String nom = Clavier.lireTexte("Quel est le nom ?");
                    for (int i = 0; i < tNomSal.length; i++) {
                        if (tNomSal[i].equals(nom)) {
                            System.out.println("Le salaire de " + tNomSal[i] + " est de " + tSalaire[i] + "€");
                        }
                        if (tSalaire[i] > smax) {
                            smax = tSalaire[i];
                        } else if (tSalaire[i] < smin) {
                            smin = tSalaire[i];
                        }
                        stotal = stotal + tSalaire[i];
                    }
                    System.out.println("Le salaire minimum est " + smin);
                    System.out.println("Le salaire maximum est " + smax);
                    moy = stotal / tNomSal.length;
                    System.out.println("Le salaire moyen est de " + moy);
                    break;
            }
        } while (menu != 'Q');

    }
}
