package exerciciotemplate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

abstract class recebeString {
    
    String stringDigitada = null;
    
    final void trataString() {
        transformarString();
        imprimeString();
    }
    
    private String getUserInput() {
        System.out.println("Por favor, digite algo: \n");
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        try{
            stringDigitada = in.readLine();
        } catch(IOException ioe){
            System.err.println("Você não digitou nada");
        }
        
        return stringDigitada;
    }
    
    abstract String transformarString();
    
    public String imprimeString(){
        return stringDigitada;
    }
    
    

}
