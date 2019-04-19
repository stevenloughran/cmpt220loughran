//Steven Loughran 
//Lab 8
//April 19, 2019

import java.util.Scanner;

public class Triangle extends GeometricObject{
	private double side1;
	private double side2;
	private double side3;
	
	public static void main(String[] args) {
		double s1;
		double s2;
		double s3;
		String color;
		boolean fill;
		
		Scanner input = new Scanner(System.in);
		
	System.out.println("Enter color: ");
		color = input.nextLine();
	
	System.out.println("Enter sides: ");
		s1 = input.nextDouble();
		s2 = input.nextDouble();
		s3 = input.nextDouble();
		
	System.out.println("Fill triangle or not (true or false): ");
		fill = input.nextBoolean();
		
	Triangle tt = new Triangle(s1, s2, s3);
	
	tt.putcolor(color);
	tt.setFill(fill);
	
	System.out.println("Sides of " + tt.toString());
	System.out.println("Area of triangle: " + tt.getarea());
	System.out.println("Perimeter of triangle: " + tt.getperimeter());
	System.out.println("Color of the triangle is " + tt.getcolor());
	System.out.println("Is triangle filled? " + tt.isFilled());
	
	}
	public Triangle(double s1, double s2, double s3) {
		side1 = s1;
		side2 = s2;
		side3 = s3;
	}
	double getside1() {
		return side1;
	}
	double getside2() {
		return side2;
	} 
	double getside3() {
		return side3;
	}
	double getarea() {
		double s = (side1 + side2 + side3) / 2;
		double area = s * (s - side1) * (s - side2) * (s - side3);
			return area;
	}
	
	double getperimeter() {
		return (side1 + side2 + side3);
	}
	
	public String toString() {
		return "Traingle: side1 = " + side1 + ", side2 = " + side2 + ", side3 = " + side3;
		
	}
}
