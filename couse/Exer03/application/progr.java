package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class progr {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		Student student = new Student();
	
		System.out.println("Pass name: ");
		student.nome = sc.nextLine();
		
		System.out.println("Pass N1");
		student.n1 = sc.nextDouble();
		
		System.out.println("Pass N2");
		student.n2 = sc.nextDouble();
		
		System.out.println("Pass N3");
		student.n3 = sc.nextDouble();
				
		
		System.out.println(student);
		sc.close();
	}

}
