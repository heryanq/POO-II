package exerciciosimplefactory.TiposCarros;

import exerciciosimplefactory.*;

public class Celta extends Carro{

    @Override
    public void adicionaAcessorio(){
    super.adicionaAcessorio();
    System.out.println("Sem adicional");
    }
    
    @Override
    public void escolheCombustivel(){
    super.escolheCombustivel();
    System.out.println("Gasolina");
    }
    
    @Override
    public void escolheCor(){
    super.escolheCor();
    System.out.println("Branco");
    }
    
    @Override
    public void enviaMontagem(){
    super.enviaMontagem();
    System.out.println("Enviar para montadora mais próxima\n");
    }
    
    

}
