
package bloc1.java0;
import plum.console.Clavier;
public class ex10a {
    public static void main(String[] args) {
        int secret;
        int nombre;
        int test = 0;
        secret=(int)( Math.random() * 101 ) + 20;
        do {
            test=test+1;
            System.out.println("Essai n°"+test);
            nombre = Clavier.lireInt("Saisir un nombre : ");
            if (nombre > secret){
                System.out.println("Trop grand");
            }
            if (nombre < secret){
                System.out.println("Trop petit");
            }  
        } while (test < 10 && secret != nombre);
        if (nombre == secret){
            System.out.println("Partie gagné en "+test
                    +" essai le nombre était "+secret);
        }
        else{
            System.out.println("perdu le nombre était "+secret);
        }
    }    
}
