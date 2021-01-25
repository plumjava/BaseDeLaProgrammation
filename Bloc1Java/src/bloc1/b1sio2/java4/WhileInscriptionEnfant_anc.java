package bloc1.b1sio1.java4;

import java.util.Arrays;
import plum.console.Clavier;
import plum.tableau.Tableau;

public class WhileInscriptionEnfant {

    public static void main(String[] args) {

        String tEnfant[] = new String[130];
        
        //[dupont0,bogusz1,dupont2,...]
        Tableau.initStringSansDoublon ( tEnfant, Tableau.TNAME);
 
        System.out.println ( Arrays.toString ( tEnfant ));
        
        String nom = Clavier.lireTexte("Nom de l'enfant ?");
        
        int i=0;
        while(i<tEnfant.length && !tEnfant[i].equals(nom)){
            i++;
        }
        
        if( i != tEnfant.length){
            System.out.println("Enfant trouvé");
            
        }else{
            System.out.println("Pas trouvé");
        }
        
        
        
        
       

}
}