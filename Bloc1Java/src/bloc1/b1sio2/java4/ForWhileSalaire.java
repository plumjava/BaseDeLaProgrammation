/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloc1.b1sio1.java4;

import java.util.Arrays;
import plum.console.Clavier;
import plum.tableau.Tableau;

/**
 *
 * @author bogusz.thierry
 */
public class ForWhileSalaire {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String tNomSal[] = new String[100];
        int[] tSalaire = new int[100];

        Tableau.initStringSansDoublon(tNomSal, Tableau.TNAME);
        System.out.println(Arrays.toString(tNomSal));
        
        Tableau.initInteger(tSalaire, 1500, 6500);
        System.out.println(Arrays.toString(tSalaire));
        
        //--
        String nom = Clavier.lireTexte("nom ?");
        int i=0;
        while ( i<tNomSal.length && nom.equals(tNomSal[i]) == false ){
            i++;
        }
        
        System.out.println("salaire " + tSalaire[i]);
        
        
        for( int j=0; j<tSalaire.length; j++){
            if (tSalaire[j] < tSalaire[i]){
                System.out.println(tNomSal[j] + " : " + tSalaire[j]);
            }
        }
        
        
        

    }

}
