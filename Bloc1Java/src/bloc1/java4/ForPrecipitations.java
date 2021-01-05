package bloc1.java4;

import plum.console.Menu;

public class ForPrecipitations {

    public static void main(String[] args) {
        //...
        char menu;
        do {
            String[] smenu = {"Initialiser precip",
                "Total des précipitation",
                "Minimum et maximum des précipitations",
                "Nombre de précipitations > moyenne"};

            menu = Menu.show("ForPrecipitations", smenu);

            System.out.println(menu);
            switch (menu) {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
            }
        } while (menu != 'Q');

    }

}
