// Steven Loughran 
// Lab 3 problem 7
// 2 February 2019

// Write a Java program that prints the first 50 pentagonal numbers (10 per line). The
// program should use a method that takes an integer value n and prints the nth
// pentagonal number. The formula for the nth pentagonal number is: pn = 3n^2 - n / 2

public class problem7 {

	public static void main(String[] args) {
		// initialize count 
		int count = 1;
		
		//  gets the pentagonal number 1-50
		for(int i = 1; i <= 50; i++){
			System.out.printf("%-10d", getPentagonalNumber(i));
				if(count % 10 == 0) 
					System.out.println();
					count++;
		}
    }
		  
	public static int getPentagonalNumber(int i) {
		// does the equation in another method 
				return (i * (3 * i - 1)) / 2;
			}
		}
