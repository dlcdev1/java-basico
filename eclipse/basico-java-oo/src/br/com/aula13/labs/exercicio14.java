package br.com.aula13.labs;

import java.util.Scanner;

public class exercicio14 {

	public static void main(String[] args) {
		/* Faça um programa que peça o tamanho de um arquivo para download (em MB) e a velocidade de um link de internet
		 * (em Mbps), calcule e informe o tempo aproximado de download do arquivo usando este link (em minutos).
		 */
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Informe a sua velocidade de internet:");
		double link = scan.nextDouble();
		System.out.println("Infomre o tamanho do aquivo:");
		double arquivo = scan.nextDouble();
		double velocidadeSegundos = (link / 0.008);
		double velocidadeMinuto = (arquivo * 1000) / velocidadeSegundos;
		
		
		System.out.println("Velocidade do link é:"+ velocidadeSegundos +"Kbps");
		System.out.println("Velocidade do download é: "+ velocidadeMinuto / 60 + "Minutos");
	}

}
