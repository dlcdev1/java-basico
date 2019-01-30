package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int count=0;
		double media=0;
		System.out.println("Qtd pessoas");
		int n = sc.nextInt();
		
		double [] vet = new double[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("Informe a altura: ");
			vet[i] = sc.nextDouble();
			count++;
		}
		
		System.out.println();
		
		for(int i=0; i<n; i++) {
			media += vet[i];
		}
		
		System.out.print("A altura média é de: " + (media / n));
		
		
		
		
		
		sc.close();

	}

}
