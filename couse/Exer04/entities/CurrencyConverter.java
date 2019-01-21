package entities;

public class CurrencyConverter {
	
	public static final double PERCENT = 0.06;
	
	public static double precoDolar(double dolar) {
		return dolar;
	}
	
	public static double qtdDolar(double qtdDola) {
		return qtdDola + qtdDola * PERCENT;
	}
	

	
}
