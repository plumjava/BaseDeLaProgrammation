/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloc1.b1sio2.java3while;

import plum.console.Clavier;

public class Exercice2WhileMonnayeur2 {

    public static void main(String[] args) {
        int mt = Clavier.lireInt("Montant en euros <=20 ? ");
        int nbpiece = 0;
        int nbtot = 0;
        
        boolean ok=true;
        
        if (mt <= 20 && mt >= 0) {
            System.out.println("Montant en euros doit être en 0 et 20");
            ok=false;
        }

        if (mt % 2 == 0) {
            System.out.println("Montant n'est pas pair !!!");
            ok=false;
        }

        while (nbtot != mt & ok == true) {
            nbtot = nbtot + 2;
            nbpiece++;
            System.out.println("Pièce " + nbpiece + ": 2 €");
        }

    }

}
