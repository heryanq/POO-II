package exerciciotemplate;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Caipirinha extends Cardapio{
    
    public void escolherAlcoolicos(){
        System.out.println("*Cachaça*");
    }
    
    public void escolherMistura(){
        System.out.println("*Sem mistura*");
    }
    
    public void escolherAdicionais(){
        System.out.println("*Gelo e limão*");
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
