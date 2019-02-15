// Steven Loughran 
// Lab 3 problem 3
// 2 February 2019

// Write a Java program that prints the characters corresponding to the ASCII codes 50 to
// 100. Print 20 characters per line.

public class problem3 {

	public static void main(String[] args) {
		// makes sure each line have 20 char
		final int nums_line = 20;
		
		// we want the chars from 50 to 100
		for (int i = 50; i <= 100; i++) {
			// displays those chars
			System.out.print((char)i);
		
		// tests if numbers are 20 per line
		if ((i - 49) % nums_line == 0) 
			System.out.println();
		}
	}
}