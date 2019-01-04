package br.com.treinaweb.main;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int acao = 1;
		ArrayList<String> historico = new ArrayList<String>();

		while (acao > 0) {
			if (acao == 1) {

				System.out.println("Digite o primeiro numero: ");
				// int numero1 = Integer.parseInt(scanner.nextLine());
				int numero1 = 0;
				try {
					numero1 = scanner.nextInt();
				} catch (NullPointerException e) {
					System.out.println(String.format(
							"Ocorreu um erro de formato: %s. O primeiro número assumira o valor 1", e.getMessage()));
					scanner.nextLine();
					numero1 = 1;
				} catch (Exception e) {
					System.out.println("Erro desconhecido.");
				}

				System.out.print("Digite a operação:");

				char operacao = scanner.next().charAt(0);
				System.out.print("Digite o segundo número: ");
				int numero2 = scanner.nextInt();
				System.out.println(String.format("%d %c %d", numero1, operacao, numero2));
				int resultado = 0;

				switch (operacao) {
				case '+':
					resultado = numero1 + numero2;
					break;
				case '-':
					resultado = numero1 + numero2;
					break;
				case '*':
					resultado = numero1 + numero2;
					break;
				case '/':
					resultado = numero1 + numero2;
				default:
					System.out.println("Operação invalida");
				}

				String entradaHistorico = String.format("%d %c %d = %d", numero1, operacao, numero2, resultado);
				historico.add(entradaHistorico);
				System.out.println(entradaHistorico);
			} else if (acao == 2) {
				System.out.println("=== Historico ===");
				System.out.println(String.format("Você ja fez %d operações", historico.size()));
				historico.forEach(itemHistorico -> System.out.println(itemHistorico));
				/*
				 * for (var i= 0; i < historico.size(); i++) {
				 * System.out.println(historico.get(i));
				 * 
				 * }
				 */
			}
			System.out.println("=== O que você deseja fazer? ===");
			System.out.println("1. Reazliar operação matemática:");
			System.out.println("2. Vizualizar historico:");
			System.out.println("0. Sair:");
			System.out.println("Sua opção:");
			acao = scanner.nextInt();
		}
		scanner.close();
	}

}