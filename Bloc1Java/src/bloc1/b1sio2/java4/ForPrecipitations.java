package bloc1.b1sio1.java4;

import plum.console.Menu;
import plum.tableau.*;

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
                    Tableau.initInteger(précip, 25, 5200);
                    break;
                case 'b':
                    int total = 0;
                    for (int i = 0; i < précip.length; i++) {
                        total = total + précip[i];
                    }
                    System.out.println("total=" + total);
                    break;
                case 'c':
                    int min = précip[0];
                    int max = précip[0];

                    for (int i = 0; i < précip.length; i++) {
                        if (précip[i] < min) {
                            min = précip[i];
                        }

                        if (précip[i] > max) {
                            max = précip[i];
                        }
                    }

                    System.out.println("min=" + min + "**max=" + max);
                    break;
                case 'd':
                    int totalm = 0;
                    for (int i = 0; i < précip.length; i++) {
                        totalm = totalm + précip[i];
                    }
                    
                    int moyenne = totalm / précip.length;
                    
                    int c=0;
                    for (int i = 0; i < précip.length; i++) {
                        if ( précip[i] > moyenne ){
                            c++;
                        }
                    }
                    System.out.println("> à la moyenne = " + c);
                    
                    
                    
                    
                    break;
            }

        } while (menu != 'Q');

    }

}
