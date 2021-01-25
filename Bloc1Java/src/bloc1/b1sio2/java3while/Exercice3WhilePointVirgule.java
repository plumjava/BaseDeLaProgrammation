package bloc1.b1sio2.java3while;

import plum.console.Clavier;

public class Exercice3WhilePointVirgule {

    public static void main(String[] args) {
        String mot = Clavier.lireTexte("Saisir une phrase ? ");

        int nb = 0;
        char c = mot.charAt(nb);

        while (nb < mot.length()-1 & c != ';') {
            nb = nb + 1;
            c = mot.charAt(nb);           
        }
        
        if (c==';'){
        System.out.println("Le nombre de charactéres avant ';' est :" + nb);
        }else{
            System.out.println("Pas de ;");
        }

    }

}
