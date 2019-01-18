package entities;

public class Product {

	public String name;
	public double price;
	public int quantity;

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity1) {
		this.quantity += quantity1;
	}

	public void removeProducts(int quantity2) {
		this.quantity -= quantity2;
	}
	
	public String toString() {
		return name 
				+ ", $" 
				+ String.format("%.2f", price) 
				+ ", " 
				+ quantity 
				+ " units, Total: $ " 
				+ String.format("%.2f", totalValueInStock());
	}
}
