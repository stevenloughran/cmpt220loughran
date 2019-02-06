// Steven Loughran
// Lab 2
// 6 February 2019

import java.util.Scanner;
import java.lang.Math;

public class problem3 {

	public static void main(String[] args) {
		// Ask for two number amounts
			Scanner input1 = new Scanner(System.in);
			System.out.print("Enter your first lower limit integer: ");
			int number1 = input1.nextInt();
				
			Scanner input2 = new Scanner(System.in);				
			System.out.print("Enter your second upper limit integer: ");
			int number2 = input1.nextInt();

		// calculate the integers between the two values
			int random1 ;
			int random2 ;
			int random3 ;
		
		 random1 = (int)(Math.random() * (number2 - number1)) + number1;
		 random2 = (int)(Math.random() * (number2 - number1)) + number1;
		 random3 = (int)(Math.random() * (number2 - number1)) + number1;
		 System.out.println("Your three integers are " + random1 + " , " + random2 + " , " + random3);
		 
	}

}
