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
class Instruction {
 
    private final String action;
    private Instruction suivant;
 
    public Instruction(String action) {
        this.action = action;
        suivant = null;
    }
 
    public String getAction() {
        return action;
    }
 
    public Instruction getSuivant() {
        return suivant;
    }
 
    public void setSuivant(Instruction suivant) {
        this.suivant = suivant;
    }
}
