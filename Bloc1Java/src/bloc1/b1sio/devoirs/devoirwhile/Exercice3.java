package bloc1.b1sio.devoirs.devoirwhile;

import plum.console.Clavier;

public class Exercice3 {
    public static void main(String[] args) {
        
        int c = 0;
        int alea = (int)(Math.random()*200)+1;
        
        char ordre = Clavier.lireChar("Ordre ?");
        
        while ( ordre != 'F'){
            switch (ordre){
                case 'g':
                    System.out.println("Tourner à gauche");
                    break;
                case 'd':
                    System.out.println("Tourner à droite");
                    break;
                case 'r':
                    System.out.println("Reculer");
                    break;
                case 'a':
                    System.out.println("Avancer");
                    break;
                default:
                case 's':
                    System.out.println("Stopper");
                    break;         
            }          
            ordre = Clavier.lireChar("Ordre ?");
        }
        
        System.out.println("Fin du programme...");
    }
    
}