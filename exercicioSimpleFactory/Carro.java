package exerciciosimplefactory;

public abstract class Carro {

    public void adicionaAcessorio(){
    System.out.println("O carro está em processo inicial de escolha de acessório.");

    }

    public void escolheCombustivel(){
    System.out.println("O tipo do combustível está sendo escolhido.");

    }

    public void escolheCor(){
    System.out.println("Definindo a cor do veículo.");

    }

    public void enviaMontagem(){
    System.out.println("Processo finalizado, o carro está sendo enviado para montadora.");

    }
}
