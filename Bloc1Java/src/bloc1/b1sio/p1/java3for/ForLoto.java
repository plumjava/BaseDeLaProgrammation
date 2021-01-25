package bloc1.b1sio.p1.java3for;

public class ForLoto {

    public static void main(String[] args) {
        
        
        for (int i = 1; i < 6; i++) {
            int t = (int) (Math.random() * 49) + 1;
            System.out.println(" tirage " + i + " numéro " + t);

        }
    }

}
