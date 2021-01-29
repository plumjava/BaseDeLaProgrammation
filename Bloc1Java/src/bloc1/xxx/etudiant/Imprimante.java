package imprimante.java;
/**
 *
 * @author pauls
 */
public class Imprimante {
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
  static int impDisponible(boolean tLibre[]){
      int i = 0;
      while(tLibre[i]!= true && i < tLibre.length){
     i++;}
      if(i<tLibre.length){
     return i+1;
      }else{
          return -1;
      }
  }
  /**
   * Retourne le nombre d’imprimantes proches d’une autre imprimante 
   *  ce sont les imprimantes  dont la partie "zz" de l’host-Id est identique.
   *
   * @param tImp Tableau contenant les adresses IP des imprimantes
   * @param adIP Adresse IP de référence
   *
   * @return Le nombre d'imprimante proche de adIP
   */
  static int dénombreProche( String tImp[], String adIP ){
   int c=0;
   for(int i = 0; i<tImp.length; i++){
        String sT[] = adIP.split("\\.");
        String sT1[] = tImp[i].split("\\.");
        //affichage : [192, 243, zz, 45]
        if (sT[2].equals(sT1[2])){
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
      boolean bool = false;
      int i = 0;
     while(!bool && i < tImp.length){
     if(tImp[i].equals(adIP)){
         bool = true;
     }else{
         i++;
     }
             }
     if(i>=tImp.length){
         return -1;
     }else{
     return i;
     }
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
      int i = 0;
      while(i<tLibre.length){
          if(tImp[i].equals(adIP)){
              System.out.println("Imprimante trouvée : "+adIP);
              if(tLibre[i] == false){
                  System.out.println("L'imprimante est occupée.");
      }
              else{
                  System.out.println("L'imprimante est libre.");
                  tLibre[i]=false;
                  System.out.println("Imprimante réservée vous pouvez l'utiliser dès maintenant.");
          }
        }
          i++;}      
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
      int i = 0;
      while(i<tLibre.length){
          if(tImp[i].equals(adIP)){
          System.out.println("Imprimante trouvée : "+adIP);
          if(tLibre[i] == true){
              System.out.println("L'imprimante est libre.");
          }
          else{
              System.out.println("L'imprimante est occupée.");
              tLibre[i]=true;
              System.out.println("Imprimante libérée sous quelques instants veuillez patienter...");
          }
      }
          i++;
  }
 }
}