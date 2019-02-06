// Steven Loughran
// Lab 2
// 6 February 2019

import java.util.Scanner;

public class problem1 {

	public static void main(String[] args) {
		// Ask for two number amounts
		Scanner input1 = new Scanner(System.in);
		System.out.print("Enter your first number: ");
		int number1 = input1.nextInt();
		
		Scanner input2 = new Scanner(System.in);
		System.out.print("Enter your second number: ");
		int number2 = input1.nextInt();
		
		// plug in numbers to see the output
		if (number1 < number2)
			System.out.println(number1 + " is less than " + number2 + "? true");
		else 
			System.out.println(number1 + " is less than " + number2 + "? false");
		
		if (number1 <= number2)
			System.out.println(number1 + " is less than and/ or equal to " + number2 + "? true");
		else 
			System.out.println(number1 + " is less than and/or equal to " + number2 + "? false");
		
		if (number1 == number2)
			System.out.println(number1 + " is equal to " + number2 + "? true");
		else 
			System.out.println(number1 + " is equal to " + number2 + "? false");
		
		if (number1 != number2)
			System.out.println(number1 + " is not equal to " + number2 + "? true");
		else 
			System.out.println(number1 + " is not equal too " + number2 + "? false");
		
		if (number1 > number2)
			System.out.println(number1 + " is more than " + number2 + "? true");
		else 
			System.out.println(number1 + " is more than " + number2 + "? false");
		
		if (number1 >= number2)
			System.out.println(number1 + " is more than and/or equal to " + number2 + "? true");
		else 
			System.out.println(number1 + " is more than or equal to " + number2 + "? false");
	}

}
