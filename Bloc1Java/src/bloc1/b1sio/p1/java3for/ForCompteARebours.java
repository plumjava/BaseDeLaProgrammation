package bloc1.b1sio.p1.java3for;

import plum.console.Clavier;
import plum.thread.MyThread;

public class ForCompteARebours {

    public static void main(String[] args) {
        int t = Clavier.lireInt("Temps en seconde ? ");
        
        for (int i = t; i > 0; i--) {
            
            System.out.print(i + ".");
            MyThread.pause(1000);
        }
        System.out.println("0");
    }

}
