package exerciciosimplefactory;

public class LojaCarros {
    
    SimpleCarroFactory factory;

    public LojaCarros(SimpleCarroFactory factory) {
    this.factory = factory;

}

public void pedirCarro(String type){
    Carro carro;
    carro = factory.createCarro(type);
    carro.adicionaAcessorio();
    carro.escolheCombustivel();
    carro.escolheCor();
    carro.enviaMontagem();
    }
}
