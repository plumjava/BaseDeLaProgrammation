package bloc1.b1sio2.java3for;

import plum.thread.MyThread;

public class ForLoto {

    public static void main(String[] args) {
        System.out.println("Le tirage du loto est : ");
        for (int i = 0; i < 5; i++) {
            int tirage = (int) (Math.random() * 49) + 1;
            System.out.println(tirage);
            MyThread.pause(1500);
        }
    }
}
