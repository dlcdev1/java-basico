package br.com.aula13.labs;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe o primeiro numero: ");
		int numero1 = scan.nextInt();
		System.out.println("Informe o segundo numero: ");
		int numero2 = scan.nextInt();
		int resultado = numero1 + numero2;
		
		System.out.println("A soma dos dois numerão é: " + resultado);
		

	}

}
