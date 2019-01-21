package entities;

public class Count {
	private int nCount;
	private String Name;
	private char deposit;
	public double balance;
	
	public Count() {
		
	}
	
	public Count(int nCount, String name, char deposit, double balance) {
		this.nCount = nCount;
		Name = name;
		this.deposit = deposit;
		this.balance = balance;
	}

	public int getnCount() {
		return nCount;
	}

	public void setnCount(int nCount) {
		this.nCount = nCount;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public char isDeposit() {
		return deposit;
	}

	public void setDeposit(char deposit) {
		this.deposit = deposit;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	

	

}
