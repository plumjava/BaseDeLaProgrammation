package bloc1.java2;

import plum.console.Clavier;

public class SuiteDeMot {
   public static void main(String[] args) {   
 
     char c = Clavier.lireChar("Saisir une lettre ?");
 
     switch ( c ) {
 
       case 'a':	
         System.out.println("abris");
         System.out.println("abysse");
 
       case 'b':	
         System.out.println("bus");
         break;
 
        case 'd'	:	
          System.out.println("dalhia");
          break;
 
        default	: 	
          System.out.println("Erreur sur le caractère choisi");
     }
   }
}