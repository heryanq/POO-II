public class ModObserver implements Observer{
    
    private double n1;
    private double n2;


    @Override
    public void update(int n1,n2){
        this.valor = n1 % n2;
    }

}