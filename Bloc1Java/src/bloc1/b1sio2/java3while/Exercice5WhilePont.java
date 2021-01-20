package bloc1.b1sio2.java3while;
import plum.console.Clavier;
import plum.thread.MyThread;
public class Exercice5WhilePont {

    public static void main(String[] args) {

        int nbVoit = (int) (Math.random() * 10);
        int fVent = (int) (Math.random() * 21);
        int ePont = (int) (Math.random() * 2) + 1;
        System.out.print("Barrière baissée");
        
        //boucle d'attente ... on attend les bonnes conditions
        while (ePont == 1 | nbVoit >= 5 | fVent > 10) {
            MyThread.pause(500);
            
            System.out.print(".");
            
            nbVoit = (int) (Math.random() * 10);
            fVent = (int) (Math.random() * 21);
            ePont = (int) (Math.random() * 2) + 1;
            
        }
        System.out.println("Barrière levée");

    }

}
