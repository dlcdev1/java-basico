package br.com.aula13.labs;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		/* Faça um programa que calcule a área de um quadrado, em seguida mostre
		o dobro desta área para o usuario*/
		
		// formula A = L*L
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o valor dos lados: ");
		float lado = scan.nextFloat();
		
		float area = (float) Math.pow(lado, 2) * 2;
		
		System.out.println("O valor da aréa do quadrado ao dobro é: " + area);
		
		
		
		
		
	}

}
