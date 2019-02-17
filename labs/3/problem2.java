// Steven Loughran
// lab 3 problem 2
// 12 February 2019

// Write a Java program that prints all the numbers from 100 to 500 (10 per line) that are
// divisible by 5 or 7 but not both. Separate each number with a white space.

public class problem2 {

	public static void main(String[] args) {
			// displays 10 numbers per line 
			final int nums_line = 10;
			
			// counts the number of numbers divisible by 5 or 7
			int count = 0;	

			// tests numbers from 100 to 500
			for (int i = 100; i <= 500; i++) {
				
				// test if number is divisible by 5 and 6
				if (i % 5 == 0 ^ i % 7 == 0) { // JA
					count++;	// increment count
					
					// Test if numbers per line is 10 
					if (count % nums_line == 0) 
						System.out.println(i);
					else
						System.out.print(i + " ");		
				 }
			 }
		}
	}
