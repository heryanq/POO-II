package exerciciosimplefactory.TiposCarros;

import exerciciosimplefactory.*;

public class Captiva extends Carro{

    @Override
    public void adicionaAcessorio(){
    super.adicionaAcessorio();
    System.out.println("Teto solar");
    }
    
    @Override
    public void escolheCombustivel(){
    super.escolheCombustivel();
    System.out.println("Flex");
    }
    
    @Override
    public void escolheCor(){
    super.escolheCor();
    System.out.println("Rosa choque");
    }
    
    @Override
    public void enviaMontagem(){
    super.enviaMontagem();
    System.out.println("Enviar para montagem em Araquari/SC (PRIORIDADE)\n");
    }
    
    

}
