/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloc1.b1sio1.java4;

import java.util.Arrays;
import plum.console.Menu;
import plum.tableau.*;
import plum.console.Clavier;
import java.util.Arrays;
import plum.console.Menu;
import plum.tableau.*;
public class ForTirageDéSwitchP1Sol1 {

    public static void main(String[] args) {
        int[] tTirage;
        tTirage = new int[100];
        int[] tComp;
        tComp = new int[6];

        char menu;
        do {
            String[] smenu = {"Effectuer le tirage",
                "Resulat tirage"};
            menu = Menu.show("ForTirageDé", smenu);
            switch (menu) {
                case 'a':
                    Tableau.initInteger(tTirage, 1, 6);
                    break;
                case 'b':
                    for (int i = 0; i < tTirage.length; i++) {
                        int j=tTirage[i]-1;
                        tTirage[i]++;
                            
                    }
                    for ( int i=0; i<tComp.length;i++){
                        System.out.println("Nombre de " + (i+1) + " : " + tComp[i]);
                    }
                    

            }

        } while (menu != 'Q');
    }
}
