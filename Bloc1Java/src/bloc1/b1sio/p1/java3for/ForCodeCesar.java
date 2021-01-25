package bloc1.b1sio.p1.java3for;

import plum.console.Clavier;

public class ForCodeCesar {
    public static void main(String[] args) {
        
        String texte = Clavier.lireTexte("Votre texte ?");
        int decal = Clavier.lireInt("décalage ?");
        
        String crypt="";
        
        for ( int i=0 ; i<texte.length();i++){
            char c = texte.charAt(i);
            
            if ( c < 'A' | c > 'Z'){
                crypt = crypt + c;
            }else{
                c = (char)(c + decal); // c += decal;
                if ( c > 'Z'){
                    c = (char)(c - 26);
                }
                crypt = crypt + c;
            }
        }
        
        System.out.println("Votre code de César : " + crypt);
        
        
    }    
}
