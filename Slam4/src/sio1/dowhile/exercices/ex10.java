/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloc1.java0;

import plum.console.Clavier;

/**
 *
 * @author soury.noe
 */
public class ex10 {

    public static void main(String[] args) {
        // TODO code application logic here
        double nombre;
        int i=-1;
        double moyenne = 0;
        do {
            i=i+1;
            do{
                nombre = Clavier.lireInt("Saisir un note ");
            }while (nombre<0);
            moyenne = moyenne + nombre;
        } while(nombre!=0);
        if (i>0){
            moyenne = moyenne/i;
            System.out.println("La moyenne est de"+moyenne);
        }
        else{
            System.out.println("N/A");
        }
    }
    
}
