package bar;

import adicionais.*;

public class Caipirinha extends BarVerage {
    
        BarVerage barverage;
        
	public Caipirinha() {
		description = "Chama na caipirinha, que é por padrão: cachaça, limão e gelo";
	}
	
	@Override
	public double cost() {
		return 15.00;
	}
	
	

}
