package exerciciotemplate;

public class Bar {
    
    public static void main(String[] args) {
        
        Caipirinha caipirinha = new Caipirinha();
        Mojito mojito = new Mojito();
        SexOnTheBeach sotb = new SexOnTheBeach();
        
        System.out.println("Bebida escolhida: " + Caipirinha.class.getSimpleName() + "\n");
        caipirinha.prepararDrink();
        System.out.println("Bebida escolhida: " + Mojito.class.getSimpleName() + "\n");
        mojito.prepararDrink();
        System.out.println("Bebida escolhida: " + SexOnTheBeach.class.getSimpleName() + "\n");
        sotb.prepararDrink();
        
        
    }
    
}
