package adicionais;

import bar.*;

public class Gelo extends DrinkDecorator {
	
	BarVerage barverage;
	
	public Gelo(BarVerage barverage) {
		this.barverage = barverage;
	}

	@Override
	public String getDescription() {
		return barverage.getDescription() + ", gelo";
	}

	@Override
	public double cost() {
		return 0.00 + barverage.cost();
	}
	
	

}
