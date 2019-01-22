package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Count;

public class Progran {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Count count;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		
		String holder = sc.nextLine();
		
		System.out.print("Is there na initial depositi (y/n)? ");
		char response = sc.next().charAt(0);
		
		if(response == 'y') {
			System.out.print("Enter initial deposite value: ");
			double initialDeposit = sc.nextDouble();
			count = new Count(number, holder, initialDeposit);
		}
		else {
			count = new Count(number, holder);
		}
		System.out.println();
		System.out.println("Account data: ");
		System.out.print(count);
		
		System.out.println();
		System.out.print("Enter a deposit value:  ");
		double depositValue = sc.nextDouble();
		count.deposit(depositValue);
		System.out.println("Update account data:");
		System.out.println(count);
		
		System.out.println();
		System.out.print("Enter a withdraw value:  ");
		double witthdrawValue = sc.nextDouble();
		count.withdraw(witthdrawValue);;
		System.out.println("Update account data:");
		System.out.println(count);
		
	
		sc.close();

	}

}
