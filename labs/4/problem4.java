// Steven Loughran 
// Lab 4 Problem 4 
// 20 February 2019

// Write a Java program that reads a string of text and prints the number of occurrences of
// each character that appears in the text. Do not count white spaces or special symbols. 

import java.util.Scanner;

public class problem4 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string of text: ");
		String s = input.nextLine();
		
		int []count = new int[130];

		for(int i = 0 ; i < s.length() ; i++) {
			count[s.charAt(i)]++;
		}
		
		System.out.println("The amount of characters present are:");
		
		for (int i = 65 ; i < 124 ; i++) {
			if (count[i] != 0)
				System.out.println("The character " + (char)i +" occurs: " + count[i] + " time(s)");

		  }
	}

}
