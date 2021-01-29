/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloc1.xxx.etudiant;

import java.util.Arrays;
import plum.console.Clavier;
import plum.tableau.Tableau;

/**
 *
 * @author Nathanael
 */
public class NathanaelHelloCargo {
    public static void main(String[] args){
        String tCargo[] = new String[10];
        Tableau.initStringSansDoublon(tCargo, Tableau.TNAME);
        tCargo[4] = "Les Aigrettes";
        
        int tDistance[] = new int[10];
        Tableau.initInteger(tDistance, 1, 10000);
        System.out.println(Arrays.toString(tDistance));
        
        
        int menu;
        do{
             menu = Clavier.lireInt(  "+++++++++\n"
                                   + "1- Afficher tous les cargos et leur distance au Havre\n"
                                   + "2- Afficher le nombre de bateau dont la distance est inférieure à 800 milles\n"
                                   + "3- Modifie la distance d'un cargo\n"
                                   + "4- Afficher pour tous les cargos le nombre d'heures nécessaires pour un retour au Havre\n"
                                   + "Choisir un nombre : ");
 
            switch(menu){
 
                case 1 :
                    System.out.println(Arrays.toString(tCargo));
                    System.out.println(Arrays.toString(tDistance));
                    break;
 
                case 2 :
                    int d = 800;
                    int nbDistance = Cargo.nbDistance(tDistance, d);
                    System.out.println(nbDistance);
                    break;
 
                case 3:
                    for(int a=0; a<tCargo.length;a++){
                        String cargo=tCargo[a];
                        int nbheure=Cargo.nbHeureRetour(tCargo, tDistance, cargo);
                        System.out.println(tCargo[a] + " : " + nbheure);
                    }
                    break;
 
                case 4 :
                    break;
            }
 
        }while(menu!=0);
    }
}
