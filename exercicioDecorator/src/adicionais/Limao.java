package adicionais;

import bar.*;

public class Limao extends DrinkDecorator {
	
	BarVerage barverage;
	
	public Limao(BarVerage barverage) {
		this.barverage = barverage;
	}

	@Override
	public String getDescription() {
		return barverage.getDescription() + ", limão";
	}

	@Override
	public double cost() {
		return 1.00 + barverage.cost();
	}
	
	

}
