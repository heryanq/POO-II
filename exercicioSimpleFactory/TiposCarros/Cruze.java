package exerciciosimplefactory.TiposCarros;

import exerciciosimplefactory.*;

public class Cruze extends Carro{

    @Override
    public void adicionaAcessorio(){
    super.adicionaAcessorio();
    System.out.println("Parabrisa reforçado");
    }
    
    @Override
    public void escolheCombustivel(){
    super.escolheCombustivel();
    System.out.println("Flex");
    }
    
    @Override
    public void escolheCor(){
    super.escolheCor();
    System.out.println("Preto");
    }
    
    @Override
    public void enviaMontagem(){
    super.enviaMontagem();
    System.out.println("Enviar para montadora em Joinville/SC\n");
    }
    
    

}
