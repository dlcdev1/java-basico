package br.com.aula13.labs;

import java.util.Scanner;

public class exercicio11 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que peça 2 numeros inteiros e um número realcalcule e
		 * mostre: a. o produto do dobro do primeiro com metade do segundo. b. a soma do
		 * triplo do primeiro com o terceiro. c. o terceiro elevado ao cubo
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Infomre o 1° numero:");
		int number1 = scan.nextInt();
		System.out.println("Informe o 2° numero:");
		int number2 = scan.nextInt();
		System.out.println("Informe o numero real:");
		float numberReal = (float) scan.nextFloat();

		int result1 = (number1 * 2) * (number2 / 2);
		float result2 = number1 * 3 + numberReal;
		float result3 = (float) Math.pow(numberReal, 3);

		System.out.println("O produto do dobro do 1° com metade do 2°, é: " + result1);
		System.out.println("A soma do tripo do 1° com o 3°: " + result2);
		System.out.println("O 3° elevado ao cubo:" + result3);

	}

}
