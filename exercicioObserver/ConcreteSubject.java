package exercicioobserver;

import java.util.ArrayList;

public class ConcreteSubject implements Subject {
    
    private ArrayList<Observer> observers;
    private double result;
    private double value1;
    private double value2;

    public ConcreteSubject() {
        this.observers = new ArrayList();
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
        for(Observer observer: this.observers){
            observer.update(this.value1, this.value2);
        }  
    }

    public void ValuesChanged(){
        notifyObservers();
    }

    public void setValues(double value1, double value2){
        this.value1 = value1;
        this.value2 = value2;
        ValuesChanged();
    }

}