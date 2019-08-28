public class TesterObserver {
    public static void main(String[] args) {

        ConcreteSubject cS = new ConcreteSubject();
        Obeserver observer1 = new Obeserver(cS);

        cS.getValor();



    }
}