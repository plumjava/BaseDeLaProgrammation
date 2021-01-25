/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devoir.seigneur.anneaux;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author thbogusz
 */
public class TousLesChemins {

    ArrayList<Chemin> colChemin = new ArrayList();

    ArrayList<Chemin> cheminsPossibles(Lieu lieuDepart, Lieu lieuArrivée) {
        ArrayList<Chemin> col = new ArrayList();

        for (int i = 0; i < colChemin.size(); i++) {
            Chemin ch = colChemin.get(i);

            if (ch.getLieu(0).equals(lieuDepart)
                    & ch.getLieu(ch.nbLieu() - 1).equals(lieuArrivée)) {
                col.add(ch);
            }
        }

        return col;
    }

    public ArrayList<Chemin> rencontresHabitant(String habitantRecherché) {
        ArrayList<Chemin> col = new ArrayList();

        for (int i = 0; i < colChemin.size(); i++) {
            Chemin ch = colChemin.get(i);
            for (int j = 0; j < ch.nbLieu(); j++) {
                if (ch.getLieu(j).getHabitant().equals(habitantRecherché)) {
                    col.add(ch);
                    break;
                }
            }

        }

        return col;
    }

    public Chemin cheminLePlusCourt(Lieu lieuDepart, Lieu lieuArrivée) {

        ArrayList<Chemin> col = cheminsPossibles(lieuDepart, lieuArrivée);

        if (col.size() == 0) {
            return null;
        }

        Chemin minChemin = col.get(0);
        
        for (int i = 1; i < col.size(); i++) {
            Chemin ch = col.get(i);
            if (cumulDistance(ch) < cumulDistance(minChemin)) {
                minChemin = ch;
            }
        }
         
        /*
        for (int i = 1; i < col.size(); i++) {
            Chemin ch = col.get(i);
            if (ch.nbLieu() < minChemin.nbLieu()) {
                minChemin = ch;
            }
        }
*/
        return minChemin;
    }

    private int cumulDistance(Chemin chemin) {
        int distance = 0;
        for (int i = 0; i < chemin.nbLieu() - 2; i++) {
            distance += chemin.getLieu(i).distance(chemin.getLieu(i + 1));
        }
        return distance;
    }
}
