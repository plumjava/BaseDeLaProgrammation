/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloprogramme;

/**
 *
 * @author giang.anthony
 */
public class Programme {
    private String nomProgramme; //nom du programme
    private int nombreMaj; //nombre de mises a jour
    private String auteur; //nom de l'auteur de la dernière mise à jour
    //constructeur de Programme        
    //mémoriser le nom du programme   
    public Programme(String programme) {
        nomProgramme = programme;
        nombreMaj = 0;
        auteur = "";
    }
    //mémorise l'auteur de la mise à jour       
    //incrémente le nombre de mise à jour   
    public void miseAjour(String auteur) {
        this.auteur = auteur;
        nombreMaj++;
    }
    
    //retourne le nombre de mise à jour    
    public int count() {
        return nombreMaj;
    }

    //retourne le nom du programme    
    public String getNomProgramme() {
        return nomProgramme;
    }
    
    /*retourne true si nomProgramme est de type fichier type        
    * par exemple si type="java"        
    * cas 1 : si nomProgramme="Hello.java" isType("java") retourne true        
    * cas 2 : si nomProgramme="Hello.java" isType("php") retourne false        
    */        
    public boolean isType(String type) {
        if(nomProgramme.endsWith("." + type)) return true;
        return false;
    }
    
    //retourne l'auteur de la dernière modification        
    public String getAuteur(){           
        return auteur;        
    }
    
    public void changerType(String type) {
        String nouveauNom = nomProgramme.
                replace(nomProgramme.substring(nomProgramme.indexOf(".")+1), type);
        nomProgramme = nouveauNom;
    }
}
