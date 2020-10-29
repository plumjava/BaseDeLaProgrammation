/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloc1.devoir.switchif02;

import plum.console.Clavier;

/**
 *
 * @author thbogusz
 */
public class Exercice2Produits {

    public static void main(String[] args) {
        String MESS = "Votre produit : ";

        int code = Clavier.lireInt("Saisir votre code ? ");

        switch (code) {
            case 1002:
                System.out.println(MESS + "Conserve");
                break;
            case 1010,1011,1012,1013,1014,1015:
                System.out.println(MESS + "Lessive");
                break;
            case 1020:
            case 1023:
            case 1024:
                System.out.println(MESS + "Liquide");
                break;
            default:
                System.out.println("Erreur code !!");

        }
    }
}
