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
public class Chemin {

    ArrayList<Lieu> colLieu = new ArrayList();

    public Lieu getLieu(int index) {
        if (index > colLieu.size()) {
            return null;
        }

        return colLieu.get(index);
    }

    public void insereLieu(Lieu nouveauLieu, int rang) {
        if (rang > colLieu.size()) {
            colLieu.add(nouveauLieu);
            return;
        }
        
        colLieu.add(nouveauLieu);
        int fin = colLieu.size();
        for (int i = rang; i < fin; i++) {
            colLieu.add(colLieu.get(rang));
            colLieu.remove(rang);
        }

    }

    public int nbLieu() {
        return colLieu.size();
    }
}
