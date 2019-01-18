package entities;

public class Rectangle {

	public double width;
	public double height;

	public double area() {
		return width * height;
	}

	public double perimeter() {
		return 2 * (height + width);

	}

	public double diagonal() {
		double d;
		return d = Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
//		
	}

	public String toString() {
		return "Area = " + String.format("%.2f%n", area()) + "Perimeter = " + String.format("%.2f%n", perimeter())
				+ "Diagonal = " + String.format("%.2f%n", diagonal());

	}

}
