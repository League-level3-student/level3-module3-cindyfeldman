package _02_Cities;

public class LosAngeles extends City{

	public LosAngeles(int population, double growthRate) {
		super(population, growthRate);
	
	}

	@Override
	double getAnnualTaxes() {
		double pop = growthRate * population;
		Double half = growthRate/2;
		Double added = pop*half;
		return added;
	}
	
}
