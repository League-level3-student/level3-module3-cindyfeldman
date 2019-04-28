package _02_Cities;

public class Boston extends City {

	public Boston(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		Double pop = growthRate * population;
		Double s = 0.50;
		Double mult = population *s;
		Double fin = pop+mult;
		return fin;
	}

}
