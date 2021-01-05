package devoir;

import plum.console.Clavier;

public class Exercice1 {
    public static void main(String[] args) {
        char val;
        do{
            val=Clavier.lireChar("Saisir 'q' ou 'Q' ?");
        }while ( val !='q' & val != 'Q');
        
        System.out.println("Au revoir...");
    }
    
}
