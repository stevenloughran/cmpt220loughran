// Steven Loughran 
// Lab 3 problem 5
// 2 February 2019

// Write a Java program that takes three numbers and prints the average. It should use a
// method with the following signature:
// public static double average(double a, double b, double c) 

import java.util.Scanner;

public class problem5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// tells user what program is about
		System.out.println("Enter three numbers to average.");

		// asks for first number
		System.out.print("First Number: ");
		double a = input.nextDouble();

		// asks for second number
		System.out.print("Second Number: ");
		double b = input.nextDouble();

		// ask for third number
		System.out.print("Third Number: ");
		double c = input.nextDouble();
		
		// prints output of average 
		System.out.print("The average for your three numbers are: " + average(a, b, c) + "\n" );
	}
		
	public static double average(double a, double b, double c) {
		
		// returns value of all three numbers divided by 3
		return (a + b + c) / 3;
			}
		}