/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloc2.sem2.Exercice.vente.criee;

/**
 *
 * @author thbogusz
 */
public class VenteCriée {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LotPeche lp1 = new LotPeche("1",10.00);
        LotPeche lp2 = new LotPeche("2",20.00);
        
        System.out.println("1=" + lp1.getnumeroLot());
        System.out.println("2=" + lp2.getnumeroLot());
    }
    
}
