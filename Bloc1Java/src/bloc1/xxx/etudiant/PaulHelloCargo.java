package bloc1.xxx.etudiant;


import plum.console.Clavier;
import plum.tableau.Tableau;

public class PaulHelloCargo {

    public static void main(String[] args) {
        String tCargo[] = {"cargo1", "cargo2", "Les Aigrettes", "cargo4", "cargo5", "cargo6"};
        int tDistance[] = new int[6];
        Tableau.initInteger(tDistance, 0, 2000);
        char c = '0';

        do {
            switch (c) {
                case 'a':
                    for (int i = 0; i < tCargo.length; i++) {
                        System.out.println(tCargo[i] + " : " + tDistance[i] + " milles");
                    }
                    break;
                case 'b':
                    System.out.println("Le nombre de bateau dont la distance est inférieur à 800 milles est : " + PaulCargo.nbDistance(tDistance, 800));
                    break;
                case 'c':
                    PaulCargo.modifDistance(tCargo, tDistance, "Les Aigrettes", 1230);
                    System.out.println("La distance du cargo Les Aigrette a bien été modifié !");
                    break;
                case 'd':
                    for (int i = 0; i < tCargo.length; i++) {
                        System.out.println(tCargo[i] + " : " + PaulCargo.nbHeureRetour(tCargo, tDistance, tCargo[i]) + "h");
                    }
                    break;
                case 'e':
                    System.out.println(PaulCargo.sontAuPort(tDistance, auport));
                    break;
            }

            System.out.println("====================================================================================================");
            System.out.println("Afficher TOUS les cargos et leur distance au Havre : a");
            System.out.println("Afficher le nombre de bateau dont la distance est inférieure à 800 milles : b");
            System.out.println("Modifier la distance du cargo “Les Aigrettes” : sa nouvelle distance du Havre est de 1230 milles : c");
            System.out.println("Afficher pour TOUS les cargos le nombre d'heures nécessaires pour un retour au Havre : d");
            System.out.println("Afficher la liste de cargos au port : d");
            System.out.println("Quitter : Q");
            System.out.println("====================================================================================================");

            c = Clavier.lireChar("Votre choix  : ");
        } while (c != 'Q');

    }

}
