package bloc1.java5.devoirs;

public class HelloJEVoyage {

    // -------------- A/ Ecrire une fonction -----------------
    public static int rechercheVille(String tVille[],
            String uneVille) {

        int i = 0;
        boolean trouvé = false;

        while (i < tVille.length & !trouvé) {
            if (tVille[i].equals(uneVille)) {
                trouvé = true;
            } else {
                i++;
            }
        }

        return (trouvé) ? i : -1;
    }

    // -------------- B/ "Amiens" et "autre ville" -----------------
    public static void main(String[] args) {
        // B/ tests de la fonction
        String tVilleVoyage[] = {"Limoges", "Bellac", "Chateauroux", "Tours",
            "Toulouse", "Amiens", "Paris"};

        int i = rechercheVille(tVilleVoyage, "Amiens");
        System.out.println(i); // i vaut 5

        // affiche -1
        System.out.println(rechercheVille(tVilleVoyage, "Couzeix"));
    }
}
