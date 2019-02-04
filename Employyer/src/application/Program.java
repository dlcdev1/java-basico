package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employyer;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		List<Employyer> list = new ArrayList<>();
		
		for(int i=1; i<=n; i++) {
			
			System.out.println("Employee #" + i + ":");
			
			System.out.print("Id:");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name:");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			list.add(new Employyer(id, name, salary));			
		}
		
		System.out.print("Enter the employee id that will have salary incrase : ");
		int id = sc.nextInt();
		
		Employyer result = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		
		if (result == null) {
			System.out.println("this id does not exist!");
		} else {
			System.out.println("Enter the percentage");
			double percentage = sc.nextDouble();
			result.percentSalary(percentage);
		}

		System.out.println();
		System.out.println("list of employees: ");
		for(Employyer obj : list) {
			System.out.println(obj);
		}
		
		sc.close();
	}

}
