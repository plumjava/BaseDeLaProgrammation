package bloc1.b1sio2.java3for;

import plum.console.Menu;
import plum.tableau.Tableau;
 
public class ForPrecipitations {
 
    public static void main(String[] args) {
        //...
        int[] précip;
        précip = new int[360];
        
        char menu;
        do {
            String[] smenu = {"Initialiser precip",
                "Total des précipitation",
                "Minimum et maximum des précipitations",
                "Nombre de précipitations > moyenne"};
 
            menu = Menu.show("ForPrecipitations", smenu);
 
            switch (menu) {
                case 'a':
                    Tableau.initInteger(précip,25,5200);
                    break;
                case 'b':
                    int somme = 0;
                    for (int i = 0; i < précip.length; i++){
                        somme = somme + précip[i];
                    }
                    System.out.println("somme=" + somme);
                    break;
                case 'c':
                    break;
                case 'd':
                    break;
            }
 
        } while (menu != 'Q');
 
    }
 
}
