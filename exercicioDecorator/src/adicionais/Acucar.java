package adicionais;

import bar.*;

public class Acucar extends DrinkDecorator {
	
	BarVerage barverage;
	
	public Acucar(BarVerage barverage) {
		this.barverage = barverage;
	}

	@Override
	public String getDescription() {
		return barverage.getDescription() + ", açúcar";
	}

	@Override
	public double cost() {
		return 1.00 + barverage.cost();
	}
	
	

}
