package br.com.aula13.labs;

import java.util.Scanner;

public class exercicio6 {

	public static void main(String[] args) {
		// Calculo do raio do circulo mostrar a area
		// formula A = TT * R.Math.pow(2,6)
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o valor do raio: ");
		float raio = scan.nextFloat();
		System.out.println("valor de TT é: " + Math.PI);		
		float area = (float) (Math.PI * Math.pow(raio, 2));
		
		System.out.println("O valor da área é:" + area);

	}

}
