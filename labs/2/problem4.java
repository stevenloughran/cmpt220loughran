// Steven Loughran
// Lab 2
// 6 February 2019

import java.util.Scanner;

public class problem4 {

	public static void main(String[] args) {
		// ask for two characters
		Scanner input1 = new Scanner(System.in);
		
		System.out.print("Enter first character: ");
		String char1 = input1.nextLine();
		char ch1 = char1.charAt(0);
			
		Scanner input2 = new Scanner(System.in);				
		System.out.print("Enter second character: ");
		String char2 = input2.nextLine();
		char ch2 = char2.charAt(0);

		// adds the two characters then outputs 
		int results ;
		results = (ch1 + ch2); 
		System.out.println("Results is: " + results);
	}

}
