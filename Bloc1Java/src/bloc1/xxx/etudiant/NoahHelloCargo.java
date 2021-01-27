/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cargo;

import java.util.Arrays;

/**
 *
 * @author Noah
 */
public class NoahHelloCargo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String tCargo[] = {"c1", "c2", "Les Agraittes", "c4", "c5"};
        int tDistance[] = {15, 6800, 1454, 243 , 665};
        
        for(int i = 0; i < tCargo.length; i++){
            System.out.println(tCargo[i] + tDistance[i]);
        }
        
        System.out.println("Le nombre de bateaux dont la distance est inférieur à 800 est : " + NoahCargo.nbDistance(tDistance, 800));
        
        System.out.println(tCargo[2] + tDistance[2]);
        NoahCargo.modifDistance(tCargo, tDistance, "Les Agraittes", 1200);
        System.out.println(tCargo[2] + tDistance[2]);
        
        
       for(int i = 0; i < tCargo.length; i++){
           System.out.println(tCargo[i] + NoahCargo.nbHeureRetour(tCargo, tDistance, tCargo[i]));
       }
    }
    
}
