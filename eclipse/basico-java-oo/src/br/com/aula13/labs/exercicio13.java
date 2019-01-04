package br.com.aula13.labs;

import java.util.Scanner;

public class exercicio13 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que pergunte quanto você ganha por horar e o número de horas
		 * trabalhadas no mês Calcule e mostre o total do seu salário no referido mês,
		 * sabendo-se que são descontados 11% ara o Imposto de Renda, 8% para o INSS e
		 * 5% para o sindicado, faça um programa que nos dê: .salário bruto. a. quanto
		 * pagou ao INSS. b. quanto pagou ao sindicato. c. o salário líquido. d. calcule
		 * os descontos e o salario liquido, conforme a tabela + Salário Bruto : R$ -
		 * IR(11%) : R$ - INSS ()8% : R$ - Sindicato (5%): R% = Salário Liquido : R$
		 * obs.: Salário Bruto - Descontos = Salário Líquido.
		 */

		Scanner scan = new Scanner(System.in);

		System.out.println("========INFORMAR DADOS=======");
		System.out.println("Valor da hora trabalhada:");
		double horaTrab = scan.nextDouble();
		System.out.println("Horas trabalhadas mês");
		int horaMes = scan.nextInt();
		double totalSalario = horaTrab * horaMes;
		double totalIr = totalSalario * 11 / 100;
		double totalInss = totalSalario * 8 / 100;
		double totalSindi = totalSalario * 5 / 100;
		double totalSalLiquido = totalSalario - totalIr - totalInss - totalSindi;

		System.out.println("Salario Bruto é: R$" + totalSalario);
		System.out.println("Desconto IR: R$" + totalIr);
		System.out.println("Desconto INSS: R$" + totalInss);
		System.out.println("Desconto Sindicato: R$ " + totalSindi);

		System.out.println("Salario liquido é de: R$" + totalSalLiquido);

	}

}
