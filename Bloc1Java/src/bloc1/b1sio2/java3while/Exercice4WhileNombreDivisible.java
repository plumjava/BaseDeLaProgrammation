package bloc1.b1sio2.java3while;

public class Exercice4WhileNombreDivisible {

    public static void main(String[] args) {

        int nb = (int) (Math.random() * (20000 - 2 + 1)) + 2;

        while (nb % 2 == 0 | nb % 3 == 0) {

            System.out.print(nb + ";");

            nb = (int) (Math.random() * (20000 - 2 + 1)) + 2;
        }

        System.out.print(" Tirage terminé");

    }

}
