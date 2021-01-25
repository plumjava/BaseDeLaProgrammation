package bloc1.b1sio2.java3for;

import plum.console.Clavier;
import plum.thread.MyThread;

public class ForCompteRebours {

    public static void main(String[] args) {

        int nbsec = Clavier.lireInt("Temps en seconde ? ");

        for (int a = nbsec; a > 0; a--) {
            System.out.print(a + ".");
            MyThread.pause(1000);
        }
        System.out.println("0");

    }

}
