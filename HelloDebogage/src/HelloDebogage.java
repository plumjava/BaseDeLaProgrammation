
import plum.console.Clavier;


/**
 *
 * @author thbogusz
 */
public class HelloDebogage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int minv;
        minv = min ( 3, 10);
        
        int min;
        int a = 12;
        int b = 7;
        min = min (a,b);
        
        int nb1 = Clavier.lireInt("Nombre 1 ?");
        int nb2 = Clavier.lireInt("Nombre 2 ?");
        System.out.println("min :" + min ( nb1, nb2));
    }

    static int min(int a, int b) {

        int r = 0;
        if (a < b) {
            r = a;
        } else {
            r = b;
        }

        return r;
    }

}
