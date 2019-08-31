package exercicioobserver;

public class TesterObserver {
    public static void main(String[] args) {

        ConcreteSubject conSub = new ConcreteSubject();
        DivObserver  divOb1 = new DivObserver(conSub);
        ModObserver  modOb1 = new ModObserver(conSub);

        conSub.setValues(10,5);



    }
}