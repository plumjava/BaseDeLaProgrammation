package bloc1.b1sio1.java4;

import java.util.Arrays;
import plum.console.*;
import plum.tableau.*;
import plum.console.Menu;
public class tableau6 {
public static void main(String[] args) {
 
        // Déclarer le tableau tFormateur
        String[] tEmploye = new String[50];
        int[] tSalaire = new int[50];
        // Menu
        char menu;
        do {
 
            String[] smenu = {"Initialiser le tableau",
                "Afficher le contenu du tableau",
                "Afficher le salaire d'un employé",
                "Afficher les personnes dont le salaire est inférieur à une personne choisi",
                "Afficher le salaire maximum, minimum et la moyenne"};
 
            menu = Menu.show("ForCompteurFormateurs", smenu);
            switch (menu) {
 
                case 'a':
                    Tableau.initInteger(tSalaire, 1500, 6500);
                    Tableau.initStringSansDoublon(tEmploye, Tableau.TNAME);
                    break;
 
                case 'b':
                    System.out.println(Arrays.toString(tEmploye));
                    System.out.println(Arrays.toString(tSalaire));
                    break;
 
                case 'c':
                    String employe = Clavier.lireTexte("Entrez un nom d'employé : ");
                    int position = 0;
                    
                    for(int i = 0; i < tEmploye.length; i++){
                        if(employe.equals(tEmploye[i])){
                            position = i;
                        }
                    }
                    
                    System.out.println("Le salaire de "+employe+" est de "+tSalaire[position]+"€.");
                    break;
                case 'd':
                    String nom = Clavier.lireTexte("Entrez un nom d'employé : ");
                    int pos = 0;
                    
                    for(int i = 0; i < tEmploye.length; i++){
                        if(nom.equals(tEmploye[i])){
                            position = i;
                        }
                    }
                    
                    int valeur = tSalaire[pos];
                    System.out.println("Le salaire de "+nom+" est de "+tSalaire[pos]+"€.");
                    for(int i = 0; i < tEmploye.length; i++){
                        if(tSalaire[i] < valeur){
                            System.out.println("Le salaire de "+tEmploye[i]+" est inférieur à celui de "+tEmploye[pos]+" car il est de : "+tSalaire[i]+" !");
                        }
                    }
                    break;
                case 'e':
                    int max = Integer.MIN_VALUE;
                    int min = Integer.MAX_VALUE;
                    
                    for(int i = 0; i < tSalaire.length; i++){
                        if(tSalaire[i] < min){
                            min = tSalaire[i];
                        }
                        if(tSalaire[i] > max){
                            max = tSalaire[i];
                        }
                    }
                    System.out.println("Valeur MAX : "+max);
                    System.out.println("Valeur MIN : "+min);
                    
                    int total = 0;
                    
                    for(int j = 0; j < tSalaire.length; j++){
                        total += tSalaire[j];
                    }
                    System.out.println("Moyenne : "+(total / tSalaire.length));
                    break;
 
            }
 
        } while (menu != 'Q');
 
    }
}