/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple.iteration;

import java.io.BufferedReader;
import plum.console.Color;
import plum.console.Form;
import plum.http.StaticHttp;

public class HelloStaticHttp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        String line;
        try {
            BufferedReader s = StaticHttp.openURL("http://plum.boonum.fr/doku.php?id=personnel:accueil");
            line = s.readLine();
            while (line != null) {
                //System.out.println(line);
                Form.printList( line, Color.GREEN_BACKGROUND, Color.YELLOW_BACKGROUND);
                line = s.readLine();
            }
            s.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
