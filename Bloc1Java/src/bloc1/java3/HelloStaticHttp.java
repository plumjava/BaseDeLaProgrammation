

import java.io.BufferedReader;
import plum.console.Color;
import plum.console.Form;
import plum.http.StaticHttp;
 
public class HelloStaticHttp {
 
    public static void main(String[] args) {
 
        String line;
        try {
            BufferedReader s = StaticHttp.openURL("http://plum.boonum.fr/doku.php");
            line = s.readLine();
            while (line != null) {
                Form.printList( line, 
                                Color.GREEN_BACKGROUND, 
                                Color.YELLOW_BACKGROUND);
 
                line = s.readLine();
            }
            s.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
 
    }
 
}