/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloc1.b1sio1.java4;

import plum.tableau.Tableau;

/**
 *
 * @author bogusz.thierry
 */
public class ForTirageDe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        int[] tTirage = new int[100];
        
        Tableau.initInteger(tTirage, 1, 6);
        
        int c[] = new int[6];
        
        for(int i = 0 ; i < tTirage.length; i++ ){
            int j = tTirage[i];
           // c[j-1] = c[j-1] + 1; 
            
            c[tTirage[i]-1]++;
        }
        
        for(int i=0; i<c.length;i++){
            System.out.println("i" + " : " + c[i]) ;
        }
        
        
    }
    
}
