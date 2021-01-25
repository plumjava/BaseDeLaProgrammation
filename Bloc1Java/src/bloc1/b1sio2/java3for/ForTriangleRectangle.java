package bloc1.b1sio2.java3for;

import plum.console.Clavier;

public class ForTriangleRectangle {

    public static void main(String[] args) {

        int t = Clavier.lireInt("Taille de la base ? ");
        String p = "";
        for (int i = 1; i<= t ; i++){
            p = p + '°';
            System.out.println(p);
        }

    }

}
