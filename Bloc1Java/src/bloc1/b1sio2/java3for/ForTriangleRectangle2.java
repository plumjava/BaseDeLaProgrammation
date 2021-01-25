package bloc1.b1sio2.java3for;

import plum.console.Clavier;

public class ForTriangleRectangle2 {

    public static void main(String[] args) {

        int t = Clavier.lireInt("Taille de la base ? ");

        for (int i = 1; i <= t; i++) {
            
            for (int j = 1; j <= i; j++) {
                System.out.print("°");
            }
            
            System.out.println("");
        }

    }
}
