package bar;
import adicionais.*;

public class Bar {
	
	public static void main(String[]args) {
		
		BarVerage barverage0 = new Caipira();
		System.out.print("\n" + barverage0.getDescription() + " ficou R$: " + barverage0.cost());
		
		
		
		BarVerage barverage1 = new Caipira();
		barverage1 = new Vodka(barverage1);
		barverage1 = new Morango(barverage1);
		barverage1 = new Acucar(barverage1);
		System.out.print("\n" + barverage1.getDescription() + " ficou R$: " + barverage1.cost());
		
		
		
	}

}
