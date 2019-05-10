// Steven Loughran
// Problem 18.11
// May 7, 2019

import java.util.*;

public class Problem18_11 {
	static int sum;
	
	public static void main(String[] args) {
		try {
			System.out.print("Enter the number: ");
		
			Scanner input = new Scanner(System.in);
			String str = input.next();
			int num = Integer.parseInt(str);
			
			System.out.print("The sum is: " + sumDigits(num));
		}
		catch(Exception e) {
			System.out.println("Exception has occured. Program will exit.");
		}
	}

	public static int sumDigits(long n) {
		if (n > 0 ) {
			sum = sum + (int)n % 10;
			sumDigits(n/10);
		}
		return sum;
		}
	}

