package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Hosped;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		Hosped[] vect = new Hosped[10];

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("Rent # " + (i + 1) + ":");
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int romm = sc.nextInt();

			vect[romm] = new Hosped(name, email);
		}

		System.out.println("Busy rooms:");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] != null) {
				System.out.print(i + ": ");
				System.out.print(vect[i].getName() + ", ");
				System.out.print(vect[i].getEmail());
				System.out.println();
			}

		}

		sc.close();
	}

}
