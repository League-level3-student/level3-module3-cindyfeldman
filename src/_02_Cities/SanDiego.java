package _02_Cities;

public class SanDiego extends City{

	public SanDiego(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double a = 1000000;
double pop = growthRate * population ;
double added = pop + a;
		return added ;
	}
}
