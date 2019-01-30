package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Produtc;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
			
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		
		Produtc product = new Produtc();
		
		System.out.println("Product data:" + product);
		
		System.out.print("Enter the number of products to be adde in stock: ");
		int add = sc.nextInt();
		product.addProducts(add);
		System.out.println();
		System.out.println("Update data: " + product);
		
		System.out.print("Enter the number of products to be removed from stock: ");
		int remove = sc.nextInt();
		product.removeProducts(remove);
		System.out.println();
		System.out.println("Updated data: " + product);
		
		
		sc.close();
	}

}
