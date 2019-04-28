package _02_Cities;

public class Atlanta extends City{

	public Atlanta(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		
		Double dub = growthRate *2;
		Double pop = dub * population;
		
		return pop;
	}

}
