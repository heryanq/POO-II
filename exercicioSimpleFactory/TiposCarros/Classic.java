package exerciciosimplefactory.TiposCarros;

import exerciciosimplefactory.*;

public class Classic extends Carro{

    @Override
    public void adicionaAcessorio(){
    super.adicionaAcessorio();
    System.out.println("Estepe extra");
    }
    
    @Override
    public void escolheCombustivel(){
    super.escolheCombustivel();
    System.out.println("Flex");
    }
    
    @Override
    public void escolheCor(){
    super.escolheCor();
    System.out.println("Azul marinho");
    }
    
    @Override
    public void enviaMontagem(){
    super.enviaMontagem();
    System.out.println("Enviar para montadora em Florianópolis/SC\n");
    }
    
    

}
