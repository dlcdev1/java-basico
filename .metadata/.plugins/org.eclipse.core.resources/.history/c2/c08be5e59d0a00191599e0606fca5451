package br.com.aula20;

import java.util.Random;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Exer4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[][] compromisso = new String[31][24];
		boolean sair = false;
		int opcao;

		while (!sair) {
			System.out.println("1 - adicionar compromisso");
			System.out.println("2 - verificar compromisso ");
			System.out.println("0 - para sair.");

			opcao = scan.nextInt();

			if (opcao == 1) {
				boolean diaValido = false;
				int dia = 0;
				while (!diaValido) {
					System.out.println("Entre com o dia do mês");
					dia = scan.nextInt();
					if (dia > 0 && dia <= 31) {
						diaValido = true;
					} else {
						System.out.println("Dia inválido, digite novamente");
					}

				}
				boolean horaValida = false;
				int hora = 0;
				while (!horaValida) {
					System.out.println("Entre com a hora");
					hora = scan.nextInt();
					if (hora > 0 && hora <= 24) {
						horaValida = true;
					} else {
						System.out.println("Hora inválida, digite novamente");
					}
				}
				dia--;
				System.out.println("Digite o compromisso:");
				compromisso[dia][hora] = scan.next();

			}
		}
	}
}
