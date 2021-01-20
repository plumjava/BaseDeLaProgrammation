
package bloc1.java0;
import plum.console.Clavier;
public class ex8 {
    public static void main(String[] args) {
        int i=1;
        int nombre = Clavier.lireInt("Saisir un nombre ");
        int min = nombre;
        do{
            i=i+1;
            nombre = Clavier.lireInt("Saisir un nombre ");
            if (min>nombre){
                min = nombre;
            }
        } while(i<10);
        System.out.println("Le plus petit nombre saisi a été "+min);
    }   
}
