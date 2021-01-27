/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloc1.java5;

import java.util.Arrays;

/**
 *
 * @author pasca
 */

public class GuillaumeHelloImprimante {
    public static void main(String[] args) {
 
        // Initialiser le tableau tImprimante avec une adresse ip
        // Initialiser le tableau tLibre
 
        String[] tImprimante = new String[50];
 
        boolean[] tLibre = new boolean[50];
 
        for ( int vv = 0; vv < tImprimante.length; vv++ ){
 
            int zz = (int)(Math.random() * 8) + 70;
            tImprimante[vv] = "192.168." + zz + "." + (vv+1);
 
            tLibre[vv] = ((int)(Math.random()*2) == 1) ? true : false;
        }
 
 
 
        // Afficher le contenu des tableaux
 
        System.out.println(Arrays.toString(tImprimante));
        System.out.println(Arrays.toString(tVille));
 
        // Début de l'application 
 
        int menu;
        do{
             menu = Clavier.lireInt(  "+++++++++\n"
                                   + "1- Nombre d'imprimantes libres\n"
                                   + "2- Affiche l'IP de la 1ère imprimante disponible\n"
                                   + "3- Nombre d'imprimantes proches\n"
                                   + "4- Afficher l'état(libre/occupé) d'une imprimante"
                                   + "5- Réserver une imprimante libre\n"
                                   + "6- Libérer une imprimante d'après son IP\n"
                                   + "Choisir ? ");
 
            switch(menu){
 
                case 1 :
                    int nbLibre = Imprimante.nbLibre( tLibre );
                    System.out.println("Nombre d'imprimantes libres : " + nbLibre);
                    break;
 
                case 2 :
                    break;
 
                case 3 :
                    break;
 
                case 4 :
                    break;
 
                case 5 :
                    break;
 
                case 6 :
                    break;
            }
 
        }while(menu!=0);
 
    }
 
}