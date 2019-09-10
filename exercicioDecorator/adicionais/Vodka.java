package adicionais;

import bar.*;

public class Vodka extends DrinkDecorator {
	
	BarVerage barverage;
	
	public Vodka(BarVerage barverage) {
		this.barverage = barverage;
	}

	@Override
	public String getDescription() {
		return barverage.getDescription() + ", vodka";
	}

	@Override
	public double cost() {
		return 5.00 + barverage.cost();
	}
	
	

}
