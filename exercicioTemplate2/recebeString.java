package exerciciotemplate2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

abstract class recebeString {
    
    String stringDigitada;
    String stringTratada;
    
    final void trataString() {
        criaString();
        transformarString();
        imprimeString();
    }
    
    private String criaString() {
        stringDigitada = null;
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
    
    public void imprimeString(){
        System.out.println(stringTratada);
    }
    
    

}
