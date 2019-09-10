package adicionais;

import bar.*;

public class Cachaca extends DrinkDecorator {
	
	BarVerage barverage;
	
	public Cachaca(BarVerage barverage) {
		this.barverage = barverage;
	}

	@Override
	public String getDescription() {
		return barverage.getDescription() + ", cachaça";
	}

	@Override
	public double cost() {
		return 5.00 + barverage.cost();
	}
	
	

}
