package bloc1.java0;
import plum.thread.MyThread;
public class ex8a {
    public static void main(String[] args) {
        int temperature;
        System.out.print("Cuisson en cours ");
        do{
            temperature = (int)( Math.random() * 201 ) + 250;
            System.out.print("*");
            MyThread.pause(500);
        } while (temperature > 300 && temperature < 400);
        System.out.println(" Alarme ! ");
    }
}
