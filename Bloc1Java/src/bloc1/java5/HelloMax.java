/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bloc1.java5;

/**
 *
 * @author bogusz.thierry
 */
public class HelloMax {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int max = max(-12,-30);
        System.out.println(max);
        
        System.out.println(max(12, 18));
        System.out.println(max(20, 5));
    }

    static int max(int val1, int val2) {
        //return (val1 < val2) ? val1 : val2;
        int r;
        if ( val1>val2){
            r=val1;
        }else{
            r=val2;
        }
        
        return r;
    }
}
