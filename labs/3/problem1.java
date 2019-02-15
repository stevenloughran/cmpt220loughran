// Steven Loughran 
// lab 3 problem 1
// 12 February 2019

import java.util.Scanner;

public class problem1 {

	public static void main(String[] args) {
		Scanner input1 = new Scanner(System.in);
		// initializes all variables 
		int numbers;
		int sum = 0;
		int total = 0;
		int even = 0 ;
		int avg; 
		
		// asks the user for input
		System.out.print("Enter a positive integer, the input ends with a 0: ");
		
		
		do {
		numbers = input1.nextInt();
		int i = 0; 
			
		// gets the total sum and the average of all the integers
		sum += numbers;
		total++;
		avg = sum / total;
		
		// checks to see if numbers are even
		if (numbers % 2 == 0 && numbers != 0)
	             even++;
	    
		// if the numbers are not equal to 0 the displays results
		} while (numbers != 0);
			System.out.println("The number of even integers: " + even );
			System.out.println("The total sum: " + sum);
			System.out.println("The average is: " + avg);
				
	}

}
