package br.com.aula13.labs;

import java.util.Scanner;

public class exercicio12 {

	public static void main(String[] args) {
		/*
		 * Tendo como dados de entrada a altura de uma pessoa, construa um algoritmo que
		 * calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) -58
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("Informe sua altura:");
		float altura = (float) scan.nextFloat();

		float pesoIdeal = (float) (72.7 * altura) - 58;

		System.out.println("Seu peso ideal é:" + pesoIdeal);

	}

}
