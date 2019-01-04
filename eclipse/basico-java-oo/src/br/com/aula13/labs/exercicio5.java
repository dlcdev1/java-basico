package br.com.aula13.labs;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		// Converter metros em centimetros.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe um numero: ");
		
		float numero = scan.nextFloat();
		float resultado = numero * 100;
		
		System.out.println("A conversão realizada é: " + resultado );

	}

}
