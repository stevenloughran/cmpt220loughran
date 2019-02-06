// Steven Loughran
// Lab 2
// 6 February 2019

import java.util.Scanner;

public class problem5 {

	public static void main(String[] args) {
		// ask for two strings
			Scanner input1 = new Scanner(System.in);
			
			System.out.print("Enter your first string: ");
			String string1 = input1.nextLine();
					
			Scanner input2 = new Scanner(System.in);				
			System.out.print("Enter your second string: ");
			String string2 = input1.nextLine();
		
			// put the two strings in alphabetical order
			if (string1.compareTo(string2) < 0) {
				System.out.print("Your strings in alphabetical order is: " + string1 + " , " + string2);
			} else {
				System.out.print("Your strings in alphabetical order is: " + string2 + " , " + string1);
			}
	}

}
