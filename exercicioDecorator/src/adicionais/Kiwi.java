package adicionais;

import bar.*;

public class Kiwi extends DrinkDecorator {
	
	BarVerage barverage;
	
	public Kiwi(BarVerage barverage) {
		this.barverage = barverage;
	}

	@Override
	public String getDescription() {
		return barverage.getDescription() + ", kiwi";
	}

	@Override
	public double cost() {
		return 3.00 + barverage.cost();
	}
	
	

}
