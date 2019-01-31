// Steven Loughran
// Lab 1
// January 30, 2019

import java.util.Scanner;

public class problem3 {
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
		double gram; 
		
		System.out.println("This program will convert ounces to grams");
		System.out.print("Enter a value for ounces: ");
		double ounce = input.nextDouble();
		
		gram = 28.3495 * ounce ;
				
		System.out.println("There are "+ ounce + " ounces in " + gram + " grams.");
	}

}

