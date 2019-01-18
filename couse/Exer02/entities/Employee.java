package entities;

public class Employee {

	public String name;
	public double glossSalary;
	public double tax;

	public double netSalary() {
		return glossSalary - tax;
	}

	public void increaseSalary(double tax) {
		this.glossSalary = ((glossSalary / 100) * tax) + glossSalary;
	}

	public String toString() {
		return "Employee: " + name + ", $ " + String.format("%.2f%n ", netSalary());

	}

}
