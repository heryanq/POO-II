import java.util.ArrayList;

public class ConcreteSubject implements Subject {
    
    private ArrayList observers;
    private int valor;
    private int valor1;
    private int valor2;

    public ConcreteSubject() {
        observers = new ArrayList();
    }

    @Override
    public void registerObserver(Observer newObserver){
        observers.add(newObserver);
    }

    @Override
    public void removeObserver(Observer deleteObserver){
        int i = observers.indexOf(deleteObserver);
        System.out.println("Observer " + (i + 1) + " deleted");
        observers.remove(i);
    }

    @Override
    public void notifyObservers(){
        for(Observer observer: observers){
            observer.update(DivObserver, ModObserver);
        }  
    }

    public void ValorChanged(){
        getValor();
        notifyObservers();
    }

    public void getValor(){
        this.valor = valor;
    }

}