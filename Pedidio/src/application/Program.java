package application;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Enter cliente data:");
		System.out.print("Name:");
		String name = sc.nextLine();
		System.out.print("Email:");
		String email = sc.nextLine();
		
		System.out.print("Birth date(DD/MM/YYY)");
		java.util.Date clientDate = sdf.parse(sc.next()); 
		
		Client client = new Client(name, email, clientDate);
		
		System.out.println();
		
		System.out.println("Enter order data:");
		System.out.println("Status: ");
		
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		Order order = new Order();
		System.out.print("How many items to this order?");
		int n = sc.nextInt();
		
	
		
		System.out.println();
		for(int i=1; i<=n; i++) {
			System.out.println("Enter # " + i + " item data:");
			System.out.println("Product name: ");
			sc.nextLine();
			String productName = sc.nextLine();
			System.out.println("Product price: ");
			double productPrice = sc.nextDouble();
			
			Product product = new Product(productName, productPrice);
			
			System.out.println("Qauntity: ");
			int quantity = sc.nextInt();
			
			OrderItem orderItem = new OrderItem(quantity, productPrice, product);
			order.addItem(orderItem);
					
		}
		
		System.out.println();
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);
		

		sc.close();
	}

}
