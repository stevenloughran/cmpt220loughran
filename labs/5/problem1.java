// Steven Loughran  
// Lab 5 Problem 1
// 6 March 2019

//Write a method that finds the largest element in an array of double values with the
//following header:
//public static double max(double[] array)
//Write a program that prompts the user to enter 10 numbers, invokes this method to
//return the maximum value, and displays the maximum value. 

import java.util.Scanner;

public class problem1 {
	
		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			double array[] = new double[10];

			System.out.println("Enter you 10 numbers to find the largest: ");

			for(int i = 0; i < array.length; i++) {
				array[i] = input.nextInt();
			}
			System.out.println("The maximum number is : " + max(array));
			}

			public static double max(double[] array) {
				double max = array[0];

			for(int i = 0; i < array.length; i++) {
				if(max < array[i])
					max = array[i];
			}
			return max;
	}
} 