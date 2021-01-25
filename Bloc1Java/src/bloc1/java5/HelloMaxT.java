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
public class HelloMaxT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] tval={12,52,85,1,3};
        System.out.println(maxT(tval));
    }
    
    static int maxT ( int t[] ){
        int maxv = t[0];
        for (int i=0; i< t.length; i++){
            maxv = max (maxv, t[i]);
        }
        return maxv;
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
