package bar;
import adicionais.*;

public class Bar {
	
	public static void main(String[]args) {
		
		BarVerage barverage0 = new Caipira();
                barverage0 = new Kiwi(barverage0);
                barverage0 = new Gelo(barverage0);
		System.out.print("\n" + barverage0.getDescription() + " ficou R$: " + barverage0.cost() + "\n");
		
		BarVerage barverage1 = new Caipirinha();
                if (barverage1.getDescription() != barverage1.getDescription()) {
                    System.out.print("\n" + "Caipirinha é um drink pronto e seus ingredientes não podem ser alterados." );
                } else {
                    System.out.print("\n" + barverage1.getDescription() + " ficou R$: " + barverage1.cost() + "\n");
                }
                
                BarVerage barverage2 = new Caipirinha();
                barverage2 = new Kiwi(barverage2);
                if (barverage2.getDescription() != barverage2.getDescription()) {
                    System.out.print("\n" + "Caipirinha é um drink pronto e seus ingredientes não podem ser alterados." + "\n");
                } else {
                    System.out.print("\n" + barverage2.getDescription() + " ficou R$: " + barverage1.cost() + "\n");
                }
                   
		
		
	}

}
