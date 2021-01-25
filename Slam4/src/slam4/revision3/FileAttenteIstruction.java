/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slam4.revision3;

/**
 *
 * @author bogusz.thierry
 */
class FileAttenteInstruction {

    Instruction premier;

    public FileAttenteInstruction() {
        premier = null;
    }

    public void ajouter(String action) {
        Instruction instruction = new Instruction ( action );
        
        if (premier == null){
            premier = instruction;
            return;
        }
        
        Instruction dernier = premier;
        while (dernier.getSuivant() != null){
            dernier = dernier.getSuivant();
        }
        
        dernier.setSuivant(instruction);
    }

    public String retirer() {
        String action = premier.getAction();
        premier = premier.getSuivant();
        return action;
    }

    public boolean estVide() {
        if (premier == null) {
            return true;
        }
        return false;
    }
}
