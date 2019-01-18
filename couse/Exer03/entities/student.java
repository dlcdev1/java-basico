package entities;

public class student {
	
	public String nome;
	public double n1;
	public double n2;
	public double n3;
	public boolean pass;
	
	public double notaStudent() {
		double result;
		return result =  n1 + n2 + n3;
	}
	
	public void notaFinal() {
		if(notaStudent() <=90.00) {
			pass = true;
		} else {
			pass = false;
		}
	}
	
	public void pass() {
		if(pass = true) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			System.out.println("MISSING" + (notaStudent() - 90.00));
		}
		
	}
		
	

	public String toString() {
		return "";
	}
	
	

}
