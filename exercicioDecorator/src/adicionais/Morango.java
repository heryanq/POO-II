package adicionais;

import bar.*;

public class Morango extends DrinkDecorator {
	
	BarVerage barverage;
	
	public Morango(BarVerage barverage) {
		this.barverage = barverage;
	}

	@Override
	public String getDescription() {
		return barverage.getDescription() + ", morango";
	}

	@Override
	public double cost() {
		return 3.00 + barverage.cost();
	}
	
	

}


