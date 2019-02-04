package entities;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Hospeds[] vect = new Hospeds[10];

		System.out.println("How many rooms will be rentend: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println("Rent #" + i);

			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();

			System.out.print("Email: ");
			String email = sc.nextLine();

			System.out.print("Room: ");
			int rooms = sc.nextInt();

			vect[rooms] = new Hospeds(name, email);
		}

		System.out.println();
		System.out.println("Busy rooms");
		for (int i = 0; i < vect.length; i++) {

			if (vect[i] != null) {
				System.out.print(i + ": " + vect[i].getNome() + ", " + vect[i].getEmail());
				System.out.println();

			}

		}

		sc.close();

	}

}
