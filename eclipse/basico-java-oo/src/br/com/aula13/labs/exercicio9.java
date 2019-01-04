package br.com.aula13.labs;

import java.util.Scanner;

public class exercicio9 {

	public static void main(String[] args) {
		// Faça um programa que peça a temperatura em graus Farenheit, transforme e mostre a temperatura em graus Celsius.
		// c = (5 * (F-32) / 9)
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Informe a temperatura: ");
		float farenheit = (float) scan.nextFloat();
		
		//float celsius = (float) ((farenheit - 32) / 1.8); também funciona formula reduzida
		float celsius = (float) (5 * (farenheit -32 ) / 9);
		System.out.println("A temperatura é: " + celsius+"°C");
		

	}

}
