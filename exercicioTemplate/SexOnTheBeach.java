package exerciciotemplate;

import exerciciotemplate.Cardapio;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SexOnTheBeach extends Cardapio{
    
    public void escolherAlcoolicos(){
        System.out.println("*Licor de laranja e vodka*");
    }
    
    public void escolherMistura(){
        System.out.println("*Suco de pêssego e suco cranberry*");
    }
    
    public void escolherAdicionais(){
        System.out.println("*Gelo*");
    }
    
    public boolean clienteQuerTrocarCopo(){
        String answer = getUserInput();
        if (answer.toLowerCase().startsWith("s")){
            return true;
        } else {
            return false;
        }
    }

    private String getUserInput() {
        String answer = null;
        System.out.println("Você por um acaso quer a bebida em um copo plástico?");
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        try{
            answer = in.readLine();
        } catch(IOException ioe){
            System.err.println("Desculpe, nã entendi sua resposta, pode repetir?");
        }
        
        if (answer == null){
            return "não";
        }
        
        return answer;
    }
    
    public void colocarNoCopoPlastico() {
        System.out.println("*Colocando bebida no copo plástico*");
    }
    
}