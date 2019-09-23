package exerciciosimplefactory;

public class pedidoCarro {
    
    public static void main(String[] args) {
        
        SimpleCarroFactory scf = new SimpleCarroFactory();
        LojaCarros lc = new LojaCarros(scf);
        lc.pedirCarro("CRUZE");
        lc.pedirCarro("celta");



 }

}
