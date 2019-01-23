package entities;

import com.sun.glass.ui.Pixels.Format;
import com.sun.org.apache.xml.internal.dtm.ref.IncrementalSAXSource;

public class Employee {
	
	private Integer id;
	private String name;
	private Double salary;
	public Employee(Integer id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	public double incrementSalary(double percent) {
		return salary += salary * percent / 100.0 ;
	}
	
	public String toString() {
		return id + ", " + name + " " + String.format("%.2f%n", salary) ; 
	}

}
