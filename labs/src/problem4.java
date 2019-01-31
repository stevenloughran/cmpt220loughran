// Steven Loughran
// Lab 1
// January 30, 2019

import java.util.Scanner;

public class problem4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double energy;
		double word = 299972458.0;
		
		System.out.println("This program will find the energy using E=m*c^2");
		System.out.print("Enter a value for mass (in Kilograms): ");
		double mass = input.nextDouble();
		
		energy = mass * Math.pow(word , 2);

		System.out.println("Energy is " + energy);
	}

}
