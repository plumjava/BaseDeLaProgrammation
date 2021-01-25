
package bloc1.b1sio2.java3while;

import plum.console.Clavier;

public class Exercice1WhileSaisirUnMot {

    public static void main(String[] args) {
        char a = Clavier.lireChar("Saisir un caractère ?");
        int ascii = a;
       
        String mot = "";
        while(ascii >= 97 && ascii <= 122){
            mot = mot + a;
            a = Clavier.lireChar("Saisir un caractère ? ");
            ascii = a;
            
        }
        
        if (mot.length() >= 1 ){
          System.out.println("Votre mot est : " +mot);
        }else{
            System.out.println("Pas de mot");
        }

    }
    
}
