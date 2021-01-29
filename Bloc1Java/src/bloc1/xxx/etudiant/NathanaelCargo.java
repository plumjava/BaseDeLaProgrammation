/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloc1.xxx.etudiant;

import java.util.Arrays;

/**
 *
 * @author Nathanael
 */
public class NathanaelCargo {
 
 public static int rechercher(String tCargo[],String cargo){
     int e = -1;
     int d = 0;
     for (int i = 0; i < tCargo.length; i++) {
         if(cargo.equals(tCargo[i])){
             d=e;
         }
     }
     return e;
 }
 
 /**
 *
 * retourne le nombre de cargos se trouvant à moins de d milles du Havre
 *
 * @param tDistance Tableau mémorisant la distance de chaque cargo par rapport au Havre
 * @param d  Nombre de milles par rapport au Havre
 *
 * @return
 *    Le nombre de cargo se trouvant à moins de d milles du Havre
 *
 */
 public static int nbDistance(int tDistance[],int d){
     int nb = 0;
     for (int i = 0; i < tDistance.length; i++) {
         if(tDistance[i] < d){
             nb++;
         }
     }
     return nb;
 }     
 
/**
 *
 * Modifie la distance d'un cargo dans tDistance
 *
 * @param tCargo Tableau mémorisant la liste des cargos
 * @param tDistance Tableau mémorisant la distance de chaque cargo par rapport au Havre
 * @param cargo  Nom du cargo dont on veut modifier la distance
 * @param newDistance  Nouvelle distance de cargo
 *
 */
 public static void modifDistance(String tCargo[], int tDistance[],
                            String cargo, int newDistance) {
     int c = rechercher(tCargo, cargo);
     tDistance[c] = newDistance;
 }
 
/**
 *
 * Calcule le nombre d'heures nécessaires avant le retour d'un cargo
 *
 * Règle de calcul : Le nombre d'heure=distance/25, on retourne une valeur entière
 *
 * @param tCargo Tableau mémorisant la liste des cargos
 * @param tDistance Tableau mémorisant la distance de chaque cargo par rapport au Havre
 * @param cargo  Nom du cargo dont on veut calculer le temps d'arrivée
 *
 * @return
 *    retourne le nombre d'heures nécessaires au retour d'un cargo
 */
 public static int nbHeureRetour(String tCargo[],int tDistance[], String cargo){
         int nbh = 0;
    int distance = 0;
    int c  = rechercher(tCargo, cargo);
    for (int i = 0; i < tCargo.length; i++) {
        for (int j = 0; j < tDistance.length; j++) {
            if(){
             tDistance[j] = distance;
            }   
        }
    }
    nbh = distance/25;
     
     return nbh;
 } 
}