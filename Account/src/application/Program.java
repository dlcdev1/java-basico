package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double amount;

		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();

		System.out.print("Is there na initial deposit(y/n)");
		char scolha = sc.next().charAt(0);

		Account account = new Account();

		if (scolha == 'y') {
			System.out.print("Enter initial deposite value:  ");
			amount = sc.nextDouble();

			account.deposit(amount);

		}

		System.out.println();
		System.out.println("Account data:");
		System.out.println(account);

		System.out.println();

		System.out.print("Enter a deposit value: ");
		amount = sc.nextDouble();
		account.deposit(amount);

		System.out.println("Update data: ");
		System.out.println(account);

		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdraw = sc.nextDouble();
		account.withdraw(withdraw);

		System.out.println("Update data: ");
		System.out.println(account);

		sc.close();
	}

}
