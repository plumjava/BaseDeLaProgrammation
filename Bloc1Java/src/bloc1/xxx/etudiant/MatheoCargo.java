package bloc1.xxx.etudiant;

public class MatheoCargo {
     
 /**
 *
 * Rechercher cargo dans le tableau tCargo
 *
 * @param tCargo Tableau mémorisant la liste des cargos
 * @param cargo  Nom du cargo à rechercher
 *
 * @return
 *    l'indice du cargo dans tCargo
 *    -1 si le cargo n'existe pas dans tCargo
 *
 */
 public static int rechercher(String tCargo[],String cargo){
     int finder = -1;
     int i = 0;
     while ( i<tCargo.length & finder == -1){
            if (tCargo[i] == cargo){
                finder = i;
            }else{
                i++;
            }
        }
        return finder;
 }
 
 /**
 *
 * retourne le nombre de cargos se trouvant à moins de d milles du Havre
 *
 * @param tDistance Tableau mémorisant la distance de chaque cargo par rapport au Havre
 * @param d  Nombre de milles par rapport au Havre
 *
 * @return
 *    Le nombre de cargo se trouvant à moins de d milles du Havre
 *
 */
 public static int nbDistance(int tDistance[],int d){
     int c = 0;
     for(int i = 0 ; i < tDistance.length ; i++){
         if(tDistance[i] > d){
             c++;
         }
     }
     return c;
 } 
 
/**
 *
 * Modifie la distance d'un cargo dans tDistance
 *
 * @param tCargo Tableau mémorisant la liste des cargos
 * @param tDistance Tableau mémorisant la distance de chaque cargo par rapport au Havre
 * @param cargo  Nom du cargo dont on veut modifier la distance
 * @param newDistance  Nouvelle distance de cargo
 *
 */
 public static void modifDistance(String tCargo[], int tDistance[],String cargo, int newDistance){
     int i = 0;
     while(i < tCargo.length && !tCargo[i].equals(cargo)){
         i++;
     }
     if(i != tCargo.length){
         tDistance[i] = newDistance;
     }
 }  
 
/**
 *
 * Calcule le nombre d'heures nécessaires avant le retour d'un cargo
 *
 * Règle de calcul : Le nombre d'heure=distance/25, on retourne une valeur entière
 *
 * @param tCargo Tableau mémorisant la liste des cargos
 * @param tDistance Tableau mémorisant la distance de chaque cargo par rapport au Havre
 * @param cargo  Nom du cargo dont on veut calculer le temps d'arrivée
 *
 * @return
 *    retourne le nombre d'heures nécessaires au retour d'un cargo
 */
 public static int nbHeureRetour(String tCargo[],int tDistance[], String cargo){
    int heure = 0;
    int i = 0;
    while(i < tCargo.length && !tCargo[i].equals(cargo)){
        i++;
    }
    if(i != tCargo.length){
        heure = tDistance[i]/25;
    }
    return heure;
 }
}

