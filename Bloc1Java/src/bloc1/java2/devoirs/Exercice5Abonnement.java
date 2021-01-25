/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloc1.java2.devoirs;

import plum.console.Clavier;

/**
 *
 * @author thbogusz
 */
public class Exercice5Abonnement {
    public static void main(String[] args) {
        double PX_CONCERT = 25;
        double PX_OPERA = 30;
        double PX_DANSE = 20;

        int concert = Clavier.lireInt("Concert ? ");
        int opera = Clavier.lireInt("Opéra ? ");
        int danse = Clavier.lireInt("Danse ? ");

        double totalHorsReduction = concert * PX_CONCERT
                + opera * PX_OPERA
                + danse * PX_DANSE;

        int nbSpectacleTotal = concert + opera + danse;

        double txReduction = 0;
        String formule = "";

        switch (nbSpectacleTotal) {
            case 3:
                txReduction = 0.05;
                formule = "Liberté";
                break;
            case 4:
                txReduction = 0.10;
                formule = "Opéra";
                break;
            case 5:
                txReduction = 0.15;
                formule = "Danse";
                break;
        }

        switch (formule) {
            case "":
                System.out.println("A payer : " + totalHorsReduction);
                break;
            default:
                System.out.println("Formule : " + formule);
                System.out.println("Taux de réduction : " + txReduction * 100 + "%");

                double mtReduction = totalHorsReduction * txReduction;
                double aPayer = totalHorsReduction - mtReduction;

                System.out.println("Montant réduction :" + mtReduction);
                System.out.println("A paye : " + aPayer);
        }
        
       
        //Pour des calculs financier voir BigDecimal...
        //Pour les formats voir DecimalFormat...
    }

}
