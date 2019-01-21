package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Count;

public class Progran {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
//		Count count = new Count();
		
		System.out.print("Enter account number: ");
		int nCount = sc.nextInt();
		
		System.out.println("Enter account holder: ");
		String name = sc.next();
		
		System.out.println("Is there na initial depositi (y/n)");
		char deposit = sc.next().charAt(0);
		
		if(deposit =='y') {
			System.out.println("Enter initial deposit value:");
			double balance = sc.nextDouble();
		} 
		
		Count count = new Count(nCount, name, deposit, balance);	
		
		System.out.println("data:");
		
		System.out.print("Acount 7801," + nCount + "Holder " + name + " Balance: $" + balance);
		
		
		
		
		 
		 
		 
		 
		sc.close();

	}

}
