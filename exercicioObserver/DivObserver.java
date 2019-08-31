package exercicioobserver;

public class DivObserver implements Observer{

    private double result;
    private ConcreteSubject conSub;

    public DivObserver(ConcreteSubject conSub){
        this.conSub = conSub;
        this.conSub.registerObserver(this);
    }

    @Override
    public void update(double value1, double value2){
        this.result = value1 / value2;
        System.out.println("A divisão de " + value1 + " por " + value2 + " é: " + result);
    }




}