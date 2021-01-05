package bloc1.java5;
public class HelloLocation {

    public static void main(String[] args) {
        int tLocation[] = {100, 230, 345, 500, 650, 256};
        int moy = moyenne(tLocation);
        System.out.println("moyenne : " + moy);
    }
    
    /**
     * Calcule la moyenne des nombres d'un tableau
     * @param t tableau de nombre entiers
     * @return la moyenne
     */
    static int moyenne(int t[]) {
        int c = 0;
        for (int i = 0; i < t.length; i++) {
            c += t[i];
        }

        return c / t.length;
    }
}
