package exercicioadapter;

public class Soma {
    
    public static void main(String[] args) {
        
        Cliente cliente1 = new Cliente(new SomadorAdapter());
        cliente1.executar();
	}
}
