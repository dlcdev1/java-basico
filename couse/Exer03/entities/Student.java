package entities;

public class Student {

	public String nome;
	public double n1;
	public double n2;
	public double n3;
//	public boolean pass;

	public double notaStudent() {
		double result;
		return result = n1 + n2 + n3;
	}

	public Object notaFinal() {
		if (notaStudent() >= 90.00) {
			return notaStudent() + "PASS";
			
		} else {
			return notaStudent() 
					+ "\nFAILED \n" 
					+ "MISSING " + String.format("%.2f%n",(notaStudent()) -(+ 60.00));
		}
	}

	public String toString() {
		return "FINAL GRADE = " + notaFinal();
	}

}
