/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package devoir.seigneur.anneaux;

public class HelloProgramme {

    public static void main(String[] args) {
        ArrayList<Programme> pg = new ArrayList<Programme>();
        char menu;
        do {
            System.out.println("a- Ajouter un programme");
            System.out.println("b- Mettre à jour un programme");
            System.out.println("c- Liste des programmes");
            System.out.println("d- Nombre de programme par type");
            System.out.println("e- Modifier le type d'un programme");
            System.out.println("Q- quitter");
            menu = Clavier.lireChar("Choisir?");
            
            switch (menu) {
            .....
}
//retourne l'index du programme correspondant à programme
//dans la collection pr
//sinon retourne -1


    static int rechercher(ArrayList<Programme> pr, String programme)
}
