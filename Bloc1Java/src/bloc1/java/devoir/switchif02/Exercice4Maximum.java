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
public class Exercice4Maximum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nb1 = Clavier.lireInt("Nombre 1 ? ");
        int nb2 = Clavier.lireInt("Nombre 1 ? ");
        int nb3 = Clavier.lireInt("Nombre 1 ? ");
        
        int max;
        
        if ( nb1 > nb2 & nb1 > nb3 ){
            max = nb1;
        }else if ( nb2 > nb3 ){
            max = nb2;
        }else{
            max = nb3;
        }
        
        System.out.println("Le nombre maximum est " + max);
    }
    
}
