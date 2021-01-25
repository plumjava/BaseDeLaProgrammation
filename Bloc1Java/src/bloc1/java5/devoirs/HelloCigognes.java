/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloc2.b1sio2.devoir;

/**
 *
 * @author bogusz.thierry
 */
public class HelloCigognes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //C jeu d'essai
        
        int[] tCigogne2020 = new int[52];
        
        int total = totalCigogne(tCigogne2020);
        int max = maxCigogne(tCigogne2020);
        int moy = moyenneCigogne(tCigogne2020);
        
        System.out.println("Total=" + total);
        System.out.println("Maximum=" + max);
        
        System.out.println("Liste des semaines < " + moy);
        
        for (int i=0;i<tCigogne2020.length;i++){
            if (tCigogne2020[i] < moy ){
                System.out.println("semaine : " + i);
            }
        }
        
    }

    public static int totalCigogne(int[] tCigogne) {
        int c = 0;
        for (int i = 0; i < tCigogne.length; i++) {
            c += tCigogne[i];
        }
        return c;
    }
    
    public static int moyenneCigogne(int[] tCigogne) {
        int c = totalCigogne(tCigogne);
        
        return c/tCigogne.length;
    }
    
    public static int maxCigogne(int[] tCigogne) {
        int maxi = 0;
        for (int i = 0; i < tCigogne.length; i++) {
            if ( tCigogne[i] > tCigogne[maxi]){
                maxi=i;
            }
        }
        return tCigogne[maxi];
    }

}
