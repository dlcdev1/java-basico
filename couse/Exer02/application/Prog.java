package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Prog {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.print("Name: ");
		employee.name = sc.nextLine();
			
		
		System.out.print("Gloss salary: ");
		employee.glossSalary = sc.nextDouble();
	
		
		
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
			
		System.out.println(employee);
		
		System.out.print("Wich percentage to increase salary? ");
		
		double tax = sc.nextDouble();
		employee.increaseSalary(tax);
		
		System.out.println();
		System.out.println("Updated data: "  + employee);
		
		
		sc.close();
	}

}
