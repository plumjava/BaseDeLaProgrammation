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
class LotPeche{
 
       private static int COMPTEURLOT = 500;
 
        private int numeroLot; 
	private String idBateau;
	private double qte;
	private double pxvente;
 
	LotPeche(String idBateau,double qte){
           this.idBateau = idBateau;
           this.qte=qte;pxvente=0;
 
           COMPTEURLOT++;
           numeroLot = COMPTEURLOT;
        }
 
        public int getnumeroLot(){
          return numeroLot;
        }
 
	public String getIdBateau(){
          return idBateau;
        }
 
        public double getQte() {
           return qte;
        }
 
	public double getPxVente(){
          return pxvente;
        }
 
	public void setPxVente(double pxVente){
          this.pxvente=pxVente;
        }
}
