// Steven Loughran  
// Lab 5 Problem 2
// 6 March 2019

//Write a Java program to calculate the mean and the standard deviation of a set of
//numbers. 
//To compute the standard deviation with this formula, you must store the individual
//numbers using an array, so they can be used after the mean is obtained.
//Your program should contain the following methods:
//		public static double deviation(double[] x)
//		public static double mean(double[] x)
//Write a test program that prompts the user to enter 10 numbers and displays the mean
//and standard deviation.

import java.text.DecimalFormat;
import java.util.Scanner;

public class problem2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter 10 numbers to find SD and Mean: ");
		
		double arr[] = new double[10];
		DecimalFormat sdFormat = new DecimalFormat("0.0000");

		for (int i = 0; i < 10; i++)
			arr[i] = input.nextDouble();
		
		System.out.println("Mean : " + mean(arr));
		System.out.println("Standard Deviation: " + sdFormat.format(deviation(arr)));
	}

	public static double mean(double[] x) {
		double sum = 0; 
		double mean = 0;
		
 		for (double n : x)    
			sum += n;
			mean = sum / x.length;
		return mean;
			}

	public static double deviation(double x[]) {
		double squareDiff = 0;
		double mean = mean(x);

		for (int i = 0; i < x.length; i++)
			squareDiff += (x[i] - mean) * (x[i] - mean);
		return Math.sqrt(squareDiff / (x.length - 1)); // JA
		}
	}
