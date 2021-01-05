package bloc1.java1;

import plum.console.Clavier;

public class Retrait {
  public static void main( String[] args ) {
 
   double retrait = Clavier.lireDouble( "retrait?" );
   double solde = Clavier.lireDouble( "solde?" );
 
   // Vérifier le solde
   if ( retrait < solde ) {
      System.out.println( "retrait accepté" );
   } else {
      System.out.println( "retrait refusé" );
   }
}
}