package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Prodct;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

//		Product product = new Product();

		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Price: ");
		double price = sc.nextDouble();
		System.out.println("Quantity in stock: ");
		int quantity = sc.nextInt();
		
		Prodct product = new Prodct(name, price, quantity);
		
		product.setName("Computer");
		System.out.println("update name" + product.getName());
		product.setPrice(1200.00);
		System.out.println("Update price: " + product.getPrice());

		System.out.println("Product data: " + product);

		System.out.println();
		System.out.println("Enter the number of products to be added in stoock: ");
		quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		System.out.println();
		System.out.println("Enter the number of producdts to be removed form stock:");
		quantity = sc.nextInt();
		product.removeProducts(quantity);
		
		System.out.println();
		System.out.println("Updated data: " + product);
		
		
		sc.close();
	}

}
