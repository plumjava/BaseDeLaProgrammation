package devoir;

import plum.console.Clavier;

public class Exercice2 {
    public static void main(String[] args) {
        
        int c = 0;
        int alea = (int)(Math.random()*200)+1;
        
        System.out.println("Vos tirages réussis : ");
        
        while ( alea < 150){
            c++;
            System.out.println(alea + ",");
            alea = (int)(Math.random()*200)+1;
        }
        
        System.out.println(c + " tirage(s) réussi(s)");
    }
    
}
