/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloprogramme;

import java.util.ArrayList;
import plum.console.Clavier;

/**
 *
 * @author giang.anthony
 */
public class HelloProgramme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Programme> pg = new ArrayList<Programme>();
        char menu;
        do {
            System.out.println("a- Ajouter un programme");           
            System.out.println("b- Mettre à jour un programme");       
            System.out.println("c- Liste des programmes");       
            System.out.println("d- Nombre de programme par type");       
            System.out.println("e- Modifier le type d'un programme");       
            System.out.println("Q- quitter");

            menu=Clavier.lireChar("Choisir?");
            switch(menu) {
                case 'a':
                    String nomProg = Clavier.lireTexte("Saisir nom programme : ");
                    int index = rechercher(pg, nomProg);
                    if(index != -1) {
                        System.out.println("Programme déjà présent");
                    } else {
                        pg.add(new Programme(nomProg));
                        System.out.println("Programme créé");
                    }
                    System.out.println("-----------------");
                    break;
                
                case 'b':
                    nomProg = Clavier.lireTexte("Saisir nom programme : ");
                    String auteur = Clavier.lireTexte("Saisir auteur : ");
                    index = rechercher(pg, nomProg);
                    if(index != -1) {
                        pg.get(index).miseAjour(auteur);
                        System.out.println("Mise à jour réalisée");
                    } else {
                        System.out.println("Programme inexistant");
                    }
                    System.out.println("-----------------");
                    break;
                
                case 'c':
                    System.out.println("Liste des programme : ");
                    for(Programme unPg : pg) {
                        System.out.println("Nom : " + unPg.getNomProgramme() + " - "
                                            + "Nb MaJ : " + unPg.count() + " - "
                                            + "Auteur dernière maj : " + unPg.getAuteur());
                    }
                    System.out.println("-----------------");
                    break;
                
                case 'd':
                    String type = Clavier.lireTexte("Saisir type : ");
                    int nbPg = 0;
                    for(Programme unPg : pg) {
                        if(unPg.isType(type)) {
                            nbPg++;
                        }
                    }
                    System.out.println("Nombre de programmes " + type + " : " + nbPg);
                    System.out.println("-----------------");
                    break;
                
                case 'e':
                    nomProg = Clavier.lireTexte("Programme à remplacer : ");
                    type = Clavier.lireTexte("Remplacer par le type :  ");
                    index = rechercher(pg, nomProg);
                    if(index != -1) {
                        pg.get(index).changerType(type);
                        System.out.println("Programme modifié");
                    } else {
                        System.out.println("Programme inexistant");
                    }
                    System.out.println("-----------------");
                    break;
                   
            }
        } while(menu != 'Q');
        
           
        
    }
    //retourne l'index du programme correspondant à programme    
    //dans la collection pr    
    //sinon retourne -1 
    static int rechercher(ArrayList<Programme> pr ,String programme) {
        for (int i = 0; i < pr.size(); i++) {
            if(pr.get(i).getNomProgramme().equals(programme)) {
                return i;
            }
        }
        return -1;
    }
    
}
