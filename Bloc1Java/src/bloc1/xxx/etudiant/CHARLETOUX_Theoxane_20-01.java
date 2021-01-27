/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloc1.java6;

/**
 *
 * @author Théoxane
 */
public class imprimante {
    
  /**
   * Retourne le nombre d’imprimantes libres.
   *
   * @param tLibre Tableau indiquant si une imprimante est libre
   *
   * @return Le nombre d'imprimantes disponibles
   */
  static int nbLibre( boolean tLibre[] ){
    int c = 0;
    for(int i = 0; i < tLibre.length; i++){
      if ( tLibre[i] == true ) c++;
    }
 
    return c;
  }
 
  /**
   * Retourne l'indice 
   * de la première imprimante disponible. 
   *
   * @param tLibre Tableau indiquant si une imprimante est libre
   *
   * @return L'indice de la première imprimante libre, sinon -1
   */
  static int impDisponible( boolean tLibre[] ){
      for(int i =0 ;i<tLibre.length;i++){
         if(tLibre[i]){
             return i;
         } 
      }
     return -1;
  }
 
  /**
   * Retiurne le nombre d’imprimantes proches d’une autre imprimante 
   *  ce sont les imprimantes  dont la partie "zz" de l’host-Id est identique.
   *
   * @param tImp Tableau contenant les adresses IP des imprimantes
   * @param adIP Adresse IP de référence
   *
   * @return Le nombre d'imprimante proche de adIP
   */
  static int dénombreProche( String tImp[], String adIP ){
      int c=0;
      for(int i=0; i<tImp.length;i++){
          if(tImp[i].charAt(9)== adIP.charAt(9) & tImp[i].charAt(10)== adIP.charAt(10)){
              c++;
          }
      }
     return c;
  }
 
 
  /**
   * Retourne l'indice de adImp dans tImp
   *
   * @param tImp Tableau contenant les adresses IP des imprimantes
   * @param adIP Adresse IP de référence
   *
   * @return L'indice de adIP, sinon -1
   */
  static int rechIp( String tImp[], String adIP ){
      for(int i = 0; i< tImp.length;i++){
          if(adIP.equals(tImp[i])){
              return i;
          }
      }
     return -1;
  }
 
  /**
   * L'imprimante correspondant à adIP est marquée comme occupée (libre = false).
   *
   * @param tImp Tableau contenant les adresses IP des imprimantes
   * @param tLibre Tableau indiquant si une imprimante est libre
   * @param adIP Adresse IP de référence
   *
   */
  static void réserverImp( String tImp[], boolean tLibre[], String adIP ){
      int a= rechIp(tImp,adIP);
      tLibre[a]=false;
 
  }
 
 
  /**
   * L'imprimante correspondant à adIP est marquée comme libre (libre = true).
   *
   * @param tImp Tableau contenant les adresses IP des imprimantes
   * @param tLibre Tableau indiquant si une imprimante est libre
   * @param adIP Adresse IP de référence
   *
   */
  static void libérerImp( String tImp[], boolean tLibre[], String adIP ){
      int a= rechIp(tImp,adIP);
      tLibre[a]=true;
 
  }
 
}

