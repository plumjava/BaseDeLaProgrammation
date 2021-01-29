package imprimante.java;

import java.util.Arrays;
import plum.console.Clavier;

/**
 *
 * @author pauls
 */
public class HelloImprimante {

    public static void main(String[] args) {

        // Initialiser le tableau tImprimante avec une adresse ip
        // Initialiser le tableau tLibre
        String[] tImprimante = new String[50];

        boolean[] tLibre = new boolean[50];

        for (int vv = 0; vv < tImprimante.length; vv++) {

            int zz = (int) (Math.random() * 8) + 70;
            tImprimante[vv] = "192.168." + zz + "." + (vv + 1);

            tLibre[vv] = ((int) (Math.random() * 2) == 1) ? true : false;
        }

        // Afficher le contenu des tableaux
        System.out.println(Arrays.toString(tImprimante));
        System.out.println(Arrays.toString(tLibre));

        // Début de l'application 
        int menu;
        do {
            menu = Clavier.lireInt("----------\n"
                    + "1- Nombre d'imprimantes libres\n"
                    + "2- Affiche l'IP de la 1ère imprimante disponible\n"
                    + "3- Nombre d'imprimantes proches\n"
                    + "4- Afficher l'état(libre/occupé) d'une imprimante\n"
                    + "5- Réserver une imprimante libre\n"
                    + "6- Libérer une imprimante d'après son IP\n"
                    + "Choisir ? ");

            switch (menu) {

                case 1:
                    int nbLibre = Imprimante.nbLibre(tLibre);
                    System.out.println("Nombre d'imprimantes libres : " + nbLibre);
                    break;

                case 2:
                    int impDisponible = Imprimante.impDisponible(tLibre);
                    System.out.println("La première imprimante est disponible à la place : "+impDisponible);                    
                    break;

                case 3:
                    String adIP = Clavier.lireTexte("Saisissez le zz : ");
                    int denombreProche = Imprimante.dénombreProche(tImprimante, adIP);
                    System.out.println("Nombre d'imprimantes proches : "+denombreProche);
                    break;

                case 4:
                    adIP = Clavier.lireTexte("Saisissez une adresse IP : ");
                    int lib = Imprimante.rechIp(tImprimante, adIP);
                    if(lib==-1)
                        System.out.println("L'imprimante n'existe pas.");
                    else
                        if(tLibre[lib])
                                System.out.println("L'imprimante est libre.");
                        else
                            System.out.println("L'imprimante est occupée.");
                    break;

                case 5:
                    adIP = Clavier.lireTexte("Saisissez une adresse IP : ");
                    Imprimante.réserverImp(tImprimante, tLibre, adIP);
                    break;

                case 6:
                    adIP = Clavier.lireTexte("Saisissez une adresse IP : ");
                    Imprimante.libérerImp(tImprimante, tLibre, adIP);
                    break;
            }

        } while (menu != 0);

    }

}
