// Steven Loughran  
// Lab 4 Problem 2
// 20 February 2019

// Write a Java program that prints a 5 by 5 matrix of randomly generated lower case
// letters.

import java.util.Random;

public class problem2 {

	public static void main(String[] args) {
		char matrix[][] = new char[5][5];
		Random rnd = new Random();
		 
		for (int i = 0; i < 5; i++) {
		for (int j = 0; j < 5; j++) {
			char c = (char)(rnd.nextInt(26) + 'a');
			matrix[i][j] = c; 
			System.out.print(matrix[i][j] + " ");
			}
			System.out.print("\n");
		}
	}
}