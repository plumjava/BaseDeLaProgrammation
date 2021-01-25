package bloc1.b1sio.p1.java3for;

import plum.console.Clavier;

public class ForTriangleRectangle {

    public static void main(String[] args) {
        int t = Clavier.lireInt("entrez la taille de votre triangle ? ");
        int i;
        char d = '°';
        String s = "";
        for  (i=1 ; i <= t ; i++) {//(i=t; i > 0; i--)
            s = s + d;
            System.out.println(s);
        }
    }
}
