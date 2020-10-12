/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloc1.java.devoir.switchif02;

import plum.console.Clavier;

/**
 *
 * @author thbogusz
 */
public class Exercice3Consonne {

    public static void main(String[] args) {
        String mot = Clavier.lireTexte("Votre mot ? ");

        char c = mot.charAt(0);

        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Le mot " + mot + " ne commence pas par une consonne");
                break;
            default:
                System.out.println("Le mot " + mot + " commence pas par une consonne");

        }
    }
}
