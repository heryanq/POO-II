public class DivObserver implements Observer{

    private double n1;
    private double n2;

    @Override
    public void update(int valor){
        this.valor = n1 / n2;
    }



}