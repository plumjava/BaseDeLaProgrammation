package devoir;

import plum.console.Clavier;

public class Exercice4 {

    public static void main(String[] args) {

        String mot = Clavier.lireTexte("Votre mot?");

        int i = 0;
        int nba = 0;
        while (i < mot.length() & nba < 2) {
            char c = mot.charAt(i);
            if (c == 'a') {
                nba++;
            }

            i++;
        }

        switch (nba) {
            case 0:
                System.out.println("Aucun 'a'");
                break;
            case 1:
                System.out.println("Aucun second 'a'");
                break;
            case 2:
                System.out.println("le second 'a' est en position " + i);
                break;
        }

    }
}

