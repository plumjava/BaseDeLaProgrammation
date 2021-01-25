package bloc1.b1sio2.java3for;

import plum.console.Clavier;

public class ForCodeCesar {

    public static void main(String[] args) {
        String texte = Clavier.lireTexte("Votre Texte ? ");
        int deca = Clavier.lireInt("Décalage ? ");
        System.out.print("Votre code de Cesar : ");
        for (int i = 0; i < texte.length(); i++) {
            char car = texte.charAt(i);
            char carOriginal = car;
            
            car = (char) (car + deca);
            if (car >= 65 & car <= 90) {
                System.out.print(car);
            } else if (carOriginal < 'A' | carOriginal > 'Z') {
                System.out.print(carOriginal);
            } else {
                int ndeca = car - 90;
                car = 65;
                car = (char) (car + (ndeca - 1));
                System.out.print(car);
            }
            
        }
        System.out.println("");
    }

}
