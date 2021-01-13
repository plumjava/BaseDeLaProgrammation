package bloc1.java5;

import plum.console.Clavier;

public class max {

    public static void main(String[] args) {
        int nb1 = Clavier.lireInt("Entrer un nombre : ");
        int nb2 = Clavier.lireInt("Entrer un autre nombre : ");
        int maximum = max(nb1, nb2);
        System.out.println("Le plus grand nombre est : " + maximum);
    }

    static int max(int val1, int val2) {
        if (val1 > val2) {
            return val1;
        } else {
            return val2;
        }
    }

}
//GARLASCHI Lucas