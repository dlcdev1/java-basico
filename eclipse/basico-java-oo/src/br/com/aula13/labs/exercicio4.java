package br.com.aula13.labs;

import java.util.Scanner;

public class exercicio4 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe a primeira nota: ");
		double nota1 = scan.nextDouble();

		System.out.println("Informe a segunda nota: ");
		double nota2 = scan.nextInt();

		System.out.println("Informe a terceira nota: ");
		double nota3 = scan.nextInt();

		System.out.println("Inform a quarta nota: ");
		double nota4 = scan.nextInt();

		double resultado = nota1 + nota2 + nota3 + nota4;
		double media = resultado / 4;
		
		System.out.println("Total das quatro notas é: " + resultado);
		System.out.println("A média das notas são: " + media);

	}

}
