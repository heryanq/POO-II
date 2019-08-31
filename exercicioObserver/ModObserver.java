package exercicioobserver;

public class ModObserver implements Observer{
    
    private double result;
    private ConcreteSubject conSub;

    public ModObserver(ConcreteSubject conSub){
        this.conSub = conSub;
        this.conSub.registerObserver(this);
    }

    @Override
    public void update(double value1, double value2){
        this.result = value1 % value2;
        System.out.println("o módulo de " + value1 + " por " + value2 + " é: " + result);
    }

}