/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloc1.devoir.switchif02;

import plum.console.Clavier;

/**
 *
 * @author bogusz.thierry
 */
public class Exercice1Diplome {
    public static void main(String[] args) {
        String MESS = "Diplôme possible :";
        
        int annee = Clavier.lireInt("Nombre d'année ? ");
        
        if ( annee >=1 & annee <= 3){
            System.out.println(MESS + "Licence");
        }else if ( annee>=4 & annee<=5){
            System.out.println(MESS + "Master 1");
        }else if ( annee > 5){
            System.out.println(MESS + "Doctorat");
        }else{
            System.out.println("Erreur !!!");
        }   
    }    
}
