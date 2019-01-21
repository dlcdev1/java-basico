package application;

import java.util.Locale;
import java.util.Scanner;

import entities.CurrencyConverter;


public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("What is the dollar price? ");
		double dolar = sc.nextDouble();
		double valorDolar = CurrencyConverter.precoDolar(dolar);
		
		System.out.print("How many dollars will be bought? ");
		double qtdDola = sc.nextDouble();
		double valorDolar1 = CurrencyConverter.qtdDolar(qtdDola);

		System.out.printf("Amount to be paid in reais = %.2f%n", valorDolar * valorDolar1);
		sc.close();

	}

}
