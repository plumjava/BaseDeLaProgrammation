package slam4.revision3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;

/**
 *
 * @author theos
 */
public class VenteCriee {
    
        //déclarer la collection lesLots de type LotPeche (à aire)
        private ArrayList<LotPeche> lesLots;
        // Déclarer le champ statique PRIX_MINIMUM (à faire)
        public static double PRIX_MINIMUM ;
    
        public VenteCriee(double pxMinimum){
            PRIX_MINIMUM = pxMinimum;
            lesLots = new ArrayList();    
        }
 
	public void ajouterLot(String idBateau, double qte){
            lesLots.add( new LotPeche(idBateau, qte));
        }
 
	public int venteSuivante(){
            int a = lesLots.size();
            for(int i=0;i<a;i++){
                if(lesLots.get(i).getPxVente()==0){
                    return i;
                }
            }
            return -1; 
        }
 
	public LotPeche lire(int indice){
            
            return lesLots.get(indice);
        }
 
	public int cardinal(){
            return lesLots.size();
        }
 
	public int venteEnchere(double pxMaximum){
            double px = (Math.random()*(pxMaximum-PRIX_MINIMUM+1)+PRIX_MINIMUM);
            
            int i = venteSuivante();
            if ( i == -1 ) return -1;
            
            LotPeche p = lesLots.get(i);
            p.setPxVente(px);
            return i;
            //double i=setPxVente(px);
            
            
        }
}


