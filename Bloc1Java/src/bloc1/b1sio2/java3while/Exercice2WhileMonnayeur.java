
package bloc1.b1sio2.java3while;

import plum.console.Clavier;

public class Exercice2WhileMonnayeur {

    public static void main(String[] args) {
        int mt = Clavier.lireInt("Montant en euros <=20 ? ");
        int nbpiece = 0;
        int nbtot = 0;
        if(mt<= 20 && mt>=0){
            if(mt % 2 == 0){
                while(nbtot!=mt){
                    nbtot = nbtot + 2;
                    nbpiece++;
                    System.out.println("Pièce " + nbpiece + ": 2 €");
                }
            }else{
                System.out.println("Montant n'est pas pair !!!");
            }
            
        }else{
                System.out.println("Montant en euros doit être en 0 et 20");
            }

    }
    
}
