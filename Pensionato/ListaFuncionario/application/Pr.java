package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Pr {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		List<Employee> list = new ArrayList<>();
		
		// realizar a população da lista com os dados solicitados
		for(int i=0; i<n; i++) {
			
			System.out.println("Employee #" + (i+1));
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();

			list.add(new Employee(id, name, salary)); 
				
		}
		
		
		//Second part
		
		System.out.print("Enter the employee id that will salary increase: ");
		int id = sc.nextInt();
		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if(emp == null) {
			System.out.println("This id does not exist!");
			
		} else {
			System.out.println("Enter the percentage:");
			double percent = sc.nextDouble();
			emp.incrementSalary(percent);
		}
		

		System.out.println();
		System.out.println("List of employees");
		for(Employee obj : list) {
			System.out.print(obj);
		}
//		
		System.out.println();

		sc.close();
	}

}
